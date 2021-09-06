package com.company;

public class Turmas {

    private int id_turmas;
    private Salas sala;
    private int totalAlunos;

    public Turmas(int id_turmas, Salas sala, int totalAlunos) {
        this.id_turmas = id_turmas;
        this.sala = sala;
        this.totalAlunos = totalAlunos;
    }

}
