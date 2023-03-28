package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aldeia aldeia = new Aldeia(); // Instanciando a classe Aldeia
        Scanner in = new Scanner(System.in); // Criando a entrada (Scanner)
        boolean flag = true; // Flag para controlar o loop do while

        // Caracterísitcas pré-definidas da classe Aldeia
        aldeia.nome = "Atlético";
        aldeia.regiao = "MG";
        aldeia.qtdMoradores = 200;

        while(flag){
            System.out.println("\nBem vindo à Aldeia " + aldeia.nome);
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Adicionar um novo ninja");
            System.out.println("2- Mostrar as informações da aldeia e seus ninjas");
            System.out.println("3- Mostrar os nomes dos ninjas classificados no rank S");
            System.out.println("4- Mostrar a quantidade de ninjas Gennin, Chunnin e ANBU");
            System.out.println("0- Sair do Menu");
            int op; // Opção do menu (switch)
            op = in.nextInt();
            switch (op){
                case 1:
                    in.nextLine();
                    System.out.print("Digite o nome do ninja: ");
                    String nomeNinja = in.nextLine();
                    System.out.print("Digite a idade do ninja: ");
                    int idade = in.nextInt();
                    System.out.print("Digite o título do ninja (Gennin, Chunnin ou ANBU): ");
                    in.nextLine();
                    String titulo = in.nextLine();
                    System.out.print("Digite o rank do ninja (S, A, B, C, D): ");
                    String rank = in.nextLine();


                    // Instanciando um Ninja com as informações da entrada
                    Ninja novoNinja = new Ninja(nomeNinja,idade,titulo,rank);
                    // Adicionando o Ninja criado no array de ninjas da classe Aldeia utilizando um método
                    aldeia.adicionarNinja(novoNinja);
                    break;
                case 2:
                    aldeia.mostraInfo();
                    break;
                case 3:
                    aldeia.rankingS();
                    break;
                case 4:
                    aldeia.qtdTitulos();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        }
    }
}