package com.agendamento_medico.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agendamento_medico.domain.model.Atendimento;

/**
 * Interface que estende {@link JpaRepository} para persistência de {@link Atendimento}.
 * 
 * @see JpaRepository
 * @see Atendimento
 */
@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
}
