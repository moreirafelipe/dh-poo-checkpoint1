package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Boletins {

    private String periodo;
//    private ArrayList <Disciplinas> disciplinas =  new ArrayList<>();
    private HashMap<String, Disciplinas> disciplinas = new HashMap<String, Disciplinas>();

    public Boletins(String periodo) {

        this.periodo = periodo;
        this.disciplinas = disciplinas;
    }

    public void apresentarDados() {

        System.out.println(disciplinas);
    }

    public void adicionarDisciplinas(String nomeDisciplina) {

        this.disciplinas.put(nomeDisciplina, new Disciplinas(nomeDisciplina));
        System.out.println("Disciplina adicionada!");
        System.out.println(disciplinas);
    }

    public void consultarDisciplinas(String nomeDisciplina) {
        System.out.println("Consulta: " + this.disciplinas.get(nomeDisciplina));
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Boletins{" +
                "periodo='" + periodo + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

}
