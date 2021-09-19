package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boletim {

    private String periodo;
    //Hashmap para armazenamento e organização de disciplinas por chave e valor com auto-incremento de id
    private HashMap<Integer, Disciplina> disciplinas = new HashMap<Integer, Disciplina>();

    Colegio colegio = new Colegio();

    public Boletim(String periodo) {
        this.periodo = periodo;
        this.disciplinas.put(01, new Disciplina("Portugues"));
        this.disciplinas.put(02, new Disciplina("Matematica"));
        this.disciplinas.put(03, new Disciplina("Ciencias"));
        this.disciplinas.put(04, new Disciplina("Historia"));
    }

    //Método para exibição de dados da classe
    public void mostrarDados(){
        System.out.println("||-------------------------------------------------------------------------------||");
        System.out.println("                                 Histórico escolar                                 ");
        System.out.println("||-------------------------------------------------------------------------------||");
        System.out.println("Período: " + getPeriodo());

        if(disciplinas.size() != 0) {

            for (Map.Entry<Integer, Disciplina> disciplina : disciplinas.entrySet()) {
                disciplina.getValue().mostrarDados();
            }

        } else {

            System.out.println("Não há disciplinas cadastradas!");
        }
    }

    //Método para definição de dados mediante consulta ao array de objetos
    //Integer id, Double nota - params
    public void definirNotas(Integer id) {
        Scanner ler = new Scanner(System.in);

        Disciplina resultado = this.disciplinas.get(id);

        System.out.println("Atribuindo notas para a disciplina: " + resultado.getNome());
        System.out.println("Para qual avaliação deseja atribuir nota?");

        System.out.println("1 - Avaliação 1");
        System.out.println("2 - Avaliação 2");
        System.out.println("3 - Avaliação 3");
        System.out.println("4 - Avaliação 4");

        short opcao = ler.nextShort();


        if(opcao != 0 && opcao <= 4){

            System.out.println("Digite a nota para a Avaliação: " + opcao);
            Double lerNota = ler.nextDouble();

            switch (opcao) {
                case 1: resultado.setNota1(lerNota);
                    break;
                case 2: resultado.setNota2(lerNota);
                    break;
                case 3: resultado.setNota3(lerNota);
                    break;
                case 4: resultado.setNota4(lerNota);
                    break;
            }
        } else {
            System.out.println("Escolha um ID de avaliação válido!");
        }
    }

    public void consultarMedia(Integer id) {

        Scanner ler = new Scanner(System.in);

        Disciplina resultado = this.disciplinas.get(id);

        System.out.println("Sobre qual avaliação da disciplina " + resultado.getNome() + " deseja obter dados?");

        System.out.println("1 - Avaliação 1");
        System.out.println("2 - Avaliação 2");
        System.out.println("3 - Avaliação 3");
        System.out.println("4 - Avaliação 4");

        short opcao = ler.nextShort();


        if(opcao <= 5){

            switch (opcao) {
                case 1: resultado.getNota1();
                    break;
                case 2: resultado.getNota2();
                    break;
                case 3: resultado.getNota3();
                    break;
                case 4: resultado.getNota4();
                    break;
            }
        } else {
            System.out.println("Escolha um ID de avaliação válido!");
        }

    }

    public void definirFaltas(Integer id, int faltas) {
        Disciplina resultado = this.disciplinas.get(id);
        resultado.setFalta(faltas);
    }

    //Modificador de acesso
    public String getPeriodo() {
        return periodo;
    }
}
