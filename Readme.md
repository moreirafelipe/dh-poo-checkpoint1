# Readme

## Formação Certfied Tech Developer - Digital House Brasil



### Projeto de avaliação - Checkpoint 1

### Disciplina: **Programação Orientada a Objetos** - Java



#### Integrantes:

[**Felipe Moreira**](https://github.com/FlipeFrontDev)

<u>**[Tânia Rita](https://github.com/taniarita)**</u>



#### **Cenário da aplicação**

A proposta é a criação de um sistema que vai reduzir o problema da desorganização de dados enfrentado por muitas instituições de ensino. A desorganização dificulta a tarefa de armazenamento dos dados, bem como a consulta das informações geradas por eles. Ao centralizar todas as informações relevantes ao contexto de aplicação - no caso, um colégio - o sistema vai possibilitar a melhoria dos processos de gestão, inclusão de dados de alunos e professores, e a otimização do tempo dos funcionários da instituição.



#### **Diagrama de classes:**



![img](https://i.imgur.com/rqv9z0K.png)



#### **Proposta de solução**

Trata-se de um sistema genérico de cadastro e consulta que pode ser aplicado a diversos contextos. No caso em questão, serve para armazenar dados de Alunos, suas médias e faltas; dados de Professores e Turmas - possibilitando articular o tipo de relação existente entre esses dados. Por exemplo, é possível cadastrar as classes Aluno e Professor pelo atributo do nome, que têm seus id 's auto incrementados. A partir disso, em Aluno, pode-se cadastrar e consultar as médias, faltas e Turma pelo id, e em Professor, o atributo auto incrementado possibilita a consulta da Turma. 
As disciplinas estão disponibilizadas em forma de array e possuem seus respectivos id 's fixos, sendo que Português tem o id 01, Matemática id 02, Ciências id 03 e História id 04. Os dados necessários para a solução do problema são os nomes (de alunos e professores); os id ́ s auto incrementados, que podem ser consultados na opção de consultar dados, e, por fim, os id 's das matérias, que já são fornecidos pelo sistema.



#### **Conceitos aplicados**

No sistema foram contemplados os conceitos de Classes e Atributos, Construtores e Encapsulamento por meio de seis classes: Pessoa, Aluno, Professor, Boletim, Disciplinas, Turma e, por fim, o menu iniciado na clase Main, que recebe todas as entradas de usuários que são repassadas à classe Colégio que, por sua vez, requisita métodos das classes especificas quando necessário. Também foram implementadas a sobrecarga e sobrescrita de métodos e construtores em cada uma das classes criadas, bem como o conceito de herança por meio da classe abstrata Pessoa, cujos atributos são herdados pelas classes Aluno e Professor. 