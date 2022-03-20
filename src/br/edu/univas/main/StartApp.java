package br.edu.univas.main;
import br.edu.univas.vo.*;

import java.util.ArrayList;
import java.util.Scanner;

import static br.edu.univas.main.Menu.*;

public class StartApp {

    ///teste ronald silvaaaaaa
    // Ronald Pereira da Silva

    private static Scanner sc = new Scanner(System.in);

    private static ArrayList<Player> playerList = new ArrayList<>();
    private static ArrayList<Filme> filmeList = new ArrayList<>();
    private static ArrayList<Serie> serieList = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            Menu.menuPrincipal();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cadastroPlayer();
                    break;

                case 2:
                    tipo();
                    break;

                case 3:
                    pesquisaTitulo();
                    break;


                case 4:
                    fim();
                    break;

                default:
                    System.out.println("\uD83D\uDEABOpção invalida! Por favor, digite uma opção correta!\uD83D\uDEAB");
            }
        } while (opcao != 0 || opcao == 0);
    }

    // Volta para o menu principal
    public static void continuar() {
        System.out.println("\nPressione a tecla ENTER para voltar ao menu");
        Scanner scContinuar = new Scanner(System.in);
        scContinuar.nextLine();

    }

    // Cadastra os Players
    public static void cadastroPlayer() {
        System.out.println("Você escolheu a opção cadastro de Player");

        // Aprece a primeira pagina para guardar as informaçoes
        menuPlayer();

        Player player = new Player();
        String x = sc.nextLine();
        player.setName(x);
        String y = sc.nextLine();
        player.setSite(y);
        playerList.add(player);

        // Aqui ele pergunta se voce deseja cadastrar novamente
        menuPlayer2();

        int opcaoPlayer2;
        opcaoPlayer2 = sc.nextInt();
        if (opcaoPlayer2 == 1) {
            sc.nextLine();
            cadastroPlayer();
        } else if (opcaoPlayer2 == 2) {

            for (int i = 0; i < playerList.size(); i++) {
                Player player2 = playerList.get(i);
                if (player2 != null) {
                    System.out.println("Nome: " + player2.getName());
                    System.out.println("Site: " + player2.getSite());
                }
            }
            continuar();
        } else {
            System.out.println("\uD83D\uDEABOpção invalida!\uD83D\uDEAB");
            System.out.println("Pressione a tecla ENTER para voltar ao menu");

        }
        sc.nextLine();

    }

    // Cadastra o tipo (No cadastro de Titulo)
    public static void tipo() {
        System.out.println("Você escolheu a opção Cadastro de Titulo");
        menuDeTitulo();

        int opcaoTitulo2;
        opcaoTitulo2 = sc.nextInt();
        if (opcaoTitulo2 == 1) {
            sc.nextLine();
            System.out.println("Você escolheu a opção Serie!");

            Serie serie = new Serie();
            titulo();
            String a = sc.nextLine();
            serie.setTitulo(a);
            elenco();
            String b = sc.nextLine();
            serie.setElenco(b);
            descricao();
            String c = sc.nextLine();
            serie.setDescricao(c);
            genero();
            String d = sc.nextLine();
            serie.setGenero(d);
            diretor();
            String e = sc.nextLine();
            serie.setDiretor(e);
            clasEtaria();
            int f = sc.nextInt();
            serie.setClasEtaria(f);
            plataforma();
            String g = sc.nextLine();
            serie.setPlataforma(g);

            serieList.add(serie);

            for (int i = 0; i < serieList.size(); i++) {
                Serie serie2 = serieList.get(i);
                if (serie2 != null) {
                    System.out.println("Titulo (Serie): " + serie2.getTitulo());
                    System.out.println("Elenco: " + serie2.getElenco());
                    System.out.println("Descrição: " + serie2.getDescricao());
                    System.out.println("Genero: " + serie2.getGenero());
                    System.out.println("Diretor: " + serie2.getDiretor());
                    System.out.println("Classificação Etaria: " + serie2.getClasEtaria());
                    System.out.println("Plataforma: " + serie2.getPlataforma());
                }
            }

        } else if (opcaoTitulo2 == 2) {
            sc.nextLine();
            System.out.println("Você escolheu a opção Filme!");

            Filme filme = new Filme();
            titulo();
            String a = sc.nextLine();
            filme.setTitulo(a);
            elenco();
            String b = sc.nextLine();
            filme.setElenco(b);
            descricao();
            String c = sc.nextLine();
            filme.setDescricao(c);
            genero();
            String d = sc.nextLine();
            filme.setGenero(d);
            diretor();
            String e = sc.nextLine();
            filme.setDiretor(e);
            clasEtaria();
            int f = sc.nextInt();
            filme.setClasEtaria(f);
            plataforma();
            String g = sc.nextLine();
            filme.setPlataforma(g);

            filmeList.add(filme);

            for (int i = 0; i < filmeList.size(); i++) {
                Filme filme2 = filmeList.get(i);
                if (filme2 != null) {
                    System.out.println("Titulo (Filme): " + filme2.getTitulo());
                    System.out.println("Elenco: " + filme2.getElenco());
                    System.out.println("Descrição: " + filme2.getDescricao());
                    System.out.println("Genero: " + filme2.getGenero());
                    System.out.println("Diretor: " + filme2.getDiretor());
                    System.out.println("Classificação Etaria: " + filme2.getClasEtaria());
                    System.out.println("Plataforma: " + filme2.getPlataforma());
                }
            }

        } else {
            System.out.println("\uD83D\uDEABOpção invalida!\uD83D\uDEAB");
            System.out.println("Pressione a tecla ENTER para voltar ao menu");

        }
        sc.nextLine();


        for (int i = 0; i < filmeList.size(); i++) {
            Filme filme2 = filmeList.get(i);
            if (filme2 != null) {
                System.out.println("Titulo (Filme): " + filme2.getTitulo());
                System.out.println("Elenco: " + filme2.getElenco());
                System.out.println("Descrição: " + filme2.getDescricao());
                System.out.println("Genero: " + filme2.getGenero());
                System.out.println("Diretor: " + filme2.getDiretor());
                System.out.println("Classificação Etaria: " + filme2.getClasEtaria());
                System.out.println("Plataforma: " + filme2.getPlataforma());
            }
        }

        for (int i = 0; i < serieList.size(); i++) {
            Serie serie2 = serieList.get(i);
            if (serie2 != null) {
                System.out.println("Titulo (Serie): " + serie2.getTitulo());
                System.out.println("Elenco: " + serie2.getElenco());
                System.out.println("Descrição: " + serie2.getDescricao());
                System.out.println("Genero: " + serie2.getGenero());
                System.out.println("Diretor: " + serie2.getDiretor());
                System.out.println("Classificação Etaria: " + serie2.getClasEtaria());
                System.out.println("Plataforma: " + serie2.getPlataforma());
            }
        }

        continuar();

    }
}




/*-public static String leitorString(Scanner x){
        String aux = x.nextLine();
        return aux;

        }*/







   /* //1 - Cadastro de Player
    String nome;
        System.out.println("Digite o nome do Streamer!");
                nome = sc.nextLine();


                ArrayList<Player> playerList = new ArrayList<>();

        for (int i = 0; i < playerList.size(); i++) {
        Player player = playerList.get(i);
        if (player != null) {
        System.out.println("Nome: " + player.getName());
        System.out.println("Site: " + player.getSite());
        }
        }

    */