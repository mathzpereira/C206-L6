package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Matheus", 1000);
        Funcionario f2 = new Funcionario("Hulk", 999999);
        Funcionario f3 = new Funcionario("Paulinho", 100000);

        f1.mostraInfos();
        f2.mostraInfos();
        f3.mostraInfos();

    }
}