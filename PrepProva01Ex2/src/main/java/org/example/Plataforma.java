package org.example;

public class Plataforma {
    String nome = "Hulkflix";
    Serie[] series = new Serie[10];

    public void mostraInfo(){
        System.out.println("Plataforma " + nome);
        for(int i = 0; i < series.length; i++){
            if(series[i] != null)
                series[i].mostraInfo();
        }
    }

    public void addSerie (Serie serie){
        for(int i = 0; i < series.length; i++){
            if(series[i] == null) {
                series[i] = serie;
                break;
            }
        }
    }

    public String serieMaisLongaFinalizada() {
        int maior = 0; // variável para comparação de num de temporadas
        String nomeMaior = "";
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                if(series[i].finalizada && series[i].temporadas > maior){
                    maior = series[i].temporadas;
                    nomeMaior = series[i].nome;
                }
            }
        }
        return nomeMaior;
    }

    public void mediaPorcentagem(){
        int cont = 0; // conta quantas series foram adicionadas
        int cont3 = 0; // conta o num de series com 3 ou + temporadas
        double mediaNotas = 0;
        for(int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                if(series[i].temporadas >= 3){
                    cont3++;
                    mediaNotas += series[i].nota;
                }
                cont++;
            }
        }
        System.out.println(cont3*100/cont + " % das séries possuem 3+ temporadas e sua média de notas é de " + mediaNotas/cont3);
    }
}
