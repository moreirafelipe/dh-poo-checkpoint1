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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(LocalDate data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
