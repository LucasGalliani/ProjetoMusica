package musicaModelos;

import org.w3c.dom.ls.LSOutput;

public class Audio implements Classificacao {
    private String titulo;
    private int duracao;
    private int totalReproducao;
    private int curtidas;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao++;
    }

    public void setTotalReproducao(int totalReproducao) {
        this.totalReproducao = totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir(){
        curtidas++;
    }


    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }


    public void exibeTitulo(){
        System.out.println("O Nome do podcast é: " + titulo + "\n");
    }

    public void exibeDuracao(){
        System.out.println("A duração do podcast é: " + duracao + " minutos" + "\n");
    }


    @Override
    public int getClassificacao() {
        if (curtidas >= 4 ){
            return 2;
        } else if (curtidas >= 2) {
            return 1;
        } else {
            return 0;
        }
    }
}
