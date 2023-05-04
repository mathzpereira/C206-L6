package org.example;

public class Carro implements Controle{
    private double valor;
    private String cor;
    private int ano;

    public Carro(double valor, String cor, int ano) {
        this.valor = valor;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public void taxa() {
        System.out.println("Taxando");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Informações do carro: ");
        System.out.println("Valor: " + valor);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}
