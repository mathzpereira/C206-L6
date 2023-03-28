package org.example;

public class Aldeia {
    // Características da Aldeia
    String nome;
    int qtdMoradores;
    String regiao;
    // Array que contém os ninjas da Aldeia
    Ninja[] ninjas = new Ninja[10];

    // Método para add um Ninja na Aldeia pelo array
    public void adicionarNinja(Ninja ninja) {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] == null) {
                ninjas[i] = ninja;
                break;
            }
        }
    }

    // Método para mostrar todas as informações da Aldeia incluindo os Ninjas
    public void mostraInfo() {
        System.out.println("Aldeia " + nome);
        System.out.println("Quantidade de Moradores: " + qtdMoradores);
        System.out.println("Região: " + regiao);
        System.out.println("Ninjas: ");
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                ninjas[i].mostraInfo();
            }
        }
    }

    // Método para mostrar os Ninjas que estão no Rank S
    public void rankingS() {
        System.out.println("Ninjas no Rank S: ");
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null && ninjas[i].ranking.equals("S"))
                System.out.print(ninjas[i].nome + " ");
        }
    }

    // Método para mostrar a quantidade de Ninjas com cada título
    public void qtdTitulos() {
        int gennin = 0, chunnin = 0, anbu = 0;

        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                if(ninjas[i].titulo.equals("Gennin"))
                    gennin++;
                if(ninjas[i].titulo.equals("Chunnin"))
                    chunnin++;
                if(ninjas[i].titulo.equals("ANBU"))
                    anbu++;
            }
        }

        System.out.println("Quantidade de Ninjas com cada título");
        System.out.println("Gennin: " + gennin);
        System.out.println("Chunnin: " + chunnin);
        System.out.println("ANBU: " + anbu);
    }
}


