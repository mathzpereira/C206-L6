package org.example;

public class Main {
    public static void main(String[] args) {

        // Instanciando as classes
        Squirtle squirtle = new Squirtle("Squirtle", "Água", 200);
        Bulbassaur bulbassaur = new Bulbassaur("Bulbassaur","Planta",400);
        Pikachu pikachu = new Pikachu("Pikachu", "Elétrico", 500, 300);
        HeldItem h1 = new HeldItem("Água");
        HeldItem h2 = new HeldItem("Planta");
        HeldItem h3 = new HeldItem("Elétrico");
        Treinador treinador = new Treinador("Mathz");

        // Agregação do Helditem
        //squirtle.helditem = h1;
        bulbassaur.helditem = h2;
        pikachu.helditem = h3;

        // Adicionando as instâncias de Pokémon ao array do Treinador
        treinador.addPokemon(squirtle);
        treinador.addPokemon(bulbassaur);
        treinador.addPokemon(pikachu);

        // Utilizando métodos
        squirtle.atacar();
        squirtle.fazerBarulho();
        bulbassaur.atacar();
        bulbassaur.fazerBarulho();
        bulbassaur.ataqueEspecial();
        pikachu.atacar();
        pikachu.fazerBarulho();
        pikachu.ataqueEspecial();
        treinador.mostraInfo();

        // Mostrando quantos pokémons há na cidade através do atributo static
        System.out.println("Quantidade de pokémons na cidade: " + Pokemon.qtdPokemon);

    }
}