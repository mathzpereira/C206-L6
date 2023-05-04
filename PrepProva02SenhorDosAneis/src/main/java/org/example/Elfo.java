package org.example;

public class Elfo extends Habitante implements Cura{

    private String tribo;

    public Elfo(String nome, int idade, float energia, String tribo) {
        super(nome, idade, energia);
        this.tribo = tribo;
    }

    public void viajar(){
        System.out.println("O elfo está viajando");
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo: Anão");
        System.out.println("Tribo: " + tribo);
    }

    @Override
    public void curar() {
        energia = energia * 1.15F;
        System.out.println("O elfo foi curado");
    }
}
