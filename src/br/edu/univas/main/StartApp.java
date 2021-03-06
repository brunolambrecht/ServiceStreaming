//Alunos:
//Bruno Lambrecht
//Ronald Pereira

package br.edu.univas.main;
import br.edu.univas.vo.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static br.edu.univas.main.Menu.*;

public class StartApp {

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
                    demonstraTitulo();
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

        // Aparece a primeira pagina para guardar as informaçoes
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


    // Cadastra o titulo classificado por tipo (No cadastro de Titulo)
    public static void tipo() {
        System.out.println("Você escolheu a opção Cadastro de Titulo");
        menuDeTitulo();

        int opcaoTitulo2;
        opcaoTitulo2 = sc.nextInt();
        //Serie
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
            sc.nextLine();
            plataforma();
            System.out.println("Plataformas disponiveis:");
            for (int i = 0; i < playerList.size(); i++) {
                Player player2 = playerList.get(i);
                if (player2 != null) {
                    System.out.println("Nome: " + player2.getName());
                }
            }
            System.out.println("\nInforme a plataforma!");
            String g = sc.nextLine();
            serie.setPlataforma(g);
            System.out.println("\nTitulo cadastrado!\n");
            serieList.add(serie);

            System.out.println(serie);

        }
        //Filme
        else if (opcaoTitulo2 == 2) {
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
            sc.nextLine();
            plataforma();
            System.out.println("Plataformas disponiveis:");
            for (int i = 0; i < playerList.size(); i++) {
                Player player2 = playerList.get(i);
                if (player2 != null) {
                    System.out.println("Nome: " + player2.getName());
                }
            }
            System.out.println("\nInforme a plataforma!");
            String g = sc.nextLine();
            filme.setPlataforma(g);
            filmeList.add(filme);
            System.out.println("\nTitulo cadastrado!\n");
            System.out.println(filme);

        } else {
            System.out.println("\uD83D\uDEABOpção invalida!\uD83D\uDEAB");
            System.out.println("Pressione a tecla ENTER para voltar ao menu");

        }
        sc.nextLine();
        continuar();
    }


    //Faz a pesquisa e demonstra titulo
    public static void pesquisaTituloOpcao() {
        int opcaoTitulo;
        opcaoTitulo = sc.nextInt();
        //Serie
        if(opcaoTitulo == 1) {
            System.out.println("Você selecionou a opção serie!\n");
            pesquisa();
            sc.nextLine();
            //entradas com um determinado titulo
            String entradaTitulo = sc.nextLine();//titulo escolhido
            System.out.println("---------------------");
            System.out.println("\nEntradas com um determinado titulo");
            for (Object obj : serieList) {
                if (obj instanceof Serie) {//verifica se o objeto é uma instância da classe Serie
                    Serie emp = (Serie)obj;//aqui é feito um cast
                    if (emp.getTitulo().equals(entradaTitulo)) {//verifica se o titulo é o procurado
                        System.out.println("Titulo encontrado:");
                        System.out.println(emp);
                        break;
                    }
                }
            }
            continuar();
        }
        //Filme
        else if (opcaoTitulo == 2) {
            System.out.println("Você selecionou a opção filme!\n");
            pesquisa();
            sc.nextLine();
            //entradas com um determinado titulo
            String entradaTitulo = sc.nextLine();// titulo escolhido
            System.out.println("---------------------");
            System.out.println("\nEntradas com um determinado titulo");
            for (Object obj : filmeList) {
                if (obj instanceof Filme) {//verifica se o objeto é uma instância da classe Filme
                    Filme emp = (Filme)obj;//aqui é feito um cast
                    if (emp.getTitulo().equals(entradaTitulo)) {//verifica se o titulo é o procurado
                        System.out.println("Titulo encontrado:");
                        System.out.println(emp);
                        break;
                    }
                }
            }
            continuar();
        }

    }

    //Pesquisa um titulo atravez do genero
    public static void tituloGenero(){
        int opcaoTitulo;
        opcaoTitulo = sc.nextInt();
        if(opcaoTitulo == 1) {
            //Serie
            System.out.println("Você selecionou a opção serie!\n");
            System.out.println("Informe o genero!");
            sc.nextLine();
            //entradas com um determinado titulo por genero
            String entradaTitulo = sc.nextLine();//genero escolhido
            System.out.println("---------------------");
            System.out.println("\nEntradas com um determinado Genero");
            for (Object obj : serieList) {
                if (obj instanceof Serie) {//verifica se o objeto é uma instância da classe Serie
                    Serie emp = (Serie)obj;//aqui é feito um cast
                    if (emp.getGenero().equals(entradaTitulo)) {//verifica se o titulo é o procurado
                        System.out.println("Titulo encontrado:");
                        System.out.println(emp);
                        break;
                    }
                }
            }
            continuar();
        }
        //Filme
        else if(opcaoTitulo == 2){
            System.out.println("Você selecionou a opção filme!\n");
            System.out.println("Informe o genero!");
            sc.nextLine();
            //entradas com um determinado titulo por genero
            String entradaTitulo = sc.nextLine();// genero escolhido
            System.out.println("---------------------");
            System.out.println("\nEntradas com um determinado Genero");
            for (Object obj : filmeList) {
                if (obj instanceof Filme) {//verifica se o objeto é uma instância da classe Filme
                    Filme emp = (Filme)obj;//aqui é feito um cast
                    if (emp.getGenero().equals(entradaTitulo)) {//verifica se o titulo é o procurado
                        System.out.println("Titulo encontrado:");
                        System.out.println(emp);
                        break;
                    }
                }
            }
            continuar();
        }

    }
    //Recomendação aleatória
    public static void tituloAleatorio() {
        int opcaoTitulo;
        opcaoTitulo = sc.nextInt();
        //Serie
        if (opcaoTitulo == 1) {
            Random random = new Random();
            for (int i = 0; i < serieList.size(); i++){
                int index = random.nextInt(serieList.size());
                System.out.println(serieList.get(index));
                break;
            }
            continuar();
        //Filme
        } else if (opcaoTitulo == 2) {
            Random random = new Random();
            for (int i = 0; i < filmeList.size(); i++){
                int index = random.nextInt(filmeList.size());
                System.out.println(filmeList.get(index));
                break;
            }
            continuar();
        }
    }

    //Opções de pesquisa
    public static void demonstraTitulo(){
        pesquisaTitulo();
        int opcaoTitulo;
        opcaoTitulo = sc.nextInt();
        //Procura por um determinado titulo
        if(opcaoTitulo == 1) {
            menuDeTitulo();
            pesquisaTituloOpcao();
        }

        //Recomenda um titulo atravez do genero selecionado
        else if (opcaoTitulo == 2){
            recomendacaoGenero();
            menuDeTitulo();
            tituloGenero();
        }

        //Recomenda um titulo aleatório
        else if (opcaoTitulo == 3){
            menuDeTitulo();
            recomendacaoAleatoria();
            tituloAleatorio();
        }
        //Opção invalida
        else {
            System.out.println("\uD83D\uDEABOpção invalida!\uD83D\uDEAB");
            System.out.println("Pressione a tecla ENTER para voltar ao menu");

        }
        sc.nextLine();
    }
}