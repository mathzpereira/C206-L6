package org.example;

public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial{ // Herança e Implementação da interface

    // Atributo Específico
    private float luminosidadeAmbiente;

    // Construtor
    public Bulbassaur(String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    // Métodos sobrescritos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Espécie: Bulbassaur");
        System.out.println("Luminosidade Ambiente: " + luminosidadeAmbiente);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando");
    }

    @Override
    public void ataqueEspecial() {
        if(helditem != null) // Verifica se possui Helditem
            luminosidadeAmbiente += 300;
        if(luminosidadeAmbiente > 650) // Lógica para decidir o resultado da bataha
            System.out.println(getNome() + " conseguiu ganhar de seu oponente");
        else
            System.out.println(getNome() + " perdeu a batalha");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " está fazendo barulho");
    }
}
