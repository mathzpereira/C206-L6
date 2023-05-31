package org.example;

import Exercicio1.Arquivo;
import Exercicio1.Jogo;
import Exercicio1.PrecoNegativoException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo();
        Jogo j = new Jogo();
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Jogo> jogos = new ArrayList<>();


        while (flag) {
            System.out.println("Bem-vindo ao menu");
            System.out.println("1- Cadastrar jogo");
            System.out.println("2- Listar jogos cadastrados");
            System.out.println("3- Ordenar em ordem crescente de preço");
            System.out.println("4- Ordenar em ordem decrescente de preço");
            System.out.println("5- Sair");
            int op = in.nextInt();
            switch (op) {
                case 1:
                    in.nextLine();
                    System.out.print("Nome do Jogo: ");
                    j.setNome(in.nextLine());
                    System.out.print("Preço: ");
                    double aux = Double.parseDouble(in.nextLine());
                    try {
                        if (aux < 0) {
                            throw new PrecoNegativoException();
                        } else {
                            j.setPreco(aux);
                        }
                    } catch (PrecoNegativoException e) {
                        break;
                    }
                    System.out.print("Gênero: ");
                    j.setGenero(in.nextLine());

                    arquivo.escrever(j);
                    break;
                case 2:
                    jogos = arquivo.ler();
                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.println(jogos.get(i).getNome());
                        System.out.println(jogos.get(i).getPreco());
                        System.out.println(jogos.get(i).getGenero());
                    }
                    break;
                case 3:
                    Collections.sort(jogos);
                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.println(jogos.get(i).getNome());
                        System.out.println(jogos.get(i).getPreco());
                        System.out.println(jogos.get(i).getGenero());
                    }
                    break;
                case 4:
                    Collections.sort(jogos, Collections.reverseOrder());
                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.println(jogos.get(i).getNome());
                        System.out.println(jogos.get(i).getPreco());
                        System.out.println(jogos.get(i).getGenero());
                    }
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }

    }
}