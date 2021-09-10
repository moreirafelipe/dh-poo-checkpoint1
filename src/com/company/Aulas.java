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

    public int getId_aulas() {
        return id_aulas;
    }

    public void setId_aulas(int id_aulas) {
        this.id_aulas = id_aulas;
    }

    public Turmas getTurma() {
        return turma;
    }

    public void setTurma(Turmas turma) {
        this.turma = turma;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public LocalTime getFim() {
        return fim;
    }

    public void setFim(LocalTime fim) {
        this.fim = fim;
    }
}
