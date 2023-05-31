package org.example;

public class Mago extends Habitante implements Cura, Feitico{

    private String cor;

    public Mago(String nome, int idade, float energia, String cor) {
        super(nome, idade, energia);
        this.cor = cor;
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo: Mago");
        System.out.println("Cor: " + cor);
    }

    @Override
    public void curar() {
        energia = energia * 1.15F;
        System.out.println("O mago foi curado");
    }

    @Override
    public void lancaFeitico() {
        energia = energia * 0.9F;
        System.out.println("O mago lançou um feitiço");
    }
}
