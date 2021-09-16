package com.company;

public class Turma {

    private int id_turmas;
    private Sala sala;
    private int totalAlunos;

    public Turma(int id_turmas, Sala sala, int totalAlunos) {
        this.id_turmas = id_turmas;
        this.sala = sala;
        this.totalAlunos = totalAlunos;
    }

    public void dadosTurma(){
        System.out.println("\n--------- Dados da turma" + id_turmas + "--------\n");
        System.out.println("ID turma: " + this.getId_turmas());
        System.out.println("Sala: " + this.getSala());
        System.out.println("Total de alunos: " + this.getTotalAlunos());
    }

    public int getId_turmas() {
        return id_turmas;
    }

    public void setId_turmas(int id_turmas) {
        this.id_turmas = id_turmas;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getTotalAlunos() {
        return totalAlunos;
    }

    public void setTotalAlunos(int totalAlunos) {
        this.totalAlunos = totalAlunos;
    }
}
