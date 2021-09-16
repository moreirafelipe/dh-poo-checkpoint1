package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    HashMap<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
    HashMap<Integer, Professor> professores = new HashMap<Integer, Professor>();

    Scanner ler = new Scanner(System.in);

    protected String opcao;

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
        System.out.println("|| 7 - Sair                                                                            ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
    }

    //opcao1
//    public void cadastrarDisciplinas(){
//        System.out.println("Digite o nome da disciplina a ser cadastrada: ");
//        opcao = ler.next();
//
////        boletim.adicionarDisciplinas(01, );
//    }

    //opcao2
//    public void consultarDisciplinas(){
//        System.out.println("Digite o nome da disciplina a ser consultada: ");
//        opcao = ler.next();
//        boletim.consultarDisciplinas(opcao);
//    }

    //opcao1
    public void cadastrarAlunos(){

        Disciplina d1 = new Disciplina("Portugues");
        Disciplina d2 = new Disciplina("Matematica");
        Disciplina d3 = new Disciplina("Ciencias");
        Disciplina d4 = new Disciplina("Historia");

        System.out.println("Digite o nome do aluno a ser cadastrado: ");
        String nomeAluno = ler.next();

        System.out.println("Digite o id do aluno: ");
        Integer idAluno = ler.nextInt();

        alunos.put(idAluno, new Aluno( nomeAluno, idAluno, new Boletim("1Bim", d1, d2, d3, d4)));

        System.out.println("Aluno(a) cadastrado(a) com sucesso!");
    }

    //opcao2
    public void cadastrarProfessores(){
        System.out.println("Digite o nome do professor a ser cadastrado: ");
        String nomeProfessor = ler.next();

        System.out.println("Digite o id do professor: ");
        Integer idProfessor = ler.nextInt();

        professores.put(idProfessor, new Professor(nomeProfessor, idProfessor));
        System.out.println("Professor cadastrado com sucesso!");
    }

    //opcao3
    public void cadastrarMedias(){

        System.out.println("Digite o ID do(a) aluno(a): ");
        Integer opcao = ler.nextInt();

        Aluno resultado = alunos.get(opcao);

        resultado.cadastrarMedias();

    }

    //opcao4
    public void cadastrarFaltas(){

        System.out.println("Digite o ID do(a) aluno(a):");
        Integer opcao = ler.nextInt();

        Aluno resultado = alunos.get(opcao);

        resultado.cadastrarFaltas();

    }

    //opcao5
    public void cadastrarTurmas(){
        System.out.println(0);
    }

    //opcao6
    public void consultarDados(){
        System.out.println("Digite 1 para consultar dados de alunos ou 2 para dados de professores?");
        short escolha = ler.nextShort();

        if(escolha == 1) {
            System.out.println("Digite o id do aluno a ser consultado: ");
            Integer idConsulta = ler.nextInt();

            Aluno aluno = alunos.get(idConsulta);
            aluno.mostrarDados();
        } else {
            System.out.println("Digite o id do professor a ser consultado: ");
            Integer idConsulta = ler.nextInt();

            Professor professor = professores.get(idConsulta);
            System.out.println(professores);
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
                default:
                    System.out.println("Por favor, escolha uma opção do menu!");
                    break;
            }
        }while(opcaoMenu != 7);
        System.out.println("\nAté breve!");
    }
}