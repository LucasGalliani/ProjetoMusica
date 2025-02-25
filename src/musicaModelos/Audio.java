package musicaModelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducao;
    private int curtidas;
    private int cliassifcacao;


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
        return totalReproducao;
    }

    public void setTotalReproducao(int totalReproducao) {
        this.totalReproducao = totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getCliassifcacao() {
        return cliassifcacao;
    }

    public void setCliassifcacao(int cliassifcacao) {
        this.cliassifcacao = cliassifcacao;

    }

    public void exibeTitulo(){
        System.out.println("O Nome do podcast é: " + titulo);
    }


}
