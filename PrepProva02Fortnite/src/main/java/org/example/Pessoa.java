package org.example;

// Classe abstrata para herança
public abstract class Pessoa {

    // Atributos
    public static int qtdPessoa = 0; // Atributo estático pertence à classe
    private String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
        qtdPessoa++; // Contador da variável estática
    }

    // Métodos
    public void mostraInfo(){
        System.out.println("Nome: " + nome);
    }

    public abstract void fazMissao();

    // Getter para atributo privado
    public String getNome() {
        return nome;
    }
}
