package com.agendamento_medico.controller.dtos;

import com.agendamento_medico.domain.model.Especialidade;

/**
 * Classe que representa o objeto de transferência de dados da entidade <strong>Especialidade</strong>.
 * 
 * @see Especialidade
 */
public record EspecialidadeDto(Long id, String nome, String descricao) {

    /**
     * Contrutor que cria um objeto de transferência de dados com base em um modelo de entidade.
     * 
     * @param model
     */
    public EspecialidadeDto(Especialidade model) {
        this(model.getId(), model.getNome(), model.getDescricao());
    }

    /**
     * Funcao que converte um objeto de transferência de dados para um modelo de entidade.
     * 
     * @return Especialidade
     */
    public Especialidade toModel() {
        Especialidade especialidade = new Especialidade();
        especialidade.setId(this.id());
        especialidade.setNome(this.nome());
        especialidade.setDescricao(this.descricao());
        return especialidade;
    }
}
