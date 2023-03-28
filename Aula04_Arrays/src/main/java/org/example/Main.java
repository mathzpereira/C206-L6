package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();
        b1.nome = "Hulkteca";

        boolean flag = true;

        while(flag){
            System.out.println("BEM-VINDO AO MENU DA BIBLIOTECA");
            System.out.println("1- Cadastrar um livro");
            System.out.println("2- Mostrar as informações dos livros cadastrados");
            System.out.println("3 - Sair do Menu");

            int op;
            op = entrada.nextInt();

            switch (op){
                case 1:
                    entrada.nextLine(); // string após int precisa disso para não bugar

                    System.out.print("Digite o nome do livro: ");
                    String nomeLivro = entrada.nextLine();
                    System.out.print("Digite a quantidade de páginas: ");
                    int numpags = entrada.nextInt();

                    Livro l = new Livro(nomeLivro,numpags);
                    b1.addLivro(l);
                    System.out.println("Livro adicionado com sucesso!");

                    break;
                case 2:
                    b1.mostraInfo();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Digite um número válido");
                    break;
            }
        }
        entrada.close();

    }
}