package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo();
        Produto j = new Produto();
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Produto> produtos = new ArrayList<>();
        int comida = 0;
        int higiene = 0;
        int decoracao = 0;

        while (flag) {
            System.out.println("Bem-vindo ao menu");
            System.out.println("1- Cadastrar produto");
            System.out.println("2- Listar produtos cadastrados");
            System.out.println("3- Ordenar em ordem decrescente de preço");
            System.out.println("4- Mostrar a quantidade de produtos existentes na loja de cada tipo");
            System.out.println("5- Sair");
            int op = in.nextInt();
            switch (op) {
                case 1:
                    in.nextLine();
                    System.out.print("Nome do Produto: ");
                    j.setNome(in.nextLine());
                    System.out.print("Preço: ");
                    double aux1 = in.nextDouble();
                    System.out.print("Tipo (Comida, Higiene ou Decoração): ");
                    in.nextLine();
                    String aux2 = in.nextLine();
                    try {
                        if (aux1 <= 0 || (!aux2.equals("Comida") && !aux2.equals("Higiene") && !aux2.equals("Decoração"))) {
                            throw new InfoInvalidaException();
                        } else {
                            j.setPreco(aux1);
                            j.setTipo(aux2);
                        }
                    } catch (InfoInvalidaException e) {
                        break;
                    }

                    arquivo.escrever(j);
                    break;
                case 2:
                    produtos = arquivo.ler();
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println(produtos.get(i).getNome());
                        System.out.println(produtos.get(i).getPreco());
                        System.out.println(produtos.get(i).getTipo());
                    }
                    break;
                case 3:
                    Collections.sort(produtos, Collections.reverseOrder());
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println(produtos.get(i).getNome());
                        System.out.println(produtos.get(i).getPreco());
                        System.out.println(produtos.get(i).getTipo());
                    }
                    break;
                case 4:
                    for (int i = 0; i < produtos.size(); i++) {
                        if(produtos.get(i).getTipo().equals("Comida"))
                            comida++;
                        else if (produtos.get(i).getTipo().equals("Higiene")) {
                            higiene++;
                        } else if (produtos.get(i).getTipo().equals("Decoração")) {
                            decoracao++;
                        }
                    }
                    System.out.println("Quantidade de Produtos de cada tipo:");
                    System.out.println("Comida: " + comida);
                    System.out.println("Higiene: " + higiene);
                    System.out.println("Decoração: " + decoracao);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }

    }
}