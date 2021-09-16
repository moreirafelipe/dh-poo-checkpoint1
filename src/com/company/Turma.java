package com.company;

public class Turma {

    private int id_turmas;

    public Turma(int id_turmas) {
        this.id_turmas = id_turmas;
    }

    public void dadosTurma(){
        System.out.println("\n--------- Dados da turma" + id_turmas + "--------\n");
        System.out.println("ID turma: " + this.getId_turmas());
    }

    public int getId_turmas() {
        return id_turmas;
    }

}
