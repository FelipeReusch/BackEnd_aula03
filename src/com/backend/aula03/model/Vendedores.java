package com.backend.aula03.model;


public abstract class Vendedores {
    private String nome;
    private Tipo tipo;
    private String categoria;
    public int pontos;


    public Vendedores(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String categoria() {
        return categoria;
    }

    public void categoria(String mostrarCategoria) {
        this.categoria = mostrarCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPontos() {
        return "Pontuacao é:" + this.pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String mostrarCategoria(){
        String categoria = calcularPontos();
        setCategoria(categoria);
        return "vendedor" + getNome() + "\n" + getPontos() + "\n" + "Categoria" + getCategoria();
                
    }

    public String calcularPontos() {
        if (this.pontos < 20) {
            return "Novato";
        } else if (this.pontos >= 20 && this.pontos <= 30) {
            return "Aprendiz";
        } else if (this.pontos >= 31 && this.pontos <= 40) {
            return "Bom";
        } else if (this.pontos > 40) {
            return "Mestre";
        } else {
            return null;
        }
    }


    }




