package com.backend.aula03.model;

public class Afiliados extends Vendedores{
    private String venderA;

    public Afiliados(String nome) {
        super(nome);
    }

    public String getVenderA() {
        this.pontos +=15;
        return getPontos();
    }



}
