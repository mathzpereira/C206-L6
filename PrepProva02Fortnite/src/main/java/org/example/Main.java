package org.example;

public class Main {
    public static void main(String[] args) {
        // Instanciando as Classes
        Bot b = new Bot("Gabriel Maia", true);
        Jogador j = new Jogador("Fennec Blue", 5,true, 50, 50);
        Pessoa[] pessoas = new Pessoa[2];
        Skin skin = new Skin("Neymar Jr","Ultra-rara");
        Mochila mochila = new Mochila("Épica");

        // Atribuindo skin e mochila ao Jogador por meio de agregação
        j.skin = skin;
        j.mochila = mochila;

        // Colocando os objetos no array
        pessoas[0] = b;
        pessoas[1] = j;

        // Utilizando métodos
        b.fazMissao();
        b.passarMissao();
        j.fazMissao();
        j.recuperarVida();
        j.recuperarEscudo();
        j.comprarVbucks();
        j.gastarVbucks();

        // Mostrando atributo static
        System.out.println("Quantidade de pessoas: " + Pessoa.qtdPessoa);

        // Percorrendo o array para mostrar as informações
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] != null){
                if(pessoas[i] instanceof Bot){
                    Bot b1 = (Bot) pessoas[i];
                    b1.mostraInfo();
                }
                if(pessoas[i] instanceof Jogador){
                    Jogador j1 = (Jogador) pessoas[i];
                    j1.mostraInfo();
                }
            }
        }
    }
}