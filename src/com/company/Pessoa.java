package com.company;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Método para relação de composição entre professores, turmas e alunos
    public abstract void atribuirTurmas(Turma turma);

    //Modificadores de acesso
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
