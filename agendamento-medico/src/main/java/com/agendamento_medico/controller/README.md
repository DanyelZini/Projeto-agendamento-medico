# Documentação dos Itens Utilizados

Este documento explica os principais itens utilizados nos arquivos dentro da pasta `controller`.

## Descrição dos Arquivos

Desenvolvendo a classe responsavel por controllar os atendimentos.

## Anotações

### @RestController

Indica que a classe é um controlador REST, permitindo que ela manipule requisições HTTP e retorne respostas JSON.

### @RequestMapping("/atendimento")

Define a rota base para os endpoints deste controlador. Todas as requisições para `/atendimento` serão mapeadas para esta classe.

### @Autowired

Injeta automaticamente a dependência do serviço `AtendimentoServiceImpl` na classe `AtendimentoController`.

### @GetMapping

Anotação para mapear requisições HTTP GET para métodos específicos. Utilizada para recuperar recursos.

### @GetMapping("/{id}")

Anotação para mapear requisições HTTP GET com um parâmetro de caminho (`id`) para métodos específicos. Utilizada para recuperar um recurso específico pelo ID.

### @PostMapping

Anotação para mapear requisições HTTP POST para métodos específicos. Utilizada para criar novos recursos.

### @PutMapping("/{id}")

Anotação para mapear requisições HTTP PUT com um parâmetro de caminho (`id`) para métodos específicos. Utilizada para atualizar recursos existentes.

### @DeleteMapping("/{id}")

Anotação para mapear requisições HTTP DELETE com um parâmetro de caminho (`id`) para métodos específicos. Utilizada para deletar recursos específicos pelo ID.

## Classes e Interfaces

### AtendimentoController

Classe principal que gerencia as requisições HTTP relacionadas aos atendimentos médicos.

### AtendimentoDto

Classe de transferência de dados utilizada para transferir dados entre a camada de apresentação e a camada de serviço.

### Atendimento

Classe de modelo que representa um atendimento médico.

### AtendimentoServiceImpl

Classe de serviço que implementa a lógica de negócios para as operações de CRUD nos atendimentos.

## Explicações Adicionais

A classe `AtendimentoController` é responsável por expor os endpoints da API REST para operações de CRUD relacionadas aos atendimentos médicos. Ela utiliza o serviço `AtendimentoServiceImpl` para realizar a lógica de negócios e a classe `AtendimentoDto` para transferir dados entre a camada de apresentação e a camada de serviço. As anotações Spring, como `@RestController`, `@RequestMapping`, `@Autowired`, `@GetMapping`, `@PostMapping`, `@PutMapping` e `@DeleteMapping`, são usadas para configurar o comportamento do controlador e mapear as requisições HTTP para os métodos apropriados.