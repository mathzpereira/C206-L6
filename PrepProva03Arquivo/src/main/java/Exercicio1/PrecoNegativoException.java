package Exercicio1;

public class PrecoNegativoException extends Exception{
    public PrecoNegativoException() {
        System.out.println("Não foi possível registrar o produto. O preço digitado é inválido.");
    }
}
