package com.company;

public class Disciplina {

    private String nome;
    private Double nota;
    private int falta = 0;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina(String nome, Double nota, int falta) {
        this.nome = nome;
        this.nota = nota;
        this.falta = falta;
    }

    public void mostrarDados(){

        if(this.getNota() != null && this.getFalta() != 0) {
            System.out.println("\n--------- Disciplina " + getNome() +  "--------\n");
            System.out.println("Nome da disciplina: " + getNome());
            System.out.println("Média: " + this.getNota());
            System.out.println("Faltas: " + this.getFalta());
        } else {

            System.out.println("Não há dados cadastrados para a disciplina de " + getNome());
        }
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
