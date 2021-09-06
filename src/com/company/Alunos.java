package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alunos extends Pessoas {

    private int id_alunos;
    private String endereco;
    private Turmas turma;
    private Boletins boletim;
    private ArrayList <Boletins> boletins; //instanciando um novo array que vai conter objetos do tipo Boletins;

    // quando gera um construtor, ele surge com os atributos gerais da superclasse(pai); os atributos da subclasse(filho) devem ser adicionados após;

    public Alunos(String nome, String telefone, LocalDate data_de_nascimento, String categoria, String endereco, Turmas turma) {
        super(nome, telefone, data_de_nascimento, categoria);

        this.endereco = endereco;
        this.turma = turma;
        this.boletins = new ArrayList<>();
    }


}
