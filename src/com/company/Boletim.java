package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boletim {

    private String periodo;
//    private ArrayList <Disciplinas> disciplinas =  new ArrayList<>();
    private HashMap<Integer, Disciplina> disciplinas = new HashMap<Integer, Disciplina>();

    public Boletim(String periodo) {
        this.periodo = periodo;
        this.disciplinas = disciplinas;
    }

    public Boletim(String periodo, Disciplina disciplina1, Disciplina disciplina2, Disciplina disciplina3,
                    Disciplina disciplina4) {

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

            for (Map.Entry<Integer, Disciplina> disciplina : disciplinas.entrySet()) {
                System.out.println(disciplina);
            }

        } else {

            System.out.println("Não há disciplinas cadastradas!");
        }
    }

//    public void adicionarDisciplina(Integer idDisciplina, Disciplina nomeDisciplina) {
//        disciplinas.put(04, nomeDisciplina);
//        System.out.println("Disciplina adicionada com sucesso!");
//        System.out.println(disciplinas);
//    }

    public void consultarDisciplina(String nomeDisciplina) {
        Disciplina resultado = this.disciplinas.get(nomeDisciplina);
        resultado.mostrarDados();
    }

    public void definirMedias(Integer id, Double nota) {
        Disciplina resultado = this.disciplinas.get(id);
        resultado.setNota(nota);
    }

    public void definirFaltas(Integer id, int faltas) {
        Disciplina resultado = this.disciplinas.get(id);
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
                "\nDisciplina: \n" + disciplinas;
    }
}
