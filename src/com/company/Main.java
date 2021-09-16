package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        HashMap<String, Disciplinas> disciplinas = new HashMap<String, Disciplinas>();
//        Disciplinas disciplina1 = new Disciplinas("Portugues");
//        Disciplinas disciplina2 = new Disciplinas("Matemática");
//        Disciplinas disciplina3 = new Disciplinas("Ciências");
//        Disciplinas disciplina4 = new Disciplinas("História");


//        HashMap<Integer, Alunos> alunos = new HashMap<Integer, Alunos>();
//        HashMap<Integer, Professores> professores = new HashMap<Integer, Professores>();
//        Boletins boletim = new Boletins("1Bim");
//
//        int opcao;
//
//        Scanner ler = new Scanner(System.in); //gerando leitor de entrada de input
//
//        System.out.println("--------------------------------------------------------------------------------------");
//        System.out.println("--------------------------------------------------------------------------------------");
//
//        System.out.println("\nSeja bem-vindo ao sistema de gestão escolar - SIGESC\n");
//
//        System.out.println("--------------------------------------------------------------------------------------");
//        System.out.println("--------------------------------------------------------------------------------------");
//        System.out.println("1 - Cadastrar disciplinas");
//        System.out.println("2 - Consultar disciplinas");
//        System.out.println("3 - Adicionar aluno");
//        System.out.println("4 - Adicionar professor");
//        System.out.println("5 - Consultar pessoa");
//        System.out.println("6 - Sair");
//        System.out.println("Digite a sua escolha:");
//        opcao = ler.nextInt();
//
//        while(opcao != 6) {
//
//            Scanner scan = new Scanner(System.in);
//            String entrada;
//
//            switch (opcao) {
//                case 1:
//                    System.out.println("Digite o nome da disciplina a ser cadastrada: ");
//                    entrada = scan.next();
//                    boletim.adicionarDisciplinas(entrada);
//                    break;
//                case 2:
//                    System.out.println("Digite o nome da disciplina a ser consultada: ");
//                    entrada = scan.next();
//                    boletim.consultarDisciplinas(entrada);
//                    break;
//                case 3:
//                    System.out.println("Digite o nome do aluno a ser cadastrado: ");
//                    String nomeAluno = scan.next();
//                    System.out.println("Digite o id do aluno: ");
//                    Integer idAluno = scan.nextInt();
//                    alunos.put(idAluno, new Alunos(nomeAluno, "aluno", idAluno, boletim));
//                    System.out.println("Aluno cadastrada com sucesso!");
//                    break;
//                case 4:
//                    System.out.println("Digite o nome do professor a ser cadastrado: ");
//                    String nomeProfessor = scan.next();
//                    System.out.println("Digite o id do professor: ");
//                    Integer idProfessor = scan.nextInt();
//                    professores.put(idProfessor, new Professores(nomeProfessor, idProfessor));
//                    System.out.println("Professor cadastrado com sucesso!");
//                    break;
//                case 5:
//
//                    System.out.println("Digite 1 para consultar alunos ou 2 para professores?");
//                    int escolha = scan.nextInt();
//
//                    if(escolha == 1) {
//                        System.out.println("Digite o id do aluno a ser consultado: ");
//                        Integer idConsulta = scan.nextInt();
//
//                        Alunos aluno = alunos.get(idConsulta);
//                        System.out.println(aluno);
//                        break;
//                    }
//
//                    System.out.println("Digite o id do professor a ser consultado: ");
//                    Integer idConsulta = scan.nextInt();
//
//                    Professores professor = professores.get(idConsulta);
//                    System.out.println(professores);
//                    break;
//            }
//
//            System.out.println("--------------------------------------------------------------------------------------");
//            System.out.println("--------------------------------------------------------------------------------------");
//
//            System.out.println("\nSeja bem-vindo ao sistema de gestão escolar - SIGESC\n");
//
//            System.out.println("--------------------------------------------------------------------------------------");
//            System.out.println("--------------------------------------------------------------------------------------");
//            System.out.println("1 - Cadastrar disciplinas");
//            System.out.println("2 - Consultar disciplinas");
//            System.out.println("3 - Adicionar aluno");
//            System.out.println("4 - Adicionar professor");
//            System.out.println("5 - Consultar pessoa");
//            System.out.println("6 - Sair");
//            System.out.println("Digite a sua escolha:");
//            opcao = ler.nextInt();
//
//        }



        /*Salas sala01 = new Salas(1, "sim");
        Salas sala02 = new Salas(2, "sim");

        Turmas turma001 = new Turmas(1, sala01, 30);
        Turmas turma002 = new Turmas(2, sala02, 27);

        Alunos aluno1 = new Alunos("Maria", "485556854", LocalDate.of(1990,02,28), "aluno", "rua das camélias", turma001);
        Alunos aluno2 = new Alunos("Ana", "4855564564", LocalDate.of(1992,07,25), "aluno", "rua das margarida", turma002);

        Disciplinas matematica = new Disciplinas("Matemática", 8.5, 5); //Disciplinas é o tipo de dados do objeto; matematica é o nome da variável que armazena o objeto; "Matemática" é o valor inserido no objeto;
        Disciplinas geografia = new Disciplinas("Geografia", 9.0, 4);

        Boletins primeiroBimestre = new Boletins("1º Bimestre");
        Boletins segundoBimestre = new Boletins("2º Bimestre");

        primeiroBimestre.adicionarDisciplinas(matematica);
        primeiroBimestre.adicionarDisciplinas(geografia);
        segundoBimestre.adicionarDisciplinas(matematica);
        segundoBimestre.adicionarDisciplinas(geografia);

        System.out.println(primeiroBimestre);
        System.out.println(segundoBimestre);

      String nome, String telefone, LocalDate data_de_nascimento, String categoria, int id_professor
          , Disciplinas materia, String email, LocalTime entrada, LocalTime saida, Double valorHora
        Professores prof1 = new Professores("Adolfo", "12988393939", LocalDate.of(1990, 9, 06),
                "Professor", 001, matematica, "adolfo@colegio.com.br", LocalTime.of(05,05,05), LocalTime.of(10,10,10)
                , 50.00);

        Professores prof2 = new Professores("Tania", "12988393940", LocalDate.of(1995, 8, 12),
                "Professor", 002, geografia, "tania@colegio.com.br", LocalTime.of(10,10,10), LocalTime.of(18,18,18)
                , 150.00);

        prof1.adicionarTurmas(turma001);
        prof1.adicionarTurmas(turma002);

        prof2.adicionarTurmas(turma001);
        prof2.adicionarTurmas(turma002);

        System.out.println(prof1);
        System.out.println(prof1.calcularSalario());

        System.out.println(prof2);
        System.out.println(prof2.calcularSalario());*/

    }
}