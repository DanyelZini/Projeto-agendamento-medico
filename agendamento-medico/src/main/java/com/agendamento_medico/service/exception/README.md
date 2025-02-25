# Documentação dos Itens Utilizados

Este documento explica os principais itens utilizados nos arquivos dentro da pasta `exception`.

## Exceções Personalizadas

### AtendimentoException

Exceção personalizada para erros relacionados a atendimentos, possibilitando a inserção da mensagem desejada.

```java
AtendimentoException atendimento = new AtendimentoException("Erro na inserção de dados!");
```

#### Detalhes da Implementação

A classe `AtendimentoException` herda da classe `RuntimeException`, permitindo o retorno de erros específicos relacionados a atendimentos.

### NotFoundException

Exceção personalizada para indicar que um recurso não foi encontrado. A mensagem de retorno padrão é: "Solicitação não encontrada!"

```java
throw new NotFoundException();
```

#### Detalhes da Implementação

A classe `NotFoundException` herda da classe `AtendimentoException` e utiliza uma mensagem de erro estática.

## Explicações Adicionais

- **AtendimentoException**: Herda de `RuntimeException` e permite a inserção de uma mensagem de erro personalizada.
- **NotFoundException**: Herda de `AtendimentoException` e utiliza uma mensagem de erro padrão "Solicitação não encontrada!".