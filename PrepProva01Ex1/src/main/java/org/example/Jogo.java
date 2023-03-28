package org.example;

public class Jogo {
    String nome;
    String genero;
    double preco;
    boolean dlc;

    public Jogo(String nome, String genero, double preco, boolean dlc) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
    }

    public void mostraInfo() {
        System.out.println("Nome do Jogo: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Preço: R$ " + preco);
        if (dlc)
            System.out.println("DLC disponível: Sim");
        else
            System.out.println("DLC disponível: Não");
    }
}
