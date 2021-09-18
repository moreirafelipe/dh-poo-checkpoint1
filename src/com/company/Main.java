package com.company;
import java.util.Scanner;

public class Main {

    public void inicio() {
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("||                Seja bem-vindo ao sistema de gestão escolar - SIGESC                 ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("|| 1 - Cadastrar alunos(as)                                                            ||");
        System.out.println("|| 2 - Cadastrar professores(as)                                                       ||");
        System.out.println("|| 3 - Cadastrar notas                                                                 ||");
        System.out.println("|| 4 - Cadastrar faltas                                                                ||");
        System.out.println("|| 5 - Cadastrar turmas                                                                ||");
        System.out.println("|| 6 - Atribuir turmas                                                                 ||");
        System.out.println("|| 7 - Consultar dados                                                                 ||");
        System.out.println("|| 8 - Atualizar dados                                                                 ||");
        System.out.println("|| 9 - Relatório de alunos                                                             ||");
        System.out.println("|| 10 - Popular dados automaticamente                                                  ||");
        System.out.println("|| 11 - Encerrar matrícula                                                             ||");
        System.out.println("|| 12 - Encerrar turma                                                                 ||");
        System.out.println("|| 00 - Sair                                                                           ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
    }

    public static void main(String[] args) {

        Main menu = new Main();
        Colegio colegio = new Colegio();
        Scanner lerMenu = new Scanner(System.in);

        //Populando dados
        colegio.disciplinas.put(01, "Portugues");
        colegio.disciplinas.put(02, "Matematica");
        colegio.disciplinas.put(03, "Ciencias");
        colegio.disciplinas.put(04, "Historia");

        short opcaoMenu = 0;

        do{
            menu.inicio();
            System.out.println("\nEscolha uma opção: \n");
            opcaoMenu = lerMenu.nextShort();

            switch(opcaoMenu){
                case 1: colegio.cadastrarAlunos();
                    break;
                case 2: colegio.cadastrarProfessores();
                    break;
                case 3: colegio.cadastrarNotas();
                    break;
                case 4: colegio.cadastrarFaltas();
                    break;
                case 5: colegio.cadastrarTurmas();
                    break;
                case 6: colegio.atribuirTurmas();
                    break;
                case 7: colegio.consultarDados();
                    break;
                case 8: colegio.atualizarDados();
                    break;
                case 9: colegio.relatorioGeral();
                    break;
                case 10: colegio.popularDados();
                    break;
                case 11: colegio.encerrarMatricula();
                    break;
                case 12: colegio.encerrarTurma();
                    break;
                default:
                    System.out.println("\nPor favor, escolha uma opção do menu!");
                    break;
            }
        }while(opcaoMenu != 00);
        System.out.println("\nAté breve!");
    }
}