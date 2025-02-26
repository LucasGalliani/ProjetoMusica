package musicaModelos;

public class PodCast extends Audio{

    private int totalReproducao = 0;

public String obterTitulo(){
    return getTitulo();
}

public int obterDuracao(){
    return getDuracao();
}

public void incrementaTotalReproducao(){
        totalReproducao++;
}

public int obterTotalReproducao(){
    return totalReproducao;
}

public void incrementaTotalCurtida(){
        totalReproducao++;
    }

public int obterTotalCurtida(){
        return totalReproducao;
    }


}
