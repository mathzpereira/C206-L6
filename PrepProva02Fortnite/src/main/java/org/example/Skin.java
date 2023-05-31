package org.example;

public class Skin {

    // Atributos
    private String nome;
    private String raridade;

    public Skin(String nome, String raridade) {
        this.nome = nome;
        this.raridade = raridade;
    }

    // Getter e setter para atributos privados

    public String getNome() {
        return nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
}
