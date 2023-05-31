package org.example;

public class Jogador extends Pessoa implements Recuperar, Loja{

    // Atributos e agregação
    private int nivel;
    private boolean passeBatalha;
    private int vida;
    private int escudo;
    public Skin skin;
    public Mochila mochila;

    // Construtor
    public Jogador(String nome, int nivel, boolean passeBatalha, int vida, int escudo) {
        super(nome);
        this.nivel = nivel;
        this.passeBatalha = passeBatalha;
        this.vida = vida;
        this.escudo = escudo;
    }

    // Sobrescrita de métodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo: Jogador");
        System.out.println("Nível: " + nivel);
        System.out.println("Passe de Batalha: " + passeBatalha);
        System.out.println("Vida: " + vida);
        System.out.println("Escudo: " + escudo);
        if(skin != null){
            System.out.println("Nome da skin: " + skin.getNome());
            System.out.println("Raridade da skin: " + skin.getRaridade());
        }
        else
            System.out.println("Este jogador não possui skin");
        if(mochila != null){
            System.out.println("Raridade da mochila: " + mochila.getRaridade());
        }
        else
            System.out.println("Este jogador não possui mochila");

    }

    @Override
    public void fazMissao() {
        System.out.println(getNome() + " completou uma missão!");
        nivel++;
    }

    @Override
    public void gastarVbucks() {
        System.out.println("Gastou V Bucks na loja");
    }

    @Override
    public void comprarVbucks() {
        System.out.println("Comprou V Bucks na loja");
    }

    @Override
    public void recuperarVida() {
        vida += 15;
        if(vida > 100)
            vida = 100;
    }

    @Override
    public void recuperarEscudo() {
        escudo += 25;
        if(escudo > 100)
            escudo = 100;
    }
}
