package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Professor extends Pessoa {

    private int id_professor;
    private Disciplina disciplina;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Professor(String nome, int id_professor) {
        super(nome);
        this.id_professor = id_professor;
        this.turmas = turmas;
    }

    public Professor(String nome, int id_professor
            , Disciplina disciplina) {
        super(nome);
        this.id_professor = id_professor;
        this.disciplina = disciplina;
        this.turmas = turmas;
    }


    public void mostrarDados(){

        System.out.println("\n---------Dados do(a) Professor(a)--------\n");
        System.out.println("\nDados do professor: " +
                "\nID do(a) professor(a): " + id_professor +
                "\nNome: " + this.getNome() +
                "\nDisciplina: " + this.getDisciplina());

        if(turmas.size() != 0) {
            for(Turma turma: turmas){
                turma.dadosTurma();
            }
        } else {

            System.out.println("Não há turmas cadastradas!");
        }
    }

    public void atribuirTurmas(Turma turma) {

        this.turmas.add(turma);

        System.out.println("Turma adicionada com sucesso!");
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
