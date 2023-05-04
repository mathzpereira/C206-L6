package org.example;

public class Hatch extends Carro{
    int portas;

    public Hatch(double valor, String cor, int ano, int portas) {
        super(valor, cor, ano);
        this.portas = portas;
    }
}
