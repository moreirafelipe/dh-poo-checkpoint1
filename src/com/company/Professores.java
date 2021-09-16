package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Professores extends Pessoas {

    private int id_professor;
    private Disciplinas disciplina;
    private String email;
    private ArrayList<Turmas> turmas;

    public Professores(String nome, int id_professor) {
        super(nome);
        this.id_professor = id_professor;
    }

    public Professores(String nome, String telefone, LocalDate data_de_nascimento, int id_professor
            , Disciplinas disciplina, String email) {
        super(nome, telefone, data_de_nascimento);
        this.id_professor = id_professor;
        this.disciplina = disciplina;
        this.email = email;
        this.turmas = new ArrayList<>();
    }

    public void adicionarTurmas(Turmas turma){
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
            for(Turmas turma: turmas){
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

    public Disciplinas getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Turmas> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turmas> turmas) {
        this.turmas = turmas;
    }
}
