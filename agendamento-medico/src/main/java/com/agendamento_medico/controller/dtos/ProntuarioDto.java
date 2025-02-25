package com.agendamento_medico.controller.dtos;

import com.agendamento_medico.domain.model.Prontuario;

/**
 * Classe que representa o objeto de transferência de dados da entidade <strong>Prontuario</strong>.
 * 
 * @see Prontuario
 */
public record ProntuarioDto(Long id, String historico, String medicamento, String alergias) {
    
    /**
     * Contrutor que cria um objeto de transferência de dados com base em um modelo de entidade.
     * 
     * @param model
     */
    public ProntuarioDto(Prontuario model) {
        this(
            model.getId(), 
            model.getHistoricoMedico(), 
            model.getMedicamento(), 
            model.getAlergias()
            );
    }

    /**
     * Funcao que converte um objeto de transferência de dados para um modelo de entidade.
     * 
     * @return Prontuario
     */
    public Prontuario toModel() {
        Prontuario prontuario = new Prontuario();
        prontuario.setId(id);
        prontuario.setHistoricoMedico(historico);
        prontuario.setMedicamento(medicamento);
        prontuario.setAlergias(alergias);
        return prontuario;
    }
}
