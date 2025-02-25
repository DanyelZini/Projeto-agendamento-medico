# Documentação dos Itens Utilizados

Este documento explica os principais itens utilizados nos arquivos dentro da pasta `dtos`.

## O que é um objeto `record`?

Um `record` em Java é uma forma concisa de declarar uma classe que é usada principalmente para transportar dados. Ele automaticamente gera métodos como `equals`, `hashCode`, `toString` e os getters para os campos definidos. Isso reduz a quantidade de código boilerplate que você precisa escrever.

## Descrição dos Arquivos

### ProntuarioDto.java

Representa o objeto de transferência de dados da entidade `Prontuario`. Contém métodos para converter entre o DTO e o modelo de entidade.

### PacienteDto.java

Representa o objeto de transferência de dados da entidade `Paciente`. Contém métodos para converter entre o DTO e o modelo de entidade, incluindo o DTO de `Prontuario`.

### MedicoDto.java

Representa o objeto de transferência de dados da entidade `Medico`. Contém métodos para converter entre o DTO e o modelo de entidade, incluindo o DTO de `Especialidade`.

### EspecialidadeDto.java

Representa o objeto de transferência de dados da entidade `Especialidade`. Contém métodos para converter entre o DTO e o modelo de entidade.

### AtendimentoDto.java

Representa o objeto de transferência de dados da entidade `Atendimento`. Contém métodos para converter entre o DTO e o modelo de entidade, incluindo os DTOs de `Paciente` e `Medico`.

