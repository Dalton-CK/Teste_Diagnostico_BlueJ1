# Teste diagnóstico de Java e Programação Orientada a Objetos

## Explorador Galáctico

A Agência Espacial Escolar precisa de uma aplicação simples para gerir os seus exploradores. Cada explorador possui equipamento próprio e só pode aceitar uma missão quando cumpre todas as condições exigidas.

O objetivo é implementar a classe `ExploradorGalactico` e uma classe `Teste` no BlueJ.

## 1. Classe ExploradorGalactico

Cria uma classe chamada `ExploradorGalactico` com os seguintes atributos privados:

- `nomeCodigo`, do tipo `String`;
- `planetaOrigem`, do tipo `String`;
- `nivel`, do tipo `int`;
- `energia`, do tipo `int`;
- `ativo`, do tipo `boolean`;
- `equipamentos`, do tipo `ArrayList<String>`.

O atributo `equipamentos` guarda os nomes dos equipamentos que o explorador leva para as missões.

## 2. Construtores

Implementa dois construtores:

1. Um construtor sem parâmetros que cria um explorador com os seguintes valores:
   - nome de código: `Sem nome`;
   - planeta de origem: `Terra`;
   - nível: `1`;
   - energia: `100`;
   - ativo: `true`;
   - lista de equipamentos vazia.

2. Um construtor que recebe `nomeCodigo`, `planetaOrigem`, `nivel`, `energia` e `ativo`. A lista de equipamentos deve ser criada vazia dentro do construtor.

Sempre que possível, evita repetir código entre os dois construtores.

## 3. Métodos de acesso

Implementa os métodos `get` e `set` necessários para todos os atributos simples.

Aplica as seguintes validações:

- o nome de código e o planeta de origem não podem ser nulos nem vazios;
- o nível não pode ser inferior a `1`;
- a energia deve estar entre `0` e `100`;
- não deve existir um método `setEquipamentos` que substitua diretamente toda a lista.

## 4. Gestão do equipamento

Implementa os seguintes métodos:

```java
public boolean adicionarEquipamento(String equipamento)
public boolean temEquipamento(String equipamento)
```

Regras:

- não podem ser adicionados nomes nulos ou vazios;
- o mesmo equipamento não pode ser adicionado duas vezes;
- a pesquisa deve ignorar diferenças entre maiúsculas e minúsculas;
- os métodos devem devolver `true` quando a operação é realizada e `false` quando não é possível realizá-la.

Exemplo: se existir `Scanner`, a pesquisa por `scanner` deve devolver `true`.

## 5. Decisão sobre uma missão

Implementa o método:

```java
public boolean podeAceitarMissao(
    String equipamentoObrigatorio,
    int nivelMinimo,
    int custoEnergia
)
```

O explorador só pode aceitar a missão quando todas as condições seguintes são verdadeiras:

- está ativo;
- possui o equipamento obrigatório;
- tem um nível igual ou superior ao nível mínimo;
- possui energia igual ou superior ao custo da missão;
- o custo de energia é superior a zero.

## 6. Execução da missão

Implementa o método:

```java
public boolean executarMissao(
    String equipamentoObrigatorio,
    int nivelMinimo,
    int custoEnergia
)
```

Este método deve:

1. verificar se a missão pode ser aceite;
2. devolver `false` sem alterar o objeto quando alguma condição não for cumprida;
3. descontar o custo à energia quando a missão for aceite;
4. aumentar o nível em uma unidade;
5. devolver `true` após uma execução bem-sucedida.

## 7. Método toString

Redefine o método `toString()` para devolver uma descrição legível do explorador, incluindo todos os atributos e a lista de equipamentos.

## 8. Classe Teste

Cria uma classe chamada `Teste` com um método `main`.

A classe deve testar, pelo menos, as seguintes situações:

1. criação de um explorador com o construtor sem parâmetros;
2. criação de um explorador com o construtor completo;
3. alteração de valores através dos setters;
4. tentativa de atribuição de valores inválidos;
5. adição de dois equipamentos;
6. tentativa de adicionar um equipamento repetido;
7. pesquisa de um equipamento usando letras maiúsculas ou minúsculas diferentes;
8. remoção de um equipamento existente e de um inexistente;
9. aceitação de uma missão válida;
10. recusa de uma missão por falta de energia;
11. recusa de uma missão por falta do equipamento obrigatório;
12. confirmação de que a energia diminuiu e o nível aumentou após a missão;
13. apresentação do objeto através de `toString()`.

## 9. Entrega

O projeto deve conter:

- `ExploradorGalactico.java`;
- `Teste.java`;
- `.gitignore`;
- os ficheiros internos criados pelo BlueJ, quando necessários para abrir o projeto localmente.

Não devem ser entregues ficheiros `.class`.

## 10. Critérios observados

- declaração e encapsulamento de atributos;
- utilização de `ArrayList`;
- construtores e reutilização de código;
- getters e setters com validação;
- estruturas condicionais e operadores lógicos;
- métodos com parâmetros e valores de retorno;
- pesquisa e alteração de elementos de uma coleção;
- redefinição de `toString()`;
- criação de testes e análise dos resultados;
- organização e legibilidade do código.
