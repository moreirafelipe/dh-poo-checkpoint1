package com.company;

import java.util.ArrayList;

public class Boletins {

    private String periodo;
    private ArrayList <Disciplinas> disciplinas;

    public Boletins(String periodo) {

        this.periodo = periodo;
        this.disciplinas = new ArrayList<>();
    }

    public void apresentarDados() {

        System.out.println(disciplinas);
    }

    public void adicionarDisciplinas(Disciplinas disciplina) {

        disciplinas.add(disciplina); // add é o push do java;
    }

    @Override
    public String toString() {
        return "Boletins{" +
                "periodo='" + periodo + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
