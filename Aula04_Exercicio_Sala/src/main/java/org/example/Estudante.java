package org.example;

public class Estudante {
    String nome;
    int idade;
    String ano;

    void mostraInfo(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("O aluno está no " + ano + " ano");
    }

    public Estudante(String nome, int idade, String ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }
}
