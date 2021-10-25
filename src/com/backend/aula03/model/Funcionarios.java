package com.backend.aula03.model;

import java.util.Calendar;

public class Funcionarios extends Vendedores{
    private String afiliados;
    private int anoContratacao;
    private String venderF;

    public Funcionarios(String nome, int anoContratacao) {
        super(nome);
        this.anoContratacao = anoContratacao;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }

    public String getObterAfiliados() {
        return afiliados;
    }

    public void setObterAfiliados(String obterAfiliados) {
        this.afiliados = obterAfiliados;
    }

    public String pontuacaoFidelidade() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int tempoFidelidade = year - this.anoContratacao;
        if (tempoFidelidade >= 5) {
            this.pontos += 5 * tempoFidelidade;
            return "Pontos de fidelidade";
        } else {
            return "Funcionário não possui tempo";
        }
    }

    public String obterAfiliado() {
        this.pontos += 10;
        return getPontos();
    }


    public String getVenderF() {
        this.pontos += 5;
        return getPontos();
    }

}
