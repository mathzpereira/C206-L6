package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        boolean flag = true;
        int op;
        Scanner sc = new Scanner(System.in);

        while (flag){
            System.out.println("Bem-vindo à Plataforma " + plataforma.nome);
            System.out.println("Escolha uma opção:");
            System.out.println("1- Adicionar uma série na plataforma");
            System.out.println("2- Mostrar as informações da plataforma e suas séries");
            System.out.println("3- Mostrar o nome da série com maior número de temporadas que já foi finalizada");
            System.out.println("4- Mostrar a porcentagem do número de séries e a média aritmética de notas das que possuem 3 ou mais temporadas");
            System.out.println("5- Sair do menu");
            op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.print("Digite o nome da série: ");
                    String nomeSerie = sc.nextLine();
                    System.out.print("Digite a nota da série: ");
                    double nota = sc.nextDouble();
                    System.out.print("Digite o número de temporadas: ");
                    int numTemp = sc.nextInt();
                    System.out.print("A série já foi finalizada? (true or false): ");
                    boolean finalizada = sc.nextBoolean();
                    System.out.print("Qual o nome do diretor da série? ");
                    sc.nextLine();
                    String nomeDoDiretor = sc.nextLine();
                    Serie serie = new Serie(nomeSerie, nota, numTemp, finalizada, nomeDoDiretor);
                    plataforma.addSerie(serie);
                    System.out.println("Série adicionada com sucesso!");
                    break;
                case 2:
                    plataforma.mostraInfo();
                    break;
                case 3:
                    System.out.println("A serie com mais temporadas já finalizada é: " + plataforma.serieMaisLongaFinalizada());
                    break;
                case 4:
                    plataforma.mediaPorcentagem();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        }
        sc.close();
    }
}