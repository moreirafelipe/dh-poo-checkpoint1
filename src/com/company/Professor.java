package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Professor extends Pessoa {

    private int id_professor;
    private String disciplina;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Professor( int id_professor, String nome, String disciplina) {
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

    @Override
    public void atribuirTurmas(Turma turma) {
        this.turmas.add(turma);
        System.out.println("Turma atribuida com sucesso!");
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public String getDisciplina() {
        return disciplina;
    }
}
