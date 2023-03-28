package org.example;

public class Plataforma {
    String nome;
    String criador;
    Jogo[] jogos = new Jogo[10];

    public void mostraInfo() {
        System.out.println("Plataforma " + nome);
        System.out.println("Criada por: " + criador);
        System.out.println("Jogos disponíveis: ");
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {
                jogos[i].mostraInfo();
            }
        }
    }

    public void adicionarJogo(Jogo jogo) {
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] == null) {
                jogos[i] = jogo;
                break;
            }
        }
    }

    public void mostraMaisCaroBarato() {
        double maior = -999, menor = 999;
        String nomeMaior = "", nomeMenor = "";
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {
                if (jogos[i].preco > maior) {
                    maior = jogos[i].preco;
                    nomeMaior = jogos[i].nome;
                }
                if (jogos[i].preco < menor) {
                    menor = jogos[i].preco;
                    nomeMenor = jogos[i].nome;
                }
            }
        }
        System.out.println("Jogo mais caro: " + nomeMaior);
        System.out.println("Jogo mais Barato: " + nomeMenor);
    }

    public void calculaDlc() {
        int cont = 0; // conta quantos jogos tem dlc
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {
                if (jogos[i].dlc == true)
                    cont++;
            }
        }
        System.out.println("Há " + cont + " jogos com DLC");
    }
}
