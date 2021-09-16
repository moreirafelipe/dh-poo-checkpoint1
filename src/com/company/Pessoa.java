package com.company;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;
    private String telefone;
    private LocalDate data_de_nascimento;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String telefone, LocalDate data_de_nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.data_de_nascimento = data_de_nascimento;
    }

    @Override
    public String toString() {
        return
                "Nome: '" + nome + '\'' +
                ", Telefone='" + telefone + '\'' +
                ", Data_de_nascimento=" + data_de_nascimento +
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

}
