package com.agendamento_medico.service.exception;

/**
 * <p><strong> Extensao de AtendimentoException </strong> </p>
 * <a> Implementacao de excecao personalizada para Not Found </a>
 */
public class NotFoundException extends AtendimentoException {

    /**
     * Construtor de NotFoundException
     * <p> Mensagem de erro: "Solicitacao nao encontrada!"" </p>
     */
    public NotFoundException() {
        super("Solicitacao nao encontrada!");
    }
    
}
