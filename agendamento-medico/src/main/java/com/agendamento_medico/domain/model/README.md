# Documentação dos Itens Utilizados

Este documento explica os principais itens utilizados nos arquivos dentro da pasta `model`.

## Anotações

### @Entity
Indica que a classe é uma entidade JPA (Java Persistence API) e será mapeada para uma tabela no banco de dados.

### @Id
Especifica o identificador da entidade, que será a chave primária no banco de dados.

### @GeneratedValue
Configura a estratégia de geração automática do valor do identificador. Por exemplo, `GenerationType.IDENTITY` indica que o banco de dados gerará automaticamente o valor do identificador.

### @Column
Especifica os detalhes da coluna que será mapeada para o campo da entidade. Pode definir se a coluna é obrigatória (`nullable = false`) ou se deve ser única (`unique = true`).

### @OneToOne
Define um relacionamento um-para-um entre duas entidades. A anotação `cascade = CascadeType.ALL` indica que todas as operações (persistência, remoção, etc.) serão propagadas para a entidade relacionada.

### @ManyToOne
Define um relacionamento muitos-para-um entre duas entidades.

### @OneToMany
Define um relacionamento um-para-muitos entre duas entidades.

### @ManyToMany
Define um relacionamento muitos-para-muitos entre duas entidades.

## Explicações Adicionais

### CascadeType.ALL
Esta configuração indica que todas as operações de persistência (como `PERSIST`, `MERGE`, `REMOVE`, `REFRESH`, `DETACH`) serão propagadas para a entidade relacionada. Isso significa que, por exemplo, ao salvar ou deletar uma entidade pai, a operação será automaticamente aplicada à entidade filha.

### GenerationType.IDENTITY
Esta estratégia de geração de identificador indica que o banco de dados é responsável por gerar o valor do identificador automaticamente. Normalmente, isso é feito usando colunas auto-incrementadas.

### @Column(nullable = false)
Esta configuração indica que a coluna correspondente no banco de dados não pode conter valores nulos, ou seja, é obrigatória.

### @Column(unique = true)
Esta configuração indica que os valores na coluna correspondente devem ser únicos em toda a tabela, ou seja, não pode haver duplicatas.