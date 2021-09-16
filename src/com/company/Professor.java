package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Professor extends Pessoa {

    private int id_professor;
    private Disciplina disciplina;
    private String email;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Professor(String nome, int id_professor) {
        super(nome);
        this.id_professor = id_professor;
        this.turmas = turmas;
    }

    public Professor(String nome, String telefone, LocalDate data_de_nascimento, int id_professor
            , Disciplina disciplina, String email) {
        super(nome, telefone, data_de_nascimento);
        this.id_professor = id_professor;
        this.disciplina = disciplina;
        this.email = email;
        this.turmas = turmas;
    }

    public void adicionarTurmas(Turma turma){
        this.turmas.add(turma);
    }

    public void mostrarDados(){
        System.out.println("\n---------Dados do(a) Professor(a)--------\n");
        System.out.println("\nDados do professor: " +
                "\nID do(a) professor(a): " + id_professor +
                "\nNome: " + this.getNome() +
                "\nEmail: " + this.getEmail() +
                "\nTurma: " + this.getTurmas() +
                "\nDisciplina: " + this.getDisciplina());

        if(turmas.size() != 0) {
            for(Turma turma: turmas){
                turma.dadosTurma();
            }
        } else {

            System.out.println("Não há turmas cadastradas!");
        }
    }

    @Override
    public String toString() {
        return "\nDados do professor: " +
                "\nID do(a) professor(a): " + id_professor +
                "\nNome: " + this.getNome() +
                "\nEmail: " + this.getEmail() +
                "\nTurma: " + this.getTurmas() +
                "\nDisciplina: " + this.getDisciplina();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
