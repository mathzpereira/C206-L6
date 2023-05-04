package org.example;

public class Main {
    public static void main(String[] args) {
        Anao h1 = new Anao("Álvaro", 20, 100, 1.60F, "Mansão Maromba");
        Elfo h2 = new Elfo("Ewel", 60, 80, "Robot Bulls");
        Mago h3 = new Mago("Xico", 19, 50, "Rosa");
        TerraMedia t = new TerraMedia();
        Arma a1 = new Arma("La Clavadora", true);
        h1.arma = a1;

        t.addHabitante(h1);
        t.addHabitante(h2);
        t.addHabitante(h3);

        h1.atacar();
        h1.minerar();
        t.listarHabitantes();

    }
}