# Documentação dos Itens Utilizados

Este documento explica os principais itens utilizados nos arquivos dentro da pasta `exception`.

## Anotações

### @RestControllerAdvice
Anotação que indica que a classe fornece tratamento global de exceções para todos os controladores REST.

### @ExceptionHandler
Anotação usada para definir o método que lida com uma exceção específica. Pode ser aplicada a métodos em classes anotadas com `@ControllerAdvice` ou `@RestControllerAdvice`.

## Classes e Interfaces

### Logger
Interface da biblioteca SLF4J usada para registrar mensagens de log. Permite registrar informações, avisos, erros, etc. É utilizada para monitorar e depurar a aplicação, registrando eventos importantes que ocorrem durante a execução.

### LoggerFactory
Classe da biblioteca SLF4J usada para criar instâncias de `Logger`. Através do método estático `getLogger(Class<?> clazz)`, é possível obter um logger configurado para a classe especificada, permitindo a geração de logs específicos para essa classe.

### IllegalArgumentException
Exceção lançada para indicar que um método recebeu um argumento inválido.

### NoSuchElementException
Exceção lançada para indicar que um elemento solicitado não pôde ser encontrado.

### Throwable
Classe pai de todas as exceções e erros em Java. Pode ser usada para capturar qualquer tipo de exceção ou erro.

## Explicações Adicionais

### Métodos de Tratamento de Exceções

#### handleBusinessException
Método que trata exceções do tipo `IllegalArgumentException`. Retorna uma resposta HTTP com status `422 Unprocessable Entity` e a mensagem da exceção.

#### handleNotFoundException
Método que trata exceções do tipo `NoSuchElementException`. Retorna uma resposta HTTP com status `404 Not Found` e uma mensagem indicando que o recurso não foi encontrado.

#### handleUnexpectedException
Método que trata exceções do tipo `Throwable`. Retorna uma resposta HTTP com status `500 Internal Server Error` e uma mensagem genérica de erro. Também registra a exceção nos logs para análise posterior.

