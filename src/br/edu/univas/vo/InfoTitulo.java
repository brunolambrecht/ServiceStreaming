package br.edu.univas.vo;

import java.util.Objects;

public class InfoTitulo {

    private String titulo;
    private String elenco;
    private String descricao;
    private String genero;
    private String diretor;
    private int clasEtaria;
    private String plataforma;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClasEtaria() {
        return clasEtaria;
    }

    public void setClasEtaria(int clasEtaria) {
        this.clasEtaria = clasEtaria;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoTitulo that = (InfoTitulo) o;
        return Objects.equals(titulo, that.titulo) && Objects.equals(genero, that.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero);
    }

    @Override
    public String toString() {
        return
                "\n Titulo: " + titulo +
                "\n Elenco: " + elenco +
                "\n Descricao: " + descricao +
                "\n Genero: " + genero +
                "\n Diretor: " + diretor +
                "\n Clasificação Etaria :" + clasEtaria +
                "\n Plataforma : " + plataforma;
    }
}
