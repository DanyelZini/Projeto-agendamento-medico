package com.agendamento_medico.controller.dtos;

import java.sql.Date;
import java.util.Optional;

import com.agendamento_medico.domain.model.Paciente;

/**
 * Classe que representa o objeto de transferência de dados da entidade <strong>Paciente</strong>.
 * 
 * @see Paciente
 */
public record PacienteDto(Long id, String nome, String telefone, String email, Date dataNascimento, ProntuarioDto prontuario) {

    /**
     * Contrutor que cria um objeto de transferência de dados com base em um modelo de entidade.
     * 
     * @param model
     */
    public PacienteDto(Paciente model) {
        this(model.getId(), 
        model.getNome(), 
        model.getTelefone(), 
        model.getEmail(), 
        model.getDataNascimento(),
        Optional.ofNullable(model.getProntuario()).map(ProntuarioDto::new).orElse(null)
        );
    }

    /**
     * Funcao que converte um objeto de transferência de dados para um modelo de entidade.
     * 
     * @return Paciente
     */
    public Paciente toModel() {
        Paciente paciente = new Paciente();
        paciente.setId(this.id());
        paciente.setNome(this.nome());
        paciente.setTelefone(this.telefone());
        paciente.setEmail(this.email()); 
        paciente.setDataNascimento(this.dataNascimento());
        paciente.setProntuario(Optional.ofNullable(this.prontuario).map(ProntuarioDto::toModel).orElse(null));
        return paciente;
    }

}
