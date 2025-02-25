# Documentação dos Itens Utilizados

Este documento explica os principais itens utilizados nos arquivos dentro da pasta `Impl`.

## Anotações

### @Autowired

A anotação `@Autowired` é usada para injeção de dependência automática no Spring. Ela permite que o Spring resolva e injete beans colaborativos em nosso bean.

Exemplo:
```java
@Autowired
private AtendimentoRepository atendimentoRepository;
```

### @Transactional

A anotação `@Transactional` é usada para gerenciar transações no Spring. Ela pode ser aplicada a métodos ou classes para garantir que as operações de banco de dados sejam executadas dentro de uma transação.

#### Propriedades Comuns

- `readOnly`: Define se a transação é somente leitura. Usado para otimizar operações de leitura.
- `rollbackFor`: Define quais exceções devem causar o rollback da transação.

Exemplo:
```java
@Transactional(readOnly = true)
public List<Atendimento> findAll() {
    return this.atendimentoRepository.findAll();
}
```

### @Service

A anotação `@Service` é uma especialização da anotação `@Component`, indicando que uma classe é um "Service" (serviço), originalmente definido pelo padrão de design Service Layer. É usada para marcar a classe como um bean do Spring que contém a lógica de negócios.

Exemplo:
```java
@Service
public class AtendimentoServiceImpl implements AtendimentoService {
    // ...code...
}
```

### @Override

A anotação `@Override` é usada para indicar que um método está sobrescrevendo um método da superclasse ou implementando um método de uma interface. Ajuda a garantir que estamos realmente sobrescrevendo um método e não criando um novo método por engano.

Exemplo:
```java
@Override
public List<Atendimento> findAll() {
    return this.atendimentoRepository.findAll();
}
```

## Exceções Personalizadas

### AtendimentoException

Exceção personalizada para erros relacionados a atendimentos.

### NotFoundException

Exceção personalizada para indicar que um recurso não foi encontrado.

## Repositórios

### AtendimentoRepository

Interface que estende `JpaRepository` para fornecer operações CRUD para a entidade `Atendimento`.

## Entidades

### Atendimento

Classe que representa a entidade `Atendimento` no banco de dados.

## Serviços

### AtendimentoService

Interface que define os métodos de serviço para a entidade `Atendimento`.

### AtendimentoServiceImpl

Implementação da interface `AtendimentoService`.

## Explicações Adicionais

### Optional.ofNullable(entity).orElseThrow(() -> new AtendimentoException("Atendimento nao pode ser nulo"))

#### Optional

`Optional` é uma classe contêiner que pode ou não conter um valor não nulo. É usada para evitar `NullPointerException` e para expressar explicitamente que um valor pode estar ausente.

#### ofNullable

O método `ofNullable` cria um `Optional` a partir de um valor que pode ser nulo. Se o valor for nulo, um `Optional` vazio será criado.

Exemplo:
```java
Optional<Atendimento> optionalAtendimento = Optional.ofNullable(atendimento);
```

#### orElseThrow

O método `orElseThrow` retorna o valor contido no `Optional` se estiver presente; caso contrário, lança a exceção fornecida.

Exemplo:
```java
Atendimento atendimento = Optional.ofNullable(entity)
    .orElseThrow(() -> new AtendimentoException("Atendimento nao pode ser nulo"));
```

Neste exemplo, se `entity` for nulo, uma `AtendimentoException` será lançada com a mensagem "Atendimento nao pode ser nulo".

