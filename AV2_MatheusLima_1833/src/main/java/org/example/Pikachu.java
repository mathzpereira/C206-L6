package org.example;

public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial{ // Herança e Implementação da Interface

    // Atributos específicos
    private float soltarRaios;
    private float paralisiaEletrica;

    // Construtor
    public Pikachu(String nome, String tipo, float soltarRaios, float paralisiaEletrica) {
        super(nome, tipo);
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;
    }

    // Métodos sobrescritos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Espécie: Pikachu");
        System.out.println("Soltar Raios: " + soltarRaios);
        System.out.println("Paralisia Elétrica: " + paralisiaEletrica);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando");
    }

    @Override
    public void ataqueEspecial() {
        if(helditem != null) // Verifica se possui Helditem
            soltarRaios += 200;
        if(soltarRaios > 750) // Lógica para decidir o resultado da bataha
            System.out.println(getNome() + " conseguiu ganhar de seu oponente");
        else
            System.out.println(getNome() + " perdeu a batalha");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " está fazendo barulho");
    }
}
