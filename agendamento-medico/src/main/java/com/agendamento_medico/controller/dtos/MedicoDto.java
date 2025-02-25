package com.agendamento_medico.controller.dtos;

import java.util.Optional;

import com.agendamento_medico.domain.model.Medico;

/**
 * Classe que representa o objeto de transferência de dados da entidade <strong>Medico</strong>.
 * 
 * @see Medico
 */
public record MedicoDto(Long id, String nome, String telefone, String email, EspecialidadeDto especialidade) {
    
    /**
     * Contrutor que cria um objeto de transferência de dados com base em um modelo de entidade.
     * 
     * @param model
     */
    public MedicoDto(Medico model) {
        this(
            model.getId(), 
            model.getNome(), 
            model.getTelefone(), 
            model.getEmail(), 
            Optional.ofNullable(model.getEspecialidade()).map(EspecialidadeDto::new).orElse(null)
            );
    }

    /**
     * Funcao que converte um objeto de transferência de dados para um modelo de entidade.
     * 
     * @return Medico
     */
    public Medico toModel() {
        Medico medico = new Medico();
        medico.setId(this.id());
        medico.setNome(this.nome());
        medico.setTelefone(this.telefone());
        medico.setEmail(this.email());
        medico.setEspecialidade(Optional.ofNullable(this.especialidade).map(EspecialidadeDto::toModel).orElse(null));
        return medico;
    }
    
}
