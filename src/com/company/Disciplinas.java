package com.company;

public class Disciplinas {

    private String nome;
    private Double nota;
    private int falta;

    public Disciplinas(String nome) {
        this.nome = nome;
    }

    public Disciplinas(String nome, Double nota, int falta) {
        this.nome = nome;
        this.nota = nota;
        this.falta = falta;
    }

    public void mostrarDados(){
        System.out.println("\n---------Dados da disciplina" + getNome() +  "--------\n");
        System.out.println("Nome da disciplina: " + getNome());
        System.out.println("Média: " + this.getNota());
        System.out.println("Faltas: " + this.getFalta());
    }

    @Override
    public String toString() {
    return      "\n" +
                "\nNome: " + nome +
                "\nNota: " + nota +
                "\nFaltas: " + falta +
                "\n";
    }

    public String getNome() {
        return nome;
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
