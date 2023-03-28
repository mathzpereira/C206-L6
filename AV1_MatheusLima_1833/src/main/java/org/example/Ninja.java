package org.example;

public class Ninja {
    // Características do Ninja
    String nome;
    int idade;
    String titulo;
    String ranking;

    // Construtor para criar um Ninja utilizando parâmetros
    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    // Método para mostrar as informações do ninja no terminal
    void mostraInfo(){
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Título: " + titulo);
        System.out.println("Rank: " + ranking);
    }
}
