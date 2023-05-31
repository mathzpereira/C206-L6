package org.example;

public abstract class Pokemon { // Classe abstrata

    // Atributos
    public static int qtdPokemon = 0; // Atributo static para contar quantos Pokémons foram criados
    private String nome;
    private String tipo;
    public HeldItem helditem; // Agregação do Helditem

    // Construtor
    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        qtdPokemon++; // Adicionando 1 a cada nova instância de Pokémon
    }

    // Métodos
    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        if(helditem != null) // Verificando se possui Helditem
            System.out.println("Tipo do Helditem: " + helditem.tipo);
        else
            System.out.println("Este pokémon não possui Helditem");
    }

    public abstract void atacar(); // Método abstrato


    // Getter para atributo privado
    public String getNome() {
        return nome;
    }
}
