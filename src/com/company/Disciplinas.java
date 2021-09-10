package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Disciplinas {

    private String nome;
    private Double nota;
    private int falta;
    private Boletins boletim;


    public Disciplinas(String nome, Double nota, int falta) {

        this.nome = nome;
        this.nota = nota;
        this.falta = falta;
        this.boletim = new Boletins("1º bim");

    }


    @Override
    public String toString() {
        return "Disciplinas{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", falta=" + falta +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void cadastro() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina!");
        String nome = ler.next();

        System.out.println("Digite a nota!");
        Double nota = ler.nextDouble();

        System.out.println("Digite a quantidade de faltas!");
        int faltas = ler.nextInt();

        Disciplinas disciplina1 = new Disciplinas(nome, nota, faltas);
        System.out.println("Disciplina cadastrada com sucesso!!!");

        this.boletim.setDisciplinas(disciplina1);
    }

    public void consulta() {

        System.out.println("Disciplina: " + boletim.getDisciplinas());
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
