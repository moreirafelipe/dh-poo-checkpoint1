package com.company;

import java.util.Scanner;

public class Menu {


    private int opcao;

    public Menu(int opcao) {
        this.opcao = opcao;
    }

    public void inicio(){

        Scanner ler = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("\nSeja bem-vindo ao sistema de gestão escolar - SIGESC\n");


        ler.nextDouble();

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void  main(String[] args){
    }
}
