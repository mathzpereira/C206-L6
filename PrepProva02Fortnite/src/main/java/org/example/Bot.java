package org.example;

// Herança e Implementação de Interface
public class Bot extends Pessoa implements Interacao{

    // Atributo
    private boolean hostil;

    // Construtor
    public Bot(String nome, boolean hostil) {
        super(nome);
        this.hostil = hostil;
    }

    // Métodos com sobrescrita
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo: Bot");
    }

    @Override
    public void fazMissao() {
        if(hostil)
            System.out.println("Atrapalhou o jogador a fazer a missão");
        else
            System.out.println("Ajudou o jogador a fazer a missão");
    }

    @Override
    public void passarMissao() {
        if(hostil)
            System.out.println("Este bot não passa missões!");
        else
            System.out.println("Este bot passa missões!");
    }
}
