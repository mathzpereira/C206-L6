package org.example;

public class Sedan extends Carro{
    int portaMalas;

    public Sedan(double valor, String cor, int ano, int portaMalas) {
        super(valor, cor, ano);
        this.portaMalas = portaMalas;
    }
}
