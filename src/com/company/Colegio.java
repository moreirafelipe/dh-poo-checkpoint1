package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Colegio {

    //Hashmap para armazenamento e organização de disciplinas por chave e valor com auto-incremento de id
    HashMap<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
    HashMap<Integer, Professor> professores = new HashMap<Integer, Professor>();
    HashMap<Integer, Turma> turmas = new HashMap<Integer, Turma>();
    HashMap<Integer, String> disciplinas = new HashMap<Integer,String>();

    //Instancia leitor de input em escopo global para uso nos métodos
    Scanner ler = new Scanner(System.in);


    //Métodos acionados pelo menu na Main
    //Metodo de cadastro de objetos Aluno
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

    //Metodo de cadastro de objetos Professor
    public void cadastrarProfessores(){
        short opcao = 0;
        do {
            disciplinas.put(01, "Portugues");
            disciplinas.put(02, "Matematica");
            disciplinas.put(03, "Ciencias");
            disciplinas.put(04, "Historia");

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

    ///Metodo de cadastro de médias em objetos Discipliina
    //Cumpre agregação entre Disciplina e Boletim, e composição entre Boletim e Aluno
    public void cadastrarMedias(){

        if(alunos.size() != 0) {

            short opcao = 0;

            do{
                disciplinas.put(01, "Portugues");
                disciplinas.put(02, "Matematica");
                disciplinas.put(03, "Ciencias");
                disciplinas.put(04, "Historia");

                System.out.println("Alunos disponíveis: ");

                for (Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
                    System.out.println( "ID: " + aluno.getKey() + "| Nome: " + aluno.getValue().getNome());
                }

                System.out.println("Digite o ID do(a) aluno(a): ");
                Integer escolha = ler.nextInt();

                System.out.println("Disciplinas disponíveis: ");
                for (Map.Entry<Integer, String> disciplina : disciplinas.entrySet()) {
                    System.out.println("ID: " + disciplina.getKey() + " | Disciplina: " + disciplina.getValue());
                }

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

    ///Metodo de cadastro de faltas no objeto Disciplina
    //Cumpre agregação entre Disciplina e Boletim, e composição entre Boletim e Aluno
    public void cadastrarFaltas(){
        if(alunos.size() != 0) {

            short opcao = 0;

            do {

                disciplinas.put(01, "Portugues");
                disciplinas.put(02, "Matematica");
                disciplinas.put(03, "Ciencias");
                disciplinas.put(04, "Historia");

                System.out.println("Alunos disponíveis: ");

                for (Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
                    System.out.println( "ID: " + aluno.getKey() + "| Nome: " + aluno.getValue().getNome());
                }

                System.out.println("Digite o ID do(a) aluno(a) que receberá a média:");
                Integer escolha = ler.nextInt();

                System.out.println("Disciplinas disponíveis: ");
                for (Map.Entry<Integer, String> disciplina : disciplinas.entrySet()) {
                    System.out.println("ID: " + disciplina.getKey() + " | Disciplina: " + disciplina.getValue());
                }

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

    ///Metodo de cadastro de objetos Turma
    //Cumpre agregação com Aluno e Professor
    public void cadastrarTurmas(){

        short opcao = 0;

        do {
            System.out.println("Digite o ID da nova turma:");
            Integer idTurma = ler.nextInt();

            turmas.put(idTurma,new Turma(idTurma));

            System.out.println("Turma " + idTurma + " cadastrada com sucesso!");

            System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
            opcao = ler.nextShort();
        }while(opcao == 1);
    }

    ///Metodo de consulta de dados que envolve diretamente os objetos Aluno e Professor
    public void consultarDados(){

        System.out.println("Digite 1 para consultar dados de alunos ou 2 para dados de professores?");
        short escolha = ler.nextShort();

        if(escolha == 1 && alunos.size() != 0) {

            short opcao = 0;

            do {

                System.out.println("Alunos disponíveis: ");

                for (Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
                    System.out.println( "ID: " + aluno.getKey() + "| Nome: " + aluno.getValue().getNome());
                }

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
                System.out.println("Professores disponíveis: ");

                for (Map.Entry<Integer, Professor> professor : professores.entrySet()) {
                    System.out.println( "ID: " + professor.getKey() + "| Nome: " + professor.getValue().getNome());
                }

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

    ///Metodo de retorno do método mostrar dados da classe Alunos
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

    ///Metodo de atualização de dados objetos Aluno ou Professor
    //Cumpre agregação entre Aluno, Turma e Professor
    public void atualizarDados(){

        System.out.println("Digite 1 para atualizar dados de alunos ou 2 para dados de professores:");
        short escolha = ler.nextShort();

        if(escolha == 1 && alunos.size() != 0) {

            short opcao = 0;

            do {

                System.out.println("Alunos disponíveis: ");

                for (Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
                    System.out.println( "ID: " + aluno.getKey() + "| Nome: " + aluno.getValue().getNome());
                }

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

                System.out.println("Professores disponíveis: ");

                for (Map.Entry<Integer, Professor> professor : professores.entrySet()) {
                    System.out.println( "ID: " + professor.getKey() + "| Nome: " + professor.getValue().getNome());
                }

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

    ///Metodo de atribuição de turmas
    //Cumpre agregação entre Aluno, Turma e Professor
    public void atribuirTurmas(){

        System.out.println("Digite 1 para atribuir turmas a alunos ou 2 para professores:");
        short escolha = ler.nextShort();

        if(escolha == 1 && alunos.size() != 0 && turmas.size() !=0) {

            short opcao = 0;

            do {

                System.out.println("Alunos disponíveis: ");

                for (Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
                    System.out.println( "ID: " + aluno.getKey() + "| Nome: " + aluno.getValue().getNome());
                }

                System.out.println("Digite o id do aluno a receber turma: ");
                Integer idConsulta = ler.nextInt();

                Aluno aluno = alunos.get(idConsulta);


                System.out.println("Turmas cadastradas: ");

                for (Map.Entry<Integer, Turma> turma : turmas.entrySet()) {
                    System.out.println("ID: " + turma.getKey() + " | Turma: " + turma.getValue().getId_turmas());
                }

                System.out.println("Digite o id da turma a ser atribuida:");
                Integer idTurma = ler.nextInt();
                Turma turma = turmas.get(idTurma);

                aluno.atribuirTurmas(turma);

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else if (escolha == 2 && professores.size() != 0 && turmas.size() !=0) {

            Integer idTurma = turmas.size() + 1;

            short opcao = 0;

            do{

                System.out.println("Professores disponíveis: ");

                for (Map.Entry<Integer, Professor> professor : professores.entrySet()) {
                    System.out.println( "ID: " + professor.getKey() + "| Nome: " + professor.getValue().getNome());
                }

                System.out.println("Digite o id do professor a receber turma: ");
                Integer idConsulta = ler.nextInt();

                Professor professor = professores.get(idConsulta);

                System.out.println("Turmas cadastradas: ");

                for (Map.Entry<Integer, Turma> turma : turmas.entrySet()) {
                    System.out.println("ID: " + turma.getKey() + " | Turma: " + turma.getValue().getId_turmas());
                }

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
                    "professores/ alunos " +
                    " para realizar " +
                    "consultas!");
        }
    }
}
