package org.example;

public class Conta implements Comparable<Conta>{

    String nome;

    double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }


    @Override
    public int compareTo(Conta o) {
        return Double.compare(this.saldo,o.saldo);
    }
}
