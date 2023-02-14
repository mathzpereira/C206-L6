package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao almoxarifado");
        System.out.println("resistor | capacitor | protoboard");
        System.out.println("faça sua requisição:");

        Scanner in = new Scanner(System.in);
        String componente = in.nextLine();

        switch (componente) {

            case "resistor":
                System.out.println("vc escolheu resistor");
                break;
            case "capacitor":
                System.out.println("vc escolheu capacitor");
                break;
            case "protoboard":
                System.out.println("vc escolheu protoboard");
            case "al hilal":
                System.out.println("parabéns! ótima escolha!");
        }
    }
}