package com.agendamento_medico.service;

import java.util.List;

/**
 * <strong> CRUD </strong> (Create, Read, Update, Delete) service interface.
 *
 * @param <T> Tipo da entidade
 * @param <ID> Tipo do identificador da entidade
 */
public interface CrudService<T, ID> {
    /**
     * Retorna todas as entidades.
     *
     * @return retorna a lista de todas as entidades.
     */
    List<T> findAll();

    /**
     * Retorno da entidade identificada.
     *
     * @param id identificador da entidade
     * @return retorna a entidade identificada
     */
    T findById(ID id);

    /**
     * Cria uma nova entidade.
     *
     * @param entity A entidade a ser criada
     * @return retorna a entidade criada
     */
    T create(T entity);

    /**
     * Atualiza uma entidade existente.
     *
     * @param id identificador da entidade a ser atualizada
     * @param entity A entidade atualizada
     * @return retorna a entidade atualizada
     */
    T update(ID id, T entity);

    /**
     * Deleta a entidade identificada.
     *
     * @param id identificador da entidade a ser deletada
     */
    void deleteById(ID id);
}
