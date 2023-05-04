package org.example;

public class Arquiteto extends Funcionario {
    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Informações do Arquiteto");
        super.mostraInfo();
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O arquiteto está fazendo uma planta");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 700;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
