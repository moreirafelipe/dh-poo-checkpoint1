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

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }
}
