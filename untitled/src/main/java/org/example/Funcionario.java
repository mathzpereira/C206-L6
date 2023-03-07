package org.example;

public class Funcionario {
    //infos pessoais
    int idade;
    String nome;
    int cpf;
    float salario;

    public Funcionario(int idade, String nome, int cpf, float salario) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void tirarFerias(String mes, int dias) {
        System.out.println("O funcionario " + nome + " tirou ferias no mes de " + mes + " por " + dias + " dias");
    }

    public float salarioAnual() {
        return salario * 12;
    }

    public float salarioAnual(float decimoTerceiro){
        return salario * 12 + decimoTerceiro;
    }

}
