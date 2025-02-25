import musicaModelos.Audio;
import musicaModelos.PodCast;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcaoMenu1 = 0;
        int opcaoMenu2 = 0;
        String menuTexo;
        String lerPodCast;

        PodCast podcast = new PodCast();
        podcast.setTitulo("Flow");
        podcast.setDuracao(250);



        System.out.println(" \uD83C\uDFB6 Bem-vindo ao Lucas Sound: Onde a Música e os Podcasts Ganham Vida! \uD83C\uDFA7" + "\n");

        System.out.println("Escolha Podcast(0)? ou Musica(1)?");
        Scanner scanner = new Scanner(System.in);

        // do while melhor opçcao
        // nao precisa de um while do primeiro menu e sim de um if.. para entrar em podcast e musica.

        while(opcaoMenu1 == 0 || opcaoMenu1 == 1) {

            opcaoMenu1 = scanner.nextInt();

            if (opcaoMenu1 == 0) {

                    System.out.println("Seja Bem vindo a parte de Podcast!");
                    System.out.println("Escolhaa as opçoes desjeadas:\n");
                    menuTexo = """
                            1. Mostrar o titulo do Podcast.
                            2. Mostrar duração do Podcast.
                            3. Mostrar o total de reprodução do Podcast.
                            4. Mostrar as curtidas do Podcast.
                            5. Mostrar a classificação do Podcast.
                            6. Sair
                            """;
                    System.out.println(menuTexo);
                    opcaoMenu2 = scanner.nextInt();
                    scanner.nextLine();

                    // verifica a condição do while
                    // trocar if por switch case.
                    // n precisa de varios scanner.nextline , tera que arruma a condiçao do while.
                    while(opcaoMenu2 != 0) {
                        if (opcaoMenu2 == 1) {
                            podcast.exibeTitulo();
                            scanner.nextLine();
                        } else if (opcaoMenu2 == 2) {
                            System.out.println("A duração do podcast é: " +
                                    podcast.obterDuracao());
                            scanner.nextLine();
                        } else if (opcaoMenu2 == 3) {
                            System.out.println("Qual podcast voce quer reproduzir? ou Aperte -1 para sair!");
                            lerPodCast = scanner.nextLine();
                                if (lerPodCast.equals(podcast.getTitulo())) {
                                    podcast.incrementaTotalReproducao();
                                    System.out.println("Reprodução com sucesso!");
                                } else if (lerPodCast.equals("-1")){
                                    System.out.println("Saida com Sucesso!");
                                    System.out.println("Total reprodução do podcast " + podcast.getTitulo() + " foi: " + podcast.obterTotalReproducao());
                                    break;
                                } else{
                                    System.out.println("Digite um podcast válido!");
                                }
                        }
                    }

            } else if (opcaoMenu1 == 1) {

                    System.out.println("Seja Bem vindo a parte de Musica!");
                    System.out.println("Escolha as opçoes desjeadas:\n");

                    menuTexo = """
                            1. Mostrar o titulo do Musica.
                            2. Mostrar duração do Musica.
                            3. Mostrar o total de reprodução do Musica.
                            4. Mostrar as curtidas do Musica.
                            5. Mostrar a classificação do Musica.
                            6. Sair
                            """;
                    System.out.println(menuTexo);

                } else {
                    System.out.println("Opção inválida!");
            }
        }
    }
}