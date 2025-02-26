import musicaModelos.PodCast;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcaoMenu1 = 0;
        int opcaoMenu2 = 0;
        String menuTexo;
        String lerPodCast;
        boolean continuar = true;

        System.out.println(" \uD83C\uDFB6 Bem-vindo ao Lucas Sound: Onde a Música e os Podcasts Ganham Vida! \uD83C\uDFA7" + "\n");

        System.out.println("Escolha Podcast(0)? ou Musica(1)?");
        Scanner scanner = new Scanner(System.in);

        opcaoMenu1 = scanner.nextInt();

        if (opcaoMenu1 == 0) {

            scanner.nextLine();

            do {
                System.out.println("Seja Bem vindo a parte de Podcast!\n");
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
                scanner.nextLine(); //

                PodCast podcast = new PodCast();
                podcast.setTitulo("Flow");
                podcast.setDuracao(250);

                switch(opcaoMenu2){
                    case 1:
                        podcast.exibeTitulo();
                        break;
                    case 2:
                        podcast.exibeDuracao();
                        break;
                    case 3:
                        do {
                            System.out.println("Qual podcast voce quer reproduzir? ou Aperte -1 para sair!");
                            lerPodCast = scanner.nextLine();

                            if (lerPodCast.equals("-1")) {
                                System.out.println("Saindo da reprodução...");
                                System.out.println("O podcast " + podcast.getTitulo() + " teve " + podcast.obterTotalReproducao() + " reproduçao(oes)!" );
                                break;
                            }

                            if (lerPodCast.equals(podcast.getTitulo())) {
                                podcast.incrementaTotalReproducao();
                                System.out.println("Reprodução com Sucesso!");
                            } else{
                                System.out.println("Podcast não encontrado! Tente novamente.");
                            }

                        }while(lerPodCast != "-1");
                        break;
                    case 4:
                        do {
                            System.out.println("Qual podcast voce quer curtir? ou Aperte -1 para sair!");
                            lerPodCast = scanner.nextLine();

                            if (lerPodCast.equals("-1")) {
                                System.out.println("Saindo da tela de curtida...");
                                System.out.println("O podcast " + podcast.getTitulo() + " teve " + podcast.obterTotalCurtida() + " curtida(s)!" );
                                break;
                            }

                            if (lerPodCast.equals(podcast.getTitulo())) {
                                podcast.incrementaTotalCurtida();
                                System.out.println("Curtida com Sucesso!");
                            } else{
                                System.out.println("Podcast não encontrado! Tente novamente.");
                            }
                        }while(lerPodCast != "-1");
                        break;
                    case 6:
                        System.out.println("Podcast encerrado!");
                        break;
                }


            } while(opcaoMenu2!= 6);



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