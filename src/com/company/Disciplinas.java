package com.company;

public class Disciplinas {

    private String nome;
    private Double nota;
    private int falta;

    public Disciplinas(String nome, Double nota, int falta) {

        this.nome = nome;
        this.nota = nota;
        this.falta = falta;
    }

    @Override
    public String toString() {
        return "Disciplinas{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", falta=" + falta +
                '}';
    }
}
