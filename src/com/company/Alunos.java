package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Alunos extends Pessoas {

    private int id_alunos;
    private String endereco;
    private Turmas turma;
    private Boletins boletim;

    // quando gera um construtor, ele surge com os atributos gerais da superclasse(pai); os atributos da subclasse(filho) devem ser adicionados após;
    public Alunos(String nome, int id_alunos, Boletins boletim) {
        super(nome);
        this.id_alunos = id_alunos;
        this.boletim = boletim; //boletim não pode ser em arrays
    }

    public Alunos(String nome, String telefone, LocalDate data_de_nascimento, String endereco, Turmas turma,
                  Boletins boletim) {
        //Turmas serão em arrays
        super(nome, telefone, data_de_nascimento);
        this.endereco = endereco;
        this.turma = turma;
        this.boletim = boletim;
    }

    public void mostrarDados(){
        System.out.println("\n---------Dados do(a) aluno(a)--------\n");
        System.out.println("ID: " + this.getId_alunos());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Turma: " + this.getTurma());
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

    public void setId_alunos(int id_alunos) {
        this.id_alunos = id_alunos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Turmas getTurma() {
        return turma;
    }

    public void setTurma(Turmas turma) {
        this.turma = turma;
    }

    public Boletins getBoletim() {
        return boletim;
    }

    public void setBoletim(Boletins boletim) {
        this.boletim = boletim;
    }

    @Override
    public String toString() {
        return "\nDados do aluno: " +
                "\nID do aluno(a): " + id_alunos +
                "\nNome: " + super.getNome() +
                "\nBoletim: " + boletim;
    }

    //    public ArrayList<Boletins> getBoletins() {
//        return boletins;
//    }
//
//    public void setBoletins(ArrayList<Boletins> boletins) {
//        this.boletins = boletins;
//    }
}
