package com.agendamento_medico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendamento_medico.controller.dtos.AtendimentoDto;
import com.agendamento_medico.domain.model.Atendimento;
import com.agendamento_medico.service.Impl.AtendimentoServiceImpl;

/**
 * Classe que representa o controlador de atendimentos.
 * 
 * @see Atendimento
 * @see AtendimentoDto
 * @see AtendimentoServiceImpl
 */
@RestController
@RequestMapping("/atendimento")
public class AtendimentoController {
    
    /**
     * Serviço de atendimento.
     */
    @Autowired
    private AtendimentoServiceImpl atendimentoServiceImpl;

    /**
     * Função que retorna todos os atendimentos.
     * 
     * @return ResponseEntity>List>AtendimentoDto>>
     */
    @GetMapping
    public ResponseEntity<List<AtendimentoDto>> findAll() {
        var _atendimentos = atendimentoServiceImpl.findAll();
        var _atendimentosDtos = _atendimentos.stream().map(AtendimentoDto::new).toList();
        return ResponseEntity.ok(_atendimentosDtos);
    }

    /**
     * Função que retorna um atendimento por id.
     * 
     * @param id
     * @return ResponseEntity>Atendimento>
     */
    @GetMapping("/{id}")
    public ResponseEntity<Atendimento> findById(@PathVariable Long id) {
        var _atendimento = atendimentoServiceImpl.findById(id);
        return ResponseEntity.ok(new AtendimentoDto(_atendimento).toModel());
    }

    /**
     * Função que cria um atendimento.
     * 
     * @param atendimentoDto
     * @return ResponseEntity>Atendimento>
     */
    @PostMapping
    public ResponseEntity<Atendimento> create (@RequestBody AtendimentoDto atendimentoDto) {
        var _atendimento = atendimentoServiceImpl.create(atendimentoDto.toModel());
        return ResponseEntity.ok(new AtendimentoDto(_atendimento).toModel());
    }

    /**
     * Função que atualiza um atendimento.
     * 
     * @param id
     * @param atendimentoDto
     * @return ResponseEntity>Atendimento>
     */
    @PutMapping("/{id}")
    public ResponseEntity<Atendimento> update(@PathVariable Long id, @RequestBody AtendimentoDto atendimentoDto) {
        var _atendimento = atendimentoServiceImpl.update(id, atendimentoDto.toModel());
        return ResponseEntity.ok(new AtendimentoDto(_atendimento).toModel());
    }

    /**
     * Função que deleta um atendimento por id.
     * 
     * @param id
     * @return ResponseEntity>Void>
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        atendimentoServiceImpl.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
