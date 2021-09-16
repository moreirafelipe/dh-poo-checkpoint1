package com.company;

public class Disciplina {

    private String nome;
    private Double nota;
    private int falta = 0;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void mostrarDados(){

        if(this.getNota() != null || this.getFalta() != 0) {
            System.out.println("\n--------- Disciplina " + getNome() +  "--------\n");
            System.out.println("Nome da disciplina: " + getNome());
            System.out.println("Média: " + this.getNota());
            System.out.println("Faltas: " + this.getFalta());
        } else {

            System.out.println("Não há dados cadastrados para a disciplina de " + getNome());
        }
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
