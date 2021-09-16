package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boletins {

    private String periodo;
//    private ArrayList <Disciplinas> disciplinas =  new ArrayList<>();
    private HashMap<Integer, Disciplinas> disciplinas = new HashMap<Integer, Disciplinas>();

    public Boletins(String periodo) {
        this.periodo = periodo;
        this.disciplinas = disciplinas;
    }

    public Boletins(String periodo, Disciplinas disciplina1, Disciplinas disciplina2, Disciplinas disciplina3,
                    Disciplinas disciplina4) {

        this.periodo = periodo;
        this.disciplinas.put(01, disciplina1);
        this.disciplinas.put(02, disciplina2);
        this.disciplinas.put(03, disciplina3);
        this.disciplinas.put(04, disciplina4);

    }

    //Mostrar relatorio de notas
    public void mostrarDados(){
        System.out.println("\n--------- Histórico escolar --------\n");
        System.out.println("Período: " + getPeriodo());

        if(disciplinas.size() != 0) {

            for (Map.Entry<Integer, Disciplinas> disciplina : disciplinas.entrySet()) {
                System.out.println(disciplina);
            }

        } else {

            System.out.println("Não há disciplinas cadastradas!");
        }
    }

//    public void adicionarDisciplinas(Integer idDisciplina, Disciplinas nomeDisciplina) {
//        disciplinas.put(04, nomeDisciplina);
//        System.out.println("Disciplina adicionada com sucesso!");
//        System.out.println(disciplinas);
//    }

    public void consultarDisciplinas(String nomeDisciplina) {
        Disciplinas resultado = this.disciplinas.get(nomeDisciplina);
        resultado.mostrarDados();
    }

    public void definirMedias(Integer id, Double nota) {
        Disciplinas resultado = this.disciplinas.get(id);
        resultado.setNota(nota);
    }

    public void definirFaltas(Integer id, int faltas) {
        Disciplinas resultado = this.disciplinas.get(id);
        resultado.setFalta(faltas);
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return  "\nPeriodo: " + periodo +
                "\nDisciplinas: \n" + disciplinas;
    }
}
