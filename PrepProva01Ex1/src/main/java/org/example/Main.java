package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        plataforma.nome = "GaloGames";
        plataforma.criador = "Mathz";

        while(flag){
            System.out.println("Bem vindo à plataforma " + plataforma.nome);
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Adicionar um novo jogo");
            System.out.println("2- Mostrar as informações da plataforma e seus jogos");
            System.out.println("3- Mostrar o nome do jogo mais caro e mais barato");
            System.out.println("4- Calcular quantos jogos possuem DLC");
            System.out.println("5- Sair do Menu");
            int op;
            op = sc.nextInt();
            System.out.println("");
            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.print("Digite o nome do jogo: ");
                    String nomeJogo = sc.nextLine();
                    System.out.print("Digite o gênero do jogo: ");
                    String genero = sc.nextLine();
                    System.out.print("Digite o preço do jogo: ");
                    double preco = sc.nextDouble();
                    System.out.print("O jogo possui DLC? (true or false): ");
                    boolean dlc = sc.nextBoolean();

                    Jogo novoJogo = new Jogo(nomeJogo,genero,preco,dlc);
                    plataforma.adicionarJogo(novoJogo);
                    break;
                case 2:
                    plataforma.mostraInfo();
                    break;
                case 3:
                    plataforma.mostraMaisCaroBarato();
                    break;
                case 4:
                    plataforma.calculaDlc();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Digite um número válido");
                    break;
            }
            System.out.println("");
        }
    }
}