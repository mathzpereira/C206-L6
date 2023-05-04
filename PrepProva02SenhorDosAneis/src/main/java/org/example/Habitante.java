package org.example;

public abstract class Habitante {

    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    Arma arma;

    public Habitante(String nome, int idade, float energia) {
        this.id = contador;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        contador++;
    }

    public void atacar(){
        if(arma.isMagica())
            energia = energia - 20;
        else
            energia = energia - 10;
        System.out.println("O herói atacou");
        System.out.println("Nome da arma: " + arma.getNomeArma());
        System.out.println("Arma mágica: " + arma.isMagica());
    }

    public void mostraInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);
    }

}
