package org.example;

public class Livro {

    String nome;
    int numpags;

    public Livro(String nome, int numpags) {
        this.nome = nome;
        this.numpags = numpags;
    }

    public void mostraInfo(){
        System.out.println("Nome do livro: " + this.nome);
        System.out.println("Número de páginas: "+ this.numpags);
    }
}
