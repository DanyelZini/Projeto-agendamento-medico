package com.agendamento_medico.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agendamento_medico.domain.model.Atendimento;
import com.agendamento_medico.domain.repository.AtendimentoRepository;
import com.agendamento_medico.service.AtendimentoService;
import com.agendamento_medico.service.exception.AtendimentoException;
import com.agendamento_medico.service.exception.NotFoundException;

/**
 * Implementação do serviço de atendimento.
 * 
 * @since 1.0.0
 * 
 * @author Danyel Zini
 * 
 * @see AtendimentoService
 * @see Atendimento
 * @see AtendimentoRepository
 * @see AtendimentoException
 * @see NotFoundException
 */

@Service
public class AtendimentoServiceImpl implements AtendimentoService{

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    /**
     * Retorna todos os atendimentos.
     * 
     * @return lista de atendimentos
     */
    @Transactional(readOnly = true)
    @Override
    public List<Atendimento> findAll() {
        return this.atendimentoRepository.findAll();
    }

    /**
     * Retorna um atendimento pelo ID.
     * 
     * @param id ID do atendimento
     * @return atendimento encontrado
     * @throws NotFoundException se o atendimento não for encontrado
     */
    @Transactional(readOnly = true)
    @Override
    public Atendimento findById(Long id) {
        return this.atendimentoRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    /**
     * Cria um novo atendimento.
     * 
     * @param entity entidade do atendimento
     * @return atendimento criado
     * @throws AtendimentoException se o atendimento, paciente ou médico forem nulos
     */
    @Transactional
    @Override
    public Atendimento create(Atendimento entity) {
        Optional.ofNullable(entity).orElseThrow(() -> new AtendimentoException("Atendimento nao pode ser nulo"));
        Optional.ofNullable(entity.getPaciente()).orElseThrow(() -> new AtendimentoException("Paciente nao pode ser nulo"));
        Optional.ofNullable(entity.getMedico()).orElseThrow(() -> new AtendimentoException("Medico nao pode ser nulo"));

        return this.atendimentoRepository.save(entity);
    }

    /**
     * Atualiza um atendimento existente.
     * 
     * @param id ID do atendimento
     * @param entity entidade do atendimento
     * @return atendimento atualizado
     * @throws AtendimentoException se o ID do atendimento não corresponder ao ID do objeto enviado
     */
    @Transactional
    @Override
    public Atendimento update(Long id, Atendimento entity) {
        Atendimento atendimento = this.findById(id);

        if (!atendimento.getId().equals(entity.getId())) {
            throw new AtendimentoException("ID do atendimento não corresponde ao ID do objeto enviado");
        }

        atendimento.setData(entity.getData());
        atendimento.setStatus(entity.getStatus());
        atendimento.setDescricao(entity.getDescricao());
        atendimento.setPaciente(entity.getPaciente());
        atendimento.setMedico(entity.getMedico());
        
        return this.atendimentoRepository.save(atendimento);
    }

    /**
     * Deleta um atendimento pelo ID.
     * 
     * @param id ID do atendimento
     */
    @Transactional
    @Override
    public void deleteById(Long id) {
        this.atendimentoRepository.delete(this.findById(id));
    }
    
}
