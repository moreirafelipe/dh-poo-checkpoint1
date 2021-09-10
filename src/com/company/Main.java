package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Salas sala01 = new Salas(1, "sim");
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
    }

}