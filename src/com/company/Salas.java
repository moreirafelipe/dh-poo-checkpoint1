package com.company;

public class Salas {

    private int id_salas;
    private String disponivel;

    public Salas(int idSalas, String disponivel) {
        this.id_salas = idSalas;
        this.disponivel = disponivel;
    }

    public int getId_salas() {
        return id_salas;
    }

    public void setId_salas(int id_salas) {
        this.id_salas = id_salas;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }
}
