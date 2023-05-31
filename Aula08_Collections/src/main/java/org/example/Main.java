package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //ArrayList <Integer> arrayinteiro = new ArrayList<>();
        ArrayList <Conta> contas = new ArrayList<>();

        Conta c1 = new Conta("Hulk",9999);
        Conta c2 = new Conta("Paulinho", 123);
        Conta c3 = new Conta("Arana", 9000);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        /*
        arrayinteiro.add(100);
        arrayinteiro.add(12);
        arrayinteiro.add(50);
        arrayinteiro.add(2);

        arrayinteiro.remove((Integer) 2);

        Collections.sort(arrayinteiro);
        Collections.reverse(arrayinteiro);

        for (int i = 0; i < arrayinteiro.size(); i++) {
            System.out.println(arrayinteiro.get(i));
        }
         */

        Collections.sort(contas);

        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).nome);
            System.out.println(contas.get(i).saldo);
        }
    }
}