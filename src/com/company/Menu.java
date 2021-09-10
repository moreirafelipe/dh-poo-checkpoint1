package com.company;

import java.util.Scanner;

public class Menu {
    private int opcao;


    //TELA DE INICIO
    public void inicio(){

        Scanner ler = new Scanner(System.in); //gerando leitor de entrada de input

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("\nSeja bem-vindo ao sistema de gestão escolar - SIGESC\n");

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("1 - Cadastrar disciplinas ");
        System.out.println("2 - Consultar disciplinas ");
        System.out.println("Digite a sua escolha:");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1: cadastro();
            break;
        }

    }

    //TELA DE CADASTRO
    public void cadastro() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina!");
        String nome = ler.next();

        System.out.println("Digite a nota!");
        Double nota = ler.nextDouble();

        System.out.println("Digite a quantidade de faltas!");
        int faltas = ler.nextInt();

        Disciplinas disciplina1 = new Disciplinas(nome, nota, faltas);
        System.out.println("Disciplina cadastrada com sucesso!!!");
        System.out.println("Disciplina: " + disciplina1.getNome());
    }

    public void consulta() {

    }


    public static void  main(String[] args){
    }



}
