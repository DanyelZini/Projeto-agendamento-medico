package com.agendamento_medico.controller.dtos;

import java.sql.Date;
import java.util.Optional;

import com.agendamento_medico.domain.model.Atendimento;


/**
 * Classe que representa o objeto de transferência de dados da entidade <strong>Atendimento</strong>.
 * 
 * @see PacienteDto
 * @see MedicoDto
 * @see Atendimento
 */
public record AtendimentoDto(Long id, Date data, String status, String descricao, PacienteDto paciente, MedicoDto medico) {
    
    /**
     * Contrutor que cria um objeto de transferência de dados com base em um modelo de entidade.
     * 
     * @param model
     */
    public AtendimentoDto(Atendimento model) {
        this(model.getId(), 
        model.getData(), 
        model.getStatus(), 
        model.getDescricao(), 
        Optional.ofNullable(model.getPaciente()).map(PacienteDto::new).orElse(null),
        Optional.ofNullable(model.getMedico()).map(MedicoDto::new).orElse(null));
    }

    /**
     * Funcao que converte um objeto de transferência de dados para um modelo de entidade.
     * 
     * @return Atendimento
     */
    public Atendimento toModel() {
        Atendimento atendimento = new Atendimento();
        atendimento.setId(this.id());
        atendimento.setData(this.data());
        atendimento.setStatus(this.status());
        atendimento.setDescricao(this.descricao());
        atendimento.setPaciente(Optional.ofNullable(this.paciente).map(PacienteDto::toModel).orElse(null));
        atendimento.setMedico(Optional.ofNullable(this.medico).map(MedicoDto::toModel).orElse(null));
        return atendimento;
    }

}
