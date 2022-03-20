package br.edu.univas.main;

public class Menu {

    public static void menuPrincipal() {

        System.out.println("------------------------------------------");
        System.out.println("|Bem-Vindo ao catálogo de Séries e Filmes|");
        System.out.println("|----------------------------------------|");
        System.out.println("| Nesta aplicação você poderá fazer sua  |");
        System.out.println("|   pesquisa ou nos ajudar indicando     |");
        System.out.println("|         seus filmes e séries           |");
        System.out.println("|----------------------------------------|");

        System.out.println("|----------------------------------------|");
        System.out.println("| Selecione a opção abaixo:              |");
        System.out.println("| 1 - Cadastro de Player                 |");
        System.out.println("| 2 - Cadastro de Título                 |");
        System.out.println("| 3 - Pesquisa de Títulos                |");
        System.out.println("| 4 - Sair                               |");
        System.out.println("|----------------------------------------|");
    }

    public static void menuPlayer() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Informe as informações abaixo:         |");
        System.out.println("| 1 - Nome:.......                       |");
        System.out.println("| 2 - Site:.......                       |");
        System.out.println("|----------------------------------------|");
    }

    public static void menuPlayer2(){
        System.out.println("\n|----------------------------------------|");
        System.out.println("| Deseja cadastrar outro player?         |");
        System.out.println("| 1 - Sim                                |");
        System.out.println("| 2 - Não                                |");
        System.out.println("|----------------------------------------|");
    }

    public static void pesquisaTitulo() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Selecione seu tipo de pesquisa:        |");
        System.out.println("| 1 - Pesquisa                           |");
        System.out.println("| 2 - Recomendação por Gênero            |");
        System.out.println("| 3 - Recomendação Aleatória             |");
        System.out.println("|----------------------------------------|");

    }

    public static void menuDeTitulo() {

        System.out.println("|----------------------------------------|");
        System.out.println("| Selecione a opção abaixo:              |");
        System.out.println("| 1 - Série                              |");
        System.out.println("| 2 - Filme                              |");
        System.out.println("|----------------------------------------|");
    }

    public static void fim() {
        System.out.println("---------------------------");
        System.out.println("|A aplicação foi encerrada|");
        System.out.println("|            º ͜º          |");
        System.out.println("---------------------------");
        System.exit(0);

    }

    public static void titulo() {
        System.out.println("Escreva o nome do Título:");}

    public static void elenco() {
        System.out.println("Escreva o nome das pessoas do Elenco:");}

    public static void descricao() {
        System.out.println("Escreva a Descrição:");}

    public static void genero() {
        System.out.println("Escreva o Gênero:");}

    public static void diretor() {
        System.out.println("Escreva o nome do Diretor:");}

    public static void clasEtaria() {
        System.out.println("Escreva a Classificação Etária:");}

    public static void plataforma() {
        System.out.println(" Selecione umas das Plataforma que o titulo esta disponivel:");
    }
}
