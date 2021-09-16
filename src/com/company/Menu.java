package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    HashMap<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
    HashMap<Integer, Professor> professores = new HashMap<Integer, Professor>();

    Scanner ler = new Scanner(System.in);

//    protected String opcao;
    public void inicio() {
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("||                Seja bem-vindo ao sistema de gestão escolar - SIGESC                 ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("|| 1 - Cadastrar alunos(as)                                                            ||");
        System.out.println("|| 2 - Cadastrar professores(as)                                                       ||");
        System.out.println("|| 3 - Cadastrar médias                                                                ||");
        System.out.println("|| 4 - Cadastrar faltas                                                                ||");
        System.out.println("|| 5 - Cadastrar turmas                                                                ||");
        System.out.println("|| 6 - Consultar dados                                                                 ||");
        System.out.println("|| 7 - Relatório de alunos                                                             ||");
        System.out.println("|| 8 - Sair                                                                            ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
    }

    //opcao1
    public void cadastrarAlunos(){

        Menu menu = new Menu();

        Integer idAluno = alunos.size() + 1;

        System.out.println("Digite o nome do aluno a ser cadastrado: ");
        String nomeAluno = ler.next();

        alunos.put(idAluno, new Aluno( nomeAluno, idAluno, new Boletim("1Bim")));

        System.out.println("Aluno(a) cadastrado(a) com sucesso!");

        //navegar entre menus
        System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
        short opcao = ler.nextShort();

        if (opcao == 1) menu.cadastrarAlunos(); else menu.inicio();
    }

    //opcao2
    public void cadastrarProfessores(){
        Menu menu = new Menu();

        Integer idProfessor = professores.size() + 1;

        System.out.println("Digite o nome do professor a ser cadastrado: ");
        String nomeProfessor = ler.next();

        professores.put(idProfessor, new Professor(nomeProfessor, idProfessor));
        System.out.println("Professor cadastrado com sucesso!");

        //navegar entre menus
        System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
        short opcao = ler.nextShort();

        if (opcao == 1) menu.cadastrarProfessores(); else menu.inicio();
    }

    //opcao3
    public void cadastrarMedias(){
        Menu menu = new Menu();

        if(alunos.size() != 0) {
            System.out.println("Digite o ID do(a) aluno(a): ");
            Integer escolha = ler.nextInt();

            Aluno resultado = alunos.get(escolha);

            resultado.cadastrarMedias();

            //navegar entre menus
            System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
            short opcao = ler.nextShort();

            if (opcao == 1) menu.cadastrarMedias(); else menu.inicio();

        } else {
            System.out.println("Há " + alunos.size() + " alunos cadastrados. Cadastre alunos para incluir dados!");
        }
    }

    //opcao4
    public void cadastrarFaltas(){
        Menu menu = new Menu();

        if(alunos.size() != 0) {

            System.out.println("Digite o ID do(a) aluno(a):");
            Integer escolha = ler.nextInt();

            Aluno resultado = alunos.get(escolha);

            resultado.cadastrarFaltas();

            //navegar entre menus
            System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
            short opcao = ler.nextShort();

            if (opcao == 1) menu.cadastrarFaltas(); else menu.inicio();

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
        Menu menu = new Menu();

        System.out.println("Digite 1 para consultar dados de alunos ou 2 para dados de professores?");
        short escolha = ler.nextShort();

        if(escolha == 1 && alunos.size() != 0) {

            System.out.println("Digite o id do aluno a ser consultado: ");
            Integer idConsulta = ler.nextInt();

            Aluno aluno = alunos.get(idConsulta);
            aluno.mostrarDados();

            //navegar entre menus
            System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
            short opcao = ler.nextShort();

            if (opcao == 1) menu.consultarDados(); else menu.inicio();

        } else if (escolha == 2 && professores.size() != 0) {
            System.out.println("Digite o id do professor a ser consultado: ");
            Integer idConsulta = ler.nextInt();

            Professor professor = professores.get(idConsulta);
            System.out.println(professores);

            //navegar entre menus
            System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
            short opcao = ler.nextShort();

            if (opcao == 1) menu.consultarDados(); else menu.inicio();

        } else {
            System.out.println("Não há dados cadastrados para a opção selecionada. Cadastre dados para realizar " +
                    "consultas!");
        }
    }

    //opcao7

    public void relatorioGeral() {
        Menu menu = new Menu();

        if(alunos.size() != 0) {
            for (Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
                aluno.getValue().mostrarDados();
            }

            //navegar entre menus
            System.out.println("Digite 1 para repetir a ação ou 2 para voltar ao inicio");
            short opcao = ler.nextShort();

            if (opcao == 1) menu.relatorioGeral(); else menu.inicio();

        } else {
            System.out.println("Não há dados cadastrados para a opção selecionada. Cadastre dados para realizar " +
                    "consultas!");
        }
    }

    //logica do menu
    public static void main(String[] args) {
        Scanner lerMenu = new Scanner(System.in);
        Menu menu = new Menu();
        short opcaoMenu = 0;

        do{
            menu.inicio();
            System.out.println("\nEscolha uma opção: ");
            opcaoMenu = lerMenu.nextShort();

            switch(opcaoMenu){
                case 1: menu.cadastrarAlunos();
                        break;
                case 2: menu.cadastrarProfessores();
                        break;
                case 3: menu.cadastrarMedias();
                        break;
                case 4: menu.cadastrarFaltas();
                        break;
                case 5: menu.cadastrarTurmas();
                        break;
                case 6: menu.consultarDados();
                        break;
                case 7: menu.relatorioGeral();
                        break;
                default:
                    System.out.println("Por favor, escolha uma opção do menu!");
                    break;
            }
        }while(opcaoMenu != 8);
        System.out.println("\nAté breve!");
    }
}