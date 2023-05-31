package org.example;

import Exercicio1.Arquivo;
import Exercicio1.Funcionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo();
        Funcionarios f1 = new Funcionarios();
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.println("Bem-vindo ao menu");
            System.out.println("1- Cadastrar funcionário");
            System.out.println("2- Listar funcionário");
            System.out.println("3- Sair");
            int op = in.nextInt();
            switch (op){
                case 1:
                    in.nextLine();
                    System.out.print("Nome do Funcionário: ");
                    f1.setNomeFunc(in.nextLine());
                    System.out.print("CPF: ");
                    f1.setCpfFunc(in.nextLine());
                    System.out.print("Idade: ");
                    f1.setIdadeFunc(in.nextInt());

                    arquivo.escrever(f1);
                    break;
                case 2:
                    ArrayList <Funcionarios> funcionarios = arquivo.ler();
                    Collections.sort(funcionarios);
                    for (int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(funcionarios.get(i).getNomeFunc());
                        System.out.println(funcionarios.get(i).getCpfFunc());
                        System.out.println(funcionarios.get(i).getIdadeFunc());
                    }
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }

    }
}