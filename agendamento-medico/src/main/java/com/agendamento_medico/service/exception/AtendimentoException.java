package com.agendamento_medico.service.exception;

/**
 * <p> <strong> Extensao de RuntimeException </strong> </p>
 * <a> Implementacao de excecao personalizada para Atendimento </a>
 * 
 * @param message Mensagem de erro
 */
public class AtendimentoException extends RuntimeException {

    /**
     * Construtor de AtendimentoException
     * @param message Mensagem de erro
     */
    public AtendimentoException(String message) {
        super(message);
    }    
}
