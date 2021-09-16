package com.company;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract void atribuirTurmas(Turma turma);

    @Override
    public String toString() {
        return
                "Nome: '" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
