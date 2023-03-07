package org.example;

public class Nave {
    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    Arma arma;

    public Nave(String nome, int velocidade, boolean velocidadeDaLuz, Arma arma) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;
        this.arma = arma;
    }

    public void mostraInfo(){
        System.out.println("Nome da nave: " + this.nome);
        System.out.println("Velocidade da nave: " + this.velocidade);
        if(this.arma == null){
            System.out.println("Não tem arma adicionada");
        }
        System.out.println("Tipo da arma: " + this.arma.tipo);
        System.out.println("Dano da arma: " + this.arma.dano);
    }

    public void viajarVelocidadeDaLuz(){
        if(this.velocidadeDaLuz==true)
            System.out.println("Viaja na velocidade da luz");
        else
            System.out.println("Viaja na velocidade normal");
    }

    public void addArma(Arma arma){
        System.out.println("Arma adicionada");
        this.arma = arma;
    }
}
