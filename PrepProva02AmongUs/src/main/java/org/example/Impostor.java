package org.example;

public class Impostor extends Astronauta implements Missao, Sabotar, Executar{ // Herança e Interfaces implementadas
    // Atributo Especial
    private int qtdMortes = 0;

    public Impostor(String cor, String nome) {
        super(cor, nome);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Classe: Impostor");
        System.out.println("Quantidade de kills: " + qtdMortes);
    }

    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilação");
    }

    public void trancarPortas(String local){
        System.out.println("O impostor trancou as portas do(a) " + local);
    }

    @Override
    public void executar() {
        System.out.println(getNome() + " matou um tripulante");
        qtdMortes++;
    }

    @Override
    public void fazerMissao() {
        System.out.println(getNome() +" fez uma tarefa falsa");
    }

    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o oxigênio");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a comunicação");
    }

    @Override
    public void reportar() {
        System.out.println(getNome() + " fez um self report");
    }

    @Override
    public void reparar() {
        System.out.println(getNome() + " fingiu que fez um reparo");
    }
}
