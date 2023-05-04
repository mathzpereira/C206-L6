package org.example;

public class Tripulante extends Astronauta implements Missao{ // Herança e Interface implementada
    // Atributo especial
    private int qtdMissoes;

    // Construtor
    public Tripulante(String cor, String nome,  int qtdMissoes) {
        super(cor, nome);
        this.qtdMissoes = qtdMissoes;
    }

    // Métodos sobrescritos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Classe: Tripulante");
        System.out.println("Quantidade de missões: " + qtdMissoes);
    }

    @Override
    public void fazerMissao() {
        System.out.println(getNome() + " fez uma missão");
        qtdMissoes--;
    }

    @Override
    public void reportar() {
        System.out.println(getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(getNome() + " fez um reparo");
    }
}
