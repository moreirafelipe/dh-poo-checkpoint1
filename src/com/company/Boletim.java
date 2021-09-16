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
        this.disciplinas.put(01, new Disciplina("Portugues"));
        this.disciplinas.put(02, new Disciplina("Matematica"));
        this.disciplinas.put(03, new Disciplina("Ciencias"));
        this.disciplinas.put(04, new Disciplina("Historia"));

    }

    //Mostrar relatorio de notas
    public void mostrarDados(){
        System.out.println("\n--------- Histórico escolar --------\n");
        System.out.println("Período: " + getPeriodo());

        if(disciplinas.size() != 0) {

            for (Map.Entry<Integer, Disciplina> disciplina : disciplinas.entrySet()) {
                disciplina.getValue().mostrarDados();
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
