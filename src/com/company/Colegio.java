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

    Integer ultimoIdAluno = 0;
    Integer ultimoIdProfessor = 0;

    //Instancia leitor de input em escopo global para uso nos métodos
    Scanner ler = new Scanner(System.in);

    //Métodos acionados pelo menu na Main
    //Metodo de cadastro de objetos Aluno
    public void cadastrarAlunos(){
        short opcao = 0;

        do {
//            Integer idAluno = alunos.size() + 1;

            System.out.println("Digite o nome do aluno a ser cadastrado: ");
            String nomeAluno = ler.next();

            alunos.put(ultimoIdAluno+1, new Aluno(nomeAluno, ultimoIdAluno+1, new Boletim("1Semestre")));
            ultimoIdAluno++;

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
//            Integer idProfessor = professores.size() + 1;

            System.out.println("Digite o nome do professor a ser cadastrado: ");
            String nomeProfessor = ler.next();

            consultarDisciplinas();

            System.out.print("\nDigite um ID válido para atribuir uma disciplina ao(à) professor(a): ");
            Integer escolha = ler.nextInt();

            String idRetornado = disciplinas.get(escolha);

            if(idRetornado == null) {

                System.out.println("\nDisciplina não encontrada!");

            } else {

                professores.put(ultimoIdProfessor+1, new Professor(ultimoIdProfessor+1, nomeProfessor, idRetornado));
                ultimoIdProfessor++;
                System.out.println("\nProfessor cadastrado com sucesso!");

            }
            //navegar entre menus
            System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
            opcao = ler.nextShort();

        } while(opcao == 1);
    }

    ///Metodo de cadastro de médias em objetos Discipliina
    //Cumpre agregação entre Disciplina e Boletim, e composição entre Boletim e Aluno
    public void cadastrarNotas(){

        if(alunos.size() != 0) {

            short opcao = 0;

            do{
                consultarAlunos();

                System.out.println("Digite o ID do(a) aluno(a): ");
                Integer escolha = ler.nextInt();

                Aluno resultado = alunos.get(escolha);

                if (resultado != null) {

                    consultarDisciplinas();

                    System.out.println("Digite o ID da disciplina desejada: ");
                    Integer escolhaDisc = ler.nextInt();

                    String disciplina = disciplinas.get(escolhaDisc);

                    if (disciplina != null) {
                        resultado.cadastrarNotas(escolhaDisc);
                    } else {
                        System.out.println("Por favor, digite um ID de disciplina válido!");
                    }
                } else {
                    System.out.println("Por favor, digite um ID de aluno válido!");
                }
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
                consultarAlunos();

                System.out.println("Digite o ID do(a) aluno(a) que receberá a média:");
                Integer escolha = ler.nextInt();

                consultarDisciplinas();

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

            Turma turma = turmas.get(idTurma);

            if(turma == null) {
                turmas.put(idTurma,new Turma(idTurma));
                System.out.println("Turma " + idTurma + " cadastrada com sucesso!");
            } else {
                System.out.println("Turma já cadastrada.");
            }
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
                consultarAlunos();

                System.out.println("Digite o id do aluno a ser consultado: ");
                Integer idConsulta = ler.nextInt();

                Aluno aluno = alunos.get(idConsulta);

                if(aluno != null) {
                    aluno.mostrarDados();
                } else {
                    System.out.println("Por favor, informe um ID válido!");
                }
                //navegar entre menus
                System.out.println("\nDigite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else if (escolha == 2 && professores.size() != 0) {

            short opcao = 0;

            do{
                consultarProfessores();

                System.out.println("Digite o id do professor a ser consultado: ");
                Integer idConsulta = ler.nextInt();

                Professor professor = professores.get(idConsulta);

                if(professor != null) {
                    professor.mostrarDados();
                } else {
                    System.out.println("Por favor, informe um ID válido!");
                }
                //navegar entre menus
                System.out.println("\nDigite 1 para repetir a ação ou qualquer outro numero para sair");
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
                consultarAlunos();

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

                consultarProfessores();

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
                consultarAlunos();

                System.out.println("Digite o id do aluno a receber turma: ");
                Integer idConsulta = ler.nextInt();

                Aluno aluno = alunos.get(idConsulta);

                if(aluno != null) {

                    consultarTurmas();

                    System.out.println("Digite o id da turma a ser atribuida:");
                    Integer idTurma = ler.nextInt();

                    Turma turma = turmas.get(idTurma);

                    if(turma != null){
                        aluno.atribuirTurmas(turma);
                    } else {
                        System.out.println("Por favor, digite um ID válido!");
                    }

                } else {
                    System.out.println("Por favor, digite um ID válido!");
                }

                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();

            } while(opcao == 1);

        } else if (escolha == 2 && professores.size() != 0 && turmas.size() !=0) {

//            Integer idTurma = turmas.size() + 1;

            short opcao = 0;

            do{

                consultarProfessores();

                System.out.println("Digite o id do professor a receber turma: ");
                Integer idConsulta = ler.nextInt();

                Professor professor = professores.get(idConsulta);

                consultarTurmas();

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

    //método para excluir objetos Aluno
    public void encerrarMatricula() {

        short opcao = 0;

        do {
            if(alunos.size() != 0) {

                System.out.println("Selescione o ID do aluno para encerrar sua matrícula:");

                consultarAlunos();

                Integer idAluno  = ler.nextInt();

                if(alunos.get(idAluno) != null){

                    alunos.remove(idAluno);

                    System.out.println("Matricula encerrada com sucesso!");
                    System.out.println("Lista de alunos atualizada:");

                    consultarAlunos();

                } else {
                    System.out.println("Por favor, digite um ID de aluno válido!");
                }
                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();
            } else {
                System.out.println("Não há dados cadastrados para a opção selecionada. Cadastre dados para realizar " +
                        "consultas!");
            }
        } while(opcao == 1);
    }

    //método para excluir objetos Turma
    public void encerrarTurma() {

        short opcao = 0;

        do {

            if (turmas.size() != 0) {

                System.out.println("Selescione o ID da turma a ser encerrada:");

                consultarTurmas();

                Integer idTurma  = ler.nextInt();

                if(turmas.get(idTurma) != null){

                    turmas.remove(idTurma);

                    System.out.println("Turma encerrada com sucesso!");
                    System.out.println("Lista de turmas atualizada:");

                    consultarTurmas();

                } else {
                    System.out.println("Por favor, digite um ID de tutrma válido!");
                }
                //navegar entre menus
                System.out.println("Digite 1 para repetir a ação ou qualquer outro numero para sair");
                opcao = ler.nextShort();
            } else {
                System.out.println("Não há dados cadastrados para a opção selecionada. Cadastre dados para realizar " +
                        "consultas!");
            }
        } while(opcao == 1);
    }

    //Métodos de exibição de dados cadastrados
    public void consultarAlunos() {
        System.out.println("Alunos disponíveis: ");
        for (Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
            System.out.println( "ID: " + aluno.getKey() + "| Nome: " + aluno.getValue().getNome());
        }
    }

    public void consultarProfessores() {
        System.out.println("Professores disponíveis: ");
        for (Map.Entry<Integer, Professor> professor : professores.entrySet()) {
            System.out.println( "ID: " + professor.getKey() + "| Nome: " + professor.getValue().getNome());
        }
    }

    public void consultarDisciplinas() {
        System.out.println("Disciplinas disponíveis: ");
        for (Map.Entry<Integer, String> disciplina : disciplinas.entrySet()) {
            System.out.println("ID: " + disciplina.getKey() + " | Disciplina: " + disciplina.getValue());
        }
    }

    public void consultarTurmas(){
        System.out.println("Turmas cadastradas: ");
        for (Map.Entry<Integer, Turma> turma : turmas.entrySet()) {
            System.out.println("ID: " + turma.getKey() + " | Turma: " + turma.getValue().getId_turmas());
        }
    }

    public void popularDados() {

        Colegio colegio = new Colegio();
        Scanner ler = new Scanner(System.in);

        short opcao = 0;

        do {

            Integer qtdAlunosAtual = alunos.size();
            Integer qtdProfessoresAtual = professores.size();
            Integer qtdTurmasAtual = turmas.size();

            //Populando alunos
            alunos.put(ultimoIdAluno+1, new Aluno("Felipe", ultimoIdAluno+1, new Boletim("1ºSemestre")));
            ultimoIdAluno++;

            alunos.put(ultimoIdAluno+1, new Aluno("Maria", ultimoIdAluno+1,
                    new Boletim("1ºSemestre")));
            ultimoIdAluno++;

            alunos.put(ultimoIdAluno+1, new Aluno("José", ultimoIdAluno+1, new Boletim("1ºSemestre")));
            ultimoIdAluno++;

            //Populando professores
            professores.put(ultimoIdProfessor+1, new Professor(ultimoIdProfessor+1, "Pacheco",
                    "Portugues"));
            ultimoIdProfessor++;

            professores.put(ultimoIdProfessor+1, new Professor(ultimoIdProfessor+1, "Ana Rosa",
                    "Matematica"));
            ultimoIdProfessor++;

            professores.put(ultimoIdProfessor+1, new Professor(ultimoIdProfessor+1, "Picolino",
                    "Historia"));
            ultimoIdProfessor++;

            //populando turmas
            turmas.put(turmas.size()+1,new Turma(turmas.size()+1));
            turmas.put(turmas.size()+1,new Turma(turmas.size()+1));
            turmas.put(turmas.size()+1,new Turma(turmas.size()+1));

            System.out.println("\nDados adicionados com sucesso!");

            System.out.println("Dados adicionados: ");
            System.out.println("Alunos: " + (alunos.size() - qtdAlunosAtual));
            System.out.println("Professores: " + (professores.size() - qtdProfessoresAtual));
            System.out.println("Turmas: " + (turmas.size() - qtdTurmasAtual));

            System.out.println("\nDados atuais: ");
            System.out.println("Alunos: " + (alunos.size()));
            System.out.println("Professores: " + (professores.size()));
            System.out.println("Turmas: " + (turmas.size()));

            System.out.println("\nDigite 1 para repetir a ação ou qualquer outro numero para sair");
            opcao = ler.nextShort();

        } while(opcao == 1);
    }
}
