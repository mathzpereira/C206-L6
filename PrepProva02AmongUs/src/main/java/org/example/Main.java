package org.example;

public class Main {
    public static void main(String[] args) {
        // Instanciando as classes
        Skin skin1 = new Skin("Carteiro");
        Pet pet1 = new Pet("Galo Doido");
        Pet pet2 = new Pet("Sunny");
        Skin skin2 = new Skin ("Fazendeiro");
        Tripulante tripulante = new Tripulante("Preto", "Mathz", 4);
        Impostor impostor = new Impostor("Azul", "Fennec");

        // Adicionando Skin e Pet aos Astronautas (agregação)
        tripulante.skin = skin1;
        tripulante.pet = pet1;
        impostor.skin = skin2;
        impostor.pet = pet2;

        // Instanciando array de Astronautas e inserindo os objetos
        Astronauta[] astronautas = new Astronauta[2];
        astronautas[0] = tripulante;
        astronautas[1] = impostor;

        // Utilizando métodos
        tripulante.verCameras();
        impostor.verCameras();
        tripulante.reparar();
        impostor.reparar();
        tripulante.reportar();
        impostor.reportar();
        tripulante.fazerMissao();
        tripulante.fazerMissao();
        impostor.fazerMissao();
        impostor.usarVentoinha();
        impostor.trancarPortas("Cozinha");
        impostor.sabotarLuz();
        impostor.sabotarComunicacao();
        impostor.sabotarOxigenio();
        impostor.sabotarReator();
        impostor.executar();

        // Percorrendo o array de Astronautas para mostrar as informações

        for (int i = 0; i < astronautas.length; i++){
            if(astronautas[i] != null){
                if(astronautas[i] instanceof Tripulante){
                    Tripulante t = (Tripulante) astronautas[i];
                    t.mostraInfo();
                }
                else if(astronautas[i] instanceof Impostor){
                    Impostor im = (Impostor) astronautas[i];
                    im.mostraInfo();
                }
            }
        }

    }
}