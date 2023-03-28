package org.example;

public class Serie {
    String nome;
    double nota;
    int temporadas;
    boolean finalizada;
    Diretor diretor;

    public Serie(String nome, double nota, int temporadas, boolean finalizada, String nomeDiretor) {
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        this.diretor = new Diretor(nomeDiretor);
    }

    public void mostraInfo(){
        System.out.println("Informações da série:");
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Finalizada: " + finalizada);
        System.out.println("Diretor" + this.diretor);
    }
}
