package com.company;

import java.time.LocalTime;

public class Aula {

    private int id_aulas;
    private Turma turma;
    private Professor professor;
    private LocalTime inicio;
    private LocalTime fim;

    public Aula(int id_aulas, Turma turma, Professor professor, LocalTime inicio, LocalTime fim) {
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
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
