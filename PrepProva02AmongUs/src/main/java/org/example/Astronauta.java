package org.example;

public abstract class Astronauta { // Classe abstrata para não permitir que seja instanciada
    // Atributos
    public static int cont = 0; // Static pertence à classe e não ao objeto
    private String cor;
    private String nome;
    public Skin skin;
    public Pet pet;

    // Construtor
    public Astronauta(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
        cont++; // Aumenta 1 a cada vez que é instanciado um novo Astronauta
    }

    // Métodos
    public void mostraInfo(){
        System.out.println("Informações do astronauta: ");
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        if(skin != null) // Verifica se possui skin para tomar uma ação diferente
            System.out.println("Skin: " + skin.getTipo());
        else
            System.out.println("O astronauta não possui skin");
        if(pet != null) // Verifica se possui pet para tomar uma ação diferente
            System.out.println("Pet: " + pet.getNome());
        else
            System.out.println("O astronauta não possui pet");
    }

    public void verCameras(){
        System.out.println(nome + " olhou as câmeras");
    }

    // Assinatura de métodos abstratos
    public abstract void reportar();
    public abstract void reparar();

    // Getter para atributo privado
    public String getNome() {
        return nome;
    }
}
