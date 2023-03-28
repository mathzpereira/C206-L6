package org.example;

public class Escola {
    String nome;
    String email;
    int numTelefone;
    String endereco;
    Estudante[] estudantes = new Estudante[300];

    public Escola(String nome, String email, int numTelefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }

    public void addEstudante(Estudante e) {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] == null) {
                estudantes[i] = e;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Informações da escola " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + numTelefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Estudantes: ");
        for (int i = 0; i < estudantes.length; i++) {
            if(estudantes[i] != null)
            estudantes[i].mostraInfo();
        }
    }

    public void QtdEstudantesPorAno() {
        int n1 = 0, n2 = 0, n3 = 0; // contador para cada um dos anos

        for (int i = 0; i < estudantes.length; i++) {
            if(estudantes[i] != null) {
                if (estudantes[i].ano.equals("Primeiro"))
                    n1++;
                else if (estudantes[i].ano.equals("Segundo"))
                    n2++;
                else if (estudantes[i].ano.equals("Terceiro"))
                    n3++;
            }
        }

        System.out.println("Quantidade de alunos: ");
        System.out.println("Primeiro: " + n1);
        System.out.println("Segundo: " + n2);
        System.out.println("Terceiro: " + n3);
    }

}
