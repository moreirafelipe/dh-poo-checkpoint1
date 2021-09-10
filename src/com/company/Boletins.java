package com.company;

import java.util.ArrayList;

public class Boletins {

    private String periodo;
    private ArrayList <Disciplinas> disciplinas =  new ArrayList<>();

    public Boletins() {

    }

    public Boletins(String periodo) {

        this.periodo = periodo;
        this.disciplinas = disciplinas;
    }

    public void apresentarDados() {

        System.out.println(disciplinas);
    }

    public void adicionarDisciplinas(Disciplinas disciplina) {

        this.disciplinas.add(disciplina); // add é o push do java;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ArrayList<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplinas disciplina) {
        this.disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Boletins{" +
                "periodo='" + periodo + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

}
