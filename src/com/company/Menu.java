package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    public void inicio() {

        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("||                Seja bem-vindo ao sistema de gestão escolar - SIGESC                 ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("|| 1 - Cadastrar alunos(as)                                                            ||");
        System.out.println("|| 2 - Cadastrar professores(as)                                                       ||");
        System.out.println("|| 3 - Cadastrar médias                                                                ||");
        System.out.println("|| 4 - Cadastrar faltas                                                                ||");
        System.out.println("|| 5 - Cadastrar turmas                                                                ||");
        System.out.println("|| 6 - Atribuir turmas                                                                 ||");
        System.out.println("|| 7 - Consultar dados                                                                 ||");
        System.out.println("|| 8 - Atualizar dados                                                                 ||");
        System.out.println("|| 9 - Relatório de alunos                                                             ||");
        System.out.println("|| 10 - Sair                                                                           ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
    }

    //Menu principal
    public static void main(String[] args) {

        Menu menu = new Menu();
        Colegio colegio = new Colegio();
        Scanner lerMenu = new Scanner(System.in);

        short opcaoMenu = 0;

        do{
            menu.inicio();
            System.out.println("\nEscolha uma opção: ");
            opcaoMenu = lerMenu.nextShort();

            switch(opcaoMenu){
                case 1: colegio.cadastrarAlunos();
                    break;
                case 2: colegio.cadastrarProfessores();
                    break;
                case 3: colegio.cadastrarMedias();
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
                default:
                    System.out.println("Por favor, escolha uma opção do menu!");
                    break;
            }
        }while(opcaoMenu != 10);
        System.out.println("\nAté breve!");
    }
}