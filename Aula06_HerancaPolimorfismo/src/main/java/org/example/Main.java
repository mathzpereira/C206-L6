package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[5];
        Arquiteto arq = new Arquiteto("José", 25, 5000, "Casas");
        Engenheiro eng = new Engenheiro("Renzo", 32, 27000, "Software");
        Professor prof = new Professor("Guaracy", 55, 20000, "Sinais e Sistemas");

        funcionarios[0] = arq;
        funcionarios[1] = eng;
        funcionarios[2] = prof;

        for(int i=0; i< funcionarios.length; i++){
            if(funcionarios[i] != null){
                if(funcionarios[i] instanceof Engenheiro){
                    Engenheiro e = (Engenheiro) funcionarios[i];
                    e.mostraInfo();
                } else if (funcionarios[i] instanceof Professor) {
                    Professor p = (Professor) funcionarios[i];
                    p.mostraInfo();
                } else if (funcionarios[i] instanceof Arquiteto) {
                    Arquiteto a = (Arquiteto) funcionarios[i];
                    a.mostraInfo();
                }
            }
        }

    }
}