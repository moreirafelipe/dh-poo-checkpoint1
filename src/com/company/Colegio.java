package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Colegio {

    HashMap<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
    HashMap<Integer, Professor> professores = new HashMap<Integer, Professor>();

    Scanner ler = new Scanner(System.in);

    //opcao1
    public void cadastrarAlunos(){
        short opcao = 0;

        do {
            Integer idAluno = alunos.size() + 1;

            System.out.println("Digite o nome do aluno a ser cadastrado: ");
            String nomeAluno = ler.next();

            alunos.put(idAluno, new Aluno(nomeAluno, idAluno, new Boletim("1Bim")));

            System.out.println("Aluno(a) cadastrado(a) com sucesso!");

            //navegar entre menus
            System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
            opcao = ler.nextShort();
        } while(opcao == 1);
    }

    public void cadastrarProfessores(){
        short opcao = 0;

        do {
            Integer idProfessor = professores.size() + 1;

            System.out.println("Digite o nome do professor a ser cadastrado: ");
            String nomeProfessor = ler.next();

            professores.put(idProfessor, new Professor(nomeProfessor, idProfessor));
            System.out.println("Professor cadastrado com sucesso!");

            //navegar entre menus
            System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
            opcao = ler.nextShort();

        } while(opcao == 1);
    }

    //opcao3
    public void cadastrarMedias(){

        if(alunos.size() != 0) {

            short opcao = 0;

            do{
                System.out.println("Digite o ID do(a) aluno(a): ");
                Integer escolha = ler.nextInt();

                Aluno resultado = alunos.get(escolha);

                resultado.cadastrarMedias();

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else {
            System.out.println("Há " + alunos.size() + " alunos cadastrados. Cadastre alunos para incluir dados!");
        }
    }

    //opcao4
    public void cadastrarFaltas(){


        if(alunos.size() != 0) {

            short opcao = 0;

            do {
                System.out.println("Digite o ID do(a) aluno(a):");
                Integer escolha = ler.nextInt();

                Aluno resultado = alunos.get(escolha);

                resultado.cadastrarFaltas();

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else {
            System.out.println("Há " + alunos.size() + " alunos cadastrados. Cadastre alunos para incluir dados!");
        }
    }

    //opcao5
    public void cadastrarTurmas(){
        System.out.println(0);
    }

    //opcao6
    public void consultarDados(){

        System.out.println("Digite 1 para consultar dados de alunos ou 2 para dados de professores?");
        short escolha = ler.nextShort();

        if(escolha == 1 && alunos.size() != 0) {

            short opcao = 0;

            do {

                System.out.println("Digite o id do aluno a ser consultado: ");
                Integer idConsulta = ler.nextInt();

                Aluno aluno = alunos.get(idConsulta);
                aluno.mostrarDados();

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else if (escolha == 2 && professores.size() != 0) {

            short opcao = 0;

            do{
                System.out.println("Digite o id do professor a ser consultado: ");
                Integer idConsulta = ler.nextInt();

                Professor professor = professores.get(idConsulta);
                System.out.println(professores);

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else {
            System.out.println("Não há dados cadastrados para a opção selecionada. Cadastre dados para realizar " +
                    "consultas!");
        }
    }

    //opcao7

    public void relatorioGeral() {

        if(alunos.size() != 0) {

            short opcao = 0;

            do {
                for (Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
                    aluno.getValue().mostrarDados();
                }

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
                opcao = ler.nextShort();

            } while(opcao == 1);
        } else {
            System.out.println("Não há dados cadastrados para a opção selecionada. Cadastre dados para realizar " +
                    "consultas!");
        }
    }
}
