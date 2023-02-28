package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // declarando entrada

        // entrada de dados
        System.out.println("Digite o peso e a altura para calcular o IMC: ");
        float peso = entrada.nextFloat();
        float altura = entrada.nextFloat();

        // cálculo do imc
        float imc = peso / (altura*altura);

        // saída com imc formatada em 2 casas decimais
        System.out.println("Seu IMC é de "+String.format("%.2f",imc));

        // saída com a classificação de acordo com o imc
        System.out.print("Sua classificação é: ");
        if(imc<18.5)
            System.out.println("Abaixo do Peso");
        if(imc>=18.5 & imc<25)
            System.out.println("Peso Normal");
        if(imc>=25 & imc<30)
            System.out.println("Sobrepeso");
        if(imc>=30 & imc<35)
            System.out.println("Obesidade Grau I");
        if(imc>=35 & imc<40)
            System.out.println("Obesidade Grau II");
        if(imc>=40)
            System.out.println("Obesidade Grau III ou Mórbida");
    }
}