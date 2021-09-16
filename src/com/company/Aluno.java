package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Aluno extends Pessoa {

    private int id_alunos;
    private Turma turma;
    private Boletim boletim;

    // quando gera um construtor, ele surge com os atributos gerais da superclasse(pai); os atributos da subclasse(filho) devem ser adicionados após;
    public Aluno(String nome, int id_alunos, Boletim boletim) {
        super(nome);
        this.id_alunos = id_alunos;
        this.boletim = boletim; //boletim não pode ser em arrays
    }

    public void mostrarDados(){
        System.out.println("\n---------Dados do(a) aluno(a)--------\n");
        System.out.println("ID: " + this.getId_alunos());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Turma: " + this.getTurma());

        this.boletim.mostrarDados();
    }

    public void imprimirHistorico() {
        this.boletim.mostrarDados();
    }

    public void cadastrarMedias(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o ID da disciplina: ");
        Integer id_disciplina = ler.nextInt();

        System.out.println("Digite a média: ");
        Double media = ler.nextDouble();

        this.boletim.definirMedias(id_disciplina, media);

        System.out.println("Média cadastrada com sucesso!");
    }


    public void cadastrarFaltas(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o ID da disciplina: ");
        Integer id_disciplina = ler.nextInt();

        System.out.println("Digite a quantidade de faltas: ");
        int faltas = ler.nextInt();

        this.boletim.definirFaltas(id_disciplina, faltas);
        System.out.println("Faltas cadastradas com sucesso!");
    }

//
//    public void consultarNota() {
//
//        System.out.println(get.Boletim());
//    }

    public int getId_alunos() {
        return id_alunos;
    }


    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Boletim getBoletim() {
        return boletim;
    }

    public void setBoletim(Boletim boletim) {
        this.boletim = boletim;
    }

    @Override
    public String toString() {
        return "\nDados do aluno: " +
                "\nID do aluno(a): " + id_alunos +
                "\nNome: " + super.getNome() +
                "\nBoletim: " + boletim;
    }

    //    public ArrayList<Boletim> getBoletins() {
//        return boletins;
//    }
//
//    public void setBoletins(ArrayList<Boletins> boletins) {
//        this.boletins = boletins;
//    }
}
