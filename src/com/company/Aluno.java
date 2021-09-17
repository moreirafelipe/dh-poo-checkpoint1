package com.company;

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

    //Método para exibição de dados da classe
    public void mostrarDados(){
        System.out.println("\n---------Dados do(a) aluno(a)--------\n");
        System.out.println("ID: " + this.getId_alunos());
        System.out.println("Nome: " + this.getNome());

        if(this.getTurma() == null){
            System.out.println("Sem turmas cadastradas!");
        } else {
            System.out.println("Turma: " + this.turma.getId_turmas());
        }

        this.boletim.mostrarDados();
    }

    public void cadastrarMedias(){
        Scanner ler = new Scanner(System.in);

        System.out.println("\nDigite o ID da disciplina desejada: ");
        Integer id_disciplina = ler.nextInt();

        System.out.println("Digite a média: ");
        Double media = ler.nextDouble();

        this.boletim.definirMedias(id_disciplina, media);

        System.out.println("Média cadastrada com sucesso!");
    }


    public void cadastrarFaltas(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\nDigite o ID da disciplina desejada: ");
        Integer id_disciplina = ler.nextInt();

        System.out.println("Digite a quantidade de faltas: ");
        int faltas = ler.nextInt();

        this.boletim.definirFaltas(id_disciplina, faltas);
        System.out.println("Faltas cadastradas com sucesso!");
    }

    @Override
    public void atribuirTurmas(Turma turma) {
        this.turma = turma;
        System.out.println("\nTurma atribuida com sucesso!");
    }

    //Sobreescrevendo modificadores de acesso
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    public int getId_alunos() {
        return id_alunos;
    }
    public Turma getTurma() {
        return turma;
    }
}
