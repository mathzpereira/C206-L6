package org.example;

public class Engenheiro extends Funcionario implements Gerencia {
    String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Informações do Engenheiro:");
        super.mostraInfo();
        System.out.println("Ramo: " + ramo);
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O engenheiro está calculando a soma dos quadrados dos catetos");
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void gerencia() {

    }
}
