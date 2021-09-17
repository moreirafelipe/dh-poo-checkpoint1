package com.company;

import java.util.HashMap;
import java.util.Map;

public class Boletim {

    private String periodo;
    private HashMap<Integer, Disciplina> disciplinas = new HashMap<Integer, Disciplina>();

    public Boletim(String periodo) {

        this.periodo = periodo;
        this.disciplinas.put(01, new Disciplina("Portugues"));
        this.disciplinas.put(02, new Disciplina("Matematica"));
        this.disciplinas.put(03, new Disciplina("Ciencias"));
        this.disciplinas.put(04, new Disciplina("Historia"));
    }

    //Mostrar relatorio de dados da classe
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
}
