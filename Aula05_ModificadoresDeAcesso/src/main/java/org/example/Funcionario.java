package org.example;

public class Funcionario {
    private static int cont = 0;
    private double salario;

    String nome;
    int id;

    public Funcionario(String nome, double salario) {
        cont++;
        this.nome = nome;
        this.id = cont;
        this.salario = salario;
    }

    public void mostraInfos(){
        System.out.println("Nome do Funcionário: " + nome);
        System.out.println("ID do Funcionário: " + id);
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Funcionario.cont = cont;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
