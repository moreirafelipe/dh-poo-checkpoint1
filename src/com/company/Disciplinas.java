package com.company;

import java.util.ArrayList;
import java.util.Scanner;

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
