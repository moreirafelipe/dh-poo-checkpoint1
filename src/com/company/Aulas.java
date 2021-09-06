package com.company;

import java.time.LocalTime;

public class Aulas {

    private int id_aulas;
    private Turmas turma;
    private Professores professor;
    private LocalTime inicio;
    private LocalTime fim;

    public Aulas(int id_aulas, Turmas turma, Professores professor, LocalTime inicio, LocalTime fim) {
        this.id_aulas = id_aulas;
        this.turma = turma;
        this.professor = professor;
        this.inicio = inicio;
        this.fim = fim;
    }
}
