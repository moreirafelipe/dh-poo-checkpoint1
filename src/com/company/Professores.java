package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Professores extends Pessoas {

    private int id_professor;
    private Disciplinas materia;
    private String email;
    private LocalTime entrada;
    private LocalTime saida;
    private Double valorHora;
    private ArrayList<Turmas> turmas;
    private ArrayList<Aulas> aulas;

    public Professores(String nome, String telefone, LocalDate data_de_nascimento, String categoria, int id_professor
            , Disciplinas materia, String email, LocalTime entrada, LocalTime saida, Double valorHora) {
        super(nome, telefone, data_de_nascimento, categoria);
        this.id_professor = id_professor;
        this.materia = materia;
        this.email = email;
        this.entrada = entrada;
        this.saida = saida;
        this.valorHora = valorHora;
        this.turmas = new ArrayList<>();
        this.aulas = new ArrayList<>();
    }

    public void adicionarTurmas(Turmas turma){

        this.turmas.add(turma);

    }

    public void adicionarAulas(Aulas aula){

        this.aulas.add(aula);

    }

    public double calcularSalario(){
        double salario = this.valorHora * (this.saida.getHour() - this.entrada.getHour()); //Calculando horas cheias por enquanto
        System.out.println("Seu salário é de " + salario);
        return salario;
    }

    @Override
    public String toString() {
        return "Dados do professor:" +
                "id_professor=" + id_professor +
                ", materia=" + materia +
                ", email='" + email + '\'' +
                ", entrada=" + entrada +
                ", saida=" + saida +
                ", valorHora=" + valorHora +
                ", turmas=" + turmas +
                ", aulas=" + aulas +
                '}';
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public Disciplinas getMateria() {
        return materia;
    }

    public void setMateria(Disciplinas materia) {
        this.materia = materia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    public void setSaida(LocalTime saida) {
        this.saida = saida;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public ArrayList<Turmas> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turmas> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aulas> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aulas> aulas) {
        this.aulas = aulas;
    }
}
