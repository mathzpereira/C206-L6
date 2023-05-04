package org.example;

public class Professor extends Funcionario {

    String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Matéria: " + materia);
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O professor está dando aula");
    }

    public void corrigirProvas() {
        System.out.println("O professor " + getNome() + " está corrigindo provas");
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
