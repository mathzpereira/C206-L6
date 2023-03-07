package org.example;

public class Main {
    public static void main(String[] args) {

        Arma a1 = new Arma("Água",200);
        Nave n1 = new Nave("João",500,false, a1);
        n1.addArma(a1);
        n1.mostraInfo();
    }
}