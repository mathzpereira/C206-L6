package org.example;

public class Biblioteca {

    String nome;
    Livro[] livros = new Livro[10];

    public void mostraInfo(){
        System.out.println("Nome da biblioteca: " + nome);
        for(int i=0; i< livros.length; i++){
            if(livros[i]!=null) {
                livros[i].mostraInfo();
            }
        }
    }

    public void addLivro(Livro livro){
        for(int i=0; i< livros.length; i++){
            if(livros[i]==null) {
                livros[i] = livro;
                break;
            }
        }
    }
}
