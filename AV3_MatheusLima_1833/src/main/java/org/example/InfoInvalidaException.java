package org.example;

public class InfoInvalidaException extends Exception{
    public InfoInvalidaException() {
        System.out.println("Não foi possível cadastrar o produto. Preço ou tipo inválido.");
    }
}
