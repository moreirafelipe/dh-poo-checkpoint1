package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Colegio {

    HashMap<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
    HashMap<Integer, Professor> professores = new HashMap<Integer, Professor>();
    HashMap<Integer, Turma> turmas = new HashMap<Integer, Turma>();
    HashMap<Integer, String> disciplinas = new HashMap<Integer,String>();

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
            System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
            opcao = ler.nextShort();
        } while(opcao == 1);
    }

    public void cadastrarProfessores(){
        short opcao = 0;

        disciplinas.put(01, "Portugues");
        disciplinas.put(02, "Matematica");
        disciplinas.put(03, "Ciencias");
        disciplinas.put(04, "Historia");

        do {
            Integer idProfessor = professores.size() + 1;

            System.out.println("Digite o nome do professor a ser cadastrado: ");
            String nomeProfessor = ler.next();


            System.out.println("Disciplinas disponíveis: ");

            for (Map.Entry<Integer, String> disciplina : disciplinas.entrySet()) {
                System.out.println("ID: " + disciplina.getKey() + " | Disciplina: " + disciplina.getValue());
            }

            System.out.print("\nDigite um ID válido para atribuir uma disciplina ao(à) professor(a): ");
            Integer escolha = ler.nextInt();

            String idRetornado = disciplinas.get(escolha);

            if(idRetornado == null) {

                System.out.println("\nDisciplina não encontrada!");

            } else {

                professores.put(idProfessor, new Professor(idProfessor, nomeProfessor, idRetornado));
                System.out.println("\nProfessor cadastrado com sucesso!");

            }
            //navegar entre menus
            System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
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
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
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
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else {
            System.out.println("Há " + alunos.size() + " alunos cadastrados. Cadastre alunos para incluir dados!");
        }
    }

    //opcao5
    public void cadastrarTurmas(){

        System.out.println("Digite o ID da nova turma:");
        Integer idTurma = ler.nextInt();

        turmas.put(idTurma,new Turma(idTurma));

        System.out.println("Turma " + idTurma + " cadastrada com sucesso!");

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
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else if (escolha == 2 && professores.size() != 0) {

            short opcao = 0;

            do{
                System.out.println("Digite o id do professor a ser consultado: ");
                Integer idConsulta = ler.nextInt();

                Professor professor = professores.get(idConsulta);
                professor.mostrarDados();

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
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
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);
        } else {
            System.out.println("Não há dados cadastrados para a opção selecionada. Cadastre dados para realizar " +
                    "consultas!");
        }
    }

    //opcao8
    public void atualizarDados(){

        System.out.println("Digite 1 para atualizar dados de alunos ou 2 para dados de professores:");
        short escolha = ler.nextShort();

        if(escolha == 1 && alunos.size() != 0) {

            short opcao = 0;

            do {
                System.out.println("Digite o id do aluno a ser alterado: ");
                Integer idConsulta = ler.nextInt();

                Aluno aluno = alunos.get(idConsulta);

                System.out.println("Digite o novo nome do(a) aluno(a):");
                String novoNome = ler.next();

                aluno.setNome(novoNome);

                System.out.println("Dados atualizados com sucesso!");

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else if (escolha == 2 && professores.size() != 0) {

            short opcao = 0;

            do{
                System.out.println("Digite o id do professor a ser alterado: ");
                Integer idConsulta = ler.nextInt();

                Professor professor = professores.get(idConsulta);

                System.out.println("Digite o novo nome do(a) professor(a):");
                String novoNome = ler.next();
                professor.setNome(novoNome);

                System.out.println("Dados atualizados com sucesso!");

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else {
            System.out.println("Não há dados cadastrados para a opção selecionada. Cadastre dados para realizar " +
                    "consultas!");
        }
    }

    //opcao 6
    public void atribuirTurmas(){

        System.out.println("Digite 1 para atribuir turmas a alunos ou 2 para professores:");
        short escolha = ler.nextShort();

        if(escolha == 1 && alunos.size() != 0 && turmas.size() !=0) {

            short opcao = 0;

            do {
                System.out.println("Digite o id do aluno a receber turma: ");
                Integer idConsulta = ler.nextInt();

                Aluno aluno = alunos.get(idConsulta);

                System.out.println("Digite o id da turma a ser atribuida:");
                Integer idTurma = ler.nextInt();
                Turma turma = turmas.get(idConsulta);

                aluno.atribuirTurmas(turma);

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else if (escolha == 2 && professores.size() != 0 && turmas.size() !=0) {

            Integer idTurma = turmas.size() + 1;

            short opcao = 0;

            do{
                System.out.println("Digite o id do professor a receber turma: ");
                Integer idConsulta = ler.nextInt();

                Professor professor = professores.get(idConsulta);

                System.out.println("Digite o id da turma a ser atribuida:");
                Integer idTurmaProf = ler.nextInt();
                Turma turma = turmas.get(idTurmaProf);

                professor.atribuirTurmas(turma);

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else {
            System.out.println("Não há dados cadastrados para a opção selecionada. Cadastre dados de turmas e " +
                    "professores " +
                    " para realizar " +
                    "consultas!");
        }
    }
}
