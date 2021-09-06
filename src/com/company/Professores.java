package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Professores extends Pessoas {

    private int id_professor;
    private String materia;
    private String email;
    private LocalTime entrada;
    private LocalTime saida;
    private Double valorHora;
    private ArrayList<Turmas> turma;
    private ArrayList<Aulas> aula;

    public Professores(String nome, String telefone, LocalDate data_de_nascimento, String categoria, int id_professor, String materia, String email, LocalTime entrada, LocalTime saida, Double valorHora) {
        super(nome, telefone, data_de_nascimento, categoria);
        this.id_professor = id_professor;
        this.materia = materia;
        this.email = email;
        this.entrada = entrada;
        this.saida = saida;
        this.valorHora = valorHora;
        this.turma = turma;
        this.aula = aula;
    }
}
