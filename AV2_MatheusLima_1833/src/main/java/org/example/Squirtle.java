package org.example;

public class Squirtle extends Pokemon implements FazerBarulho{ // Herança e Implementação da interface

    // Atributo específico
    private float multiplicadorAgua;

    // Construtor
    public Squirtle(String nome, String tipo, float multiplicadorAgua) {
        super(nome, tipo);
        this.multiplicadorAgua = multiplicadorAgua;
    }

    // Métodos sobrescritos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Espécie: Squirtle");
        System.out.println("Multiplicador Água: " + multiplicadorAgua);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " está fazendo barulho");
    }
}
