package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(20,"Mathz",123456789,500);
        Funcionario f2 = new Funcionario(17,"Jaum",123789456,400);

        f1 = f2;

        if(f1==f2)
            System.out.println(f1.nome);
        else
            System.out.println("São diferentes");
    }
}