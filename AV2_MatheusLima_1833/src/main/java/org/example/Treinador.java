package org.example;

public class Treinador {

    String nome;
    Pokemon[] pokemons = new Pokemon[5]; // Composição de Pokémons do Treinador

    // Construtor
    public Treinador(String nome) {
        this.nome = nome;
    }

    // Método para adicionar elementos no array
    public void addPokemon(Pokemon p){
        for(int i = 0; i < pokemons.length; i++){
            if(pokemons[i] == null) {
                pokemons[i] = p;
                break;
            }
        }
    }

    // Método para mostrar as informações do array
    public void mostraInfo(){
        System.out.println("Nome do Treinador: " + nome);
        System.out.println("Pokémons: ");
        for (int i = 0; i < pokemons.length; i++){
            if(pokemons[i] != null){
                if(pokemons[i] instanceof Squirtle){
                    Squirtle s = (Squirtle) pokemons[i];
                    s.mostraInfo();
                }
                else if(pokemons[i] instanceof Bulbassaur){
                    Bulbassaur b = (Bulbassaur) pokemons[i];
                    b.mostraInfo();
                } else if (pokemons[i] instanceof Pikachu) {
                    Pikachu p = (Pikachu) pokemons[i];
                    p.mostraInfo();
                }
            }
        }
    }
}
