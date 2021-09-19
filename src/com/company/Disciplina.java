package com.company;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
//    private Double nota;

    //testando notas para media
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;
    private Double media;

//    private ArrayList<Double> notas = new ArrayList<>();

    private int falta = 0;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    //Método para exibição de dados da classe
    public void mostrarDados(){

        media = 0.0;

        if(this.nota1 != null)
            media += nota1;
        if(this.nota2 != null)
            media += nota2;
        if(this.nota3 != null)
            media += nota3;
        if(this.nota4 != null)
            media += nota4;

        setMedia(media / 4);

        if(media != null) {

            System.out.println("||-------------------------------------------------------------------------------||");
            System.out.println("                          Disciplina: " + this.getNome()                            );
            System.out.println("||-------------------------------------------------------------------------------||");

            System.out.print("Notas cadastradas: ");

            System.out.print(this.getNota1() != null ? " | 1º Bim: " + this.getNota1() : "");
            System.out.print(this.getNota2() != null ? " | 2º Bim: " + this.getNota2() : "");
            System.out.print(this.getNota3() != null ? " | 3º Bim: " + this.getNota3() : "");
            System.out.print(this.getNota4() != null ? " | 4º Bim: " + this.getNota4() : "");

            System.out.println("\nFaltas: " + this.getFalta());

            if(this.getFalta() > 10) {
                System.out.println("Situação: REPROVADO POR FALTAS!");
            } else if(this.getNota4() != null && this.getMedia() >= 7) {
                System.out.println("Média semestral: " + getMedia());
                System.out.println("Situação: APROVADO");
            } else if (this.getNota4() != null && this.getMedia() < 7) {
                System.out.println("Média semestral: " + getMedia());
                System.out.println("Situação: REPROVADO");
            } else {
                System.out.println("Média parcial: " + getMedia());
            }

        } else {

            System.out.println("\nNão há dados cadastrados para a disciplina de " + this.nome);
        }
    }

    //Modificadores de acesso
    public String getNome() {
        return nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public Double getMedia() {
        return media;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
        System.out.println("Nota atribuida com sucesso!");
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
        System.out.println("Nota atribuida com sucesso!");
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
        System.out.println("Nota atribuida com sucesso!");
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
        System.out.println("Nota atribuida com sucesso!");
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public int getFalta() {
        return falta;
    }
    public void setFalta(int falta) {
        this.falta = falta;
    }
}
