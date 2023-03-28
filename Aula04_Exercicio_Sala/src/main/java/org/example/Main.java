package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Escola escola = new Escola("Inatel", "inatel@inatel.br", 12345678, "Rua 2");

        boolean flag = true; // booleano para controlar o loop do menu

        while (flag) {
            System.out.println("Bem-vindo a " + escola.nome);
            System.out.println("1- Cadastrar um novo estudante");
            System.out.println("2- Mostrar as informações da escola");
            System.out.println("3- Mostrar a quantidade de alunos em cada ano");
            System.out.println("4- Sair do menu");
            int op = in.nextInt();
            switch (op) {
                case 1:
                    in.nextLine(); // string após int precisa disso para não bugar

                    System.out.print("Digite o nome do estudante: ");
                    String nome = in.nextLine();
                    System.out.print("Digite a idade do estudante: ");
                    int idade = in.nextInt();
                    System.out.print("Digite o ano do estudante: ");
                    in.nextLine(); // string após int precisa disso para não bugar
                    String ano = in.nextLine();

                    Estudante e = new Estudante(nome, idade, ano);
                    escola.addEstudante(e);
                    System.out.println("Estudante adicionado com sucesso!");

                    break;
                case 2:
                    escola.mostraInfo();
                    break;
                case 3:
                    escola.QtdEstudantesPorAno();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Digite um número válido");
                    break;
            }

        }
    }
}