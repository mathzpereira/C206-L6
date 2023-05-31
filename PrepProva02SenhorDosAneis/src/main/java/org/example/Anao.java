package org.example;

public class Anao extends Habitante implements Mineracao{

    private float altura;
    private String reino;

    public Anao(String nome, int idade, float energia, float altura, String reino) {
        super(nome, idade, energia);
        //this.id = contador;
        this.altura = altura;
        this.reino = reino;
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo: Anão");
        System.out.println("Altura: " + altura);
        System.out.println("Reino: " + reino);
    }

    @Override
    public void minerar() {
        System.out.println("O anão está minerando");
    }
}
