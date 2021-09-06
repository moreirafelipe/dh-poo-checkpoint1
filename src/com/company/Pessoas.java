package com.company;

import java.time.LocalDate;

public class Pessoas {

    private String nome;
    private String telefone;
    private LocalDate data_de_nascimento;
    private String categoria;

    public Pessoas(String nome, String telefone, LocalDate data_de_nascimento, String categoria) {
        this.nome = nome;
        this.telefone = telefone;
        this.data_de_nascimento = data_de_nascimento;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Dados do(a)" + this.categoria +
                "Nome: '" + nome + '\'' +
                ", Telefone='" + telefone + '\'' +
                ", Data_de_nascimento=" + data_de_nascimento +
                ", Categoria='" + categoria + '\'' +
                '}';
    }
}
