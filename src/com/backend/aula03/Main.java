package com.backend.aula03;

import com.backend.aula03.model.Afiliados;
import com.backend.aula03.model.Funcionarios;


public class Main {

    public static void main(String[] args) {

        Funcionarios funcionario = new Funcionarios("Joao",2010);
        funcionario.pontuacaoFidelidade();
        funcionario.mostrarCategoria();
        funcionario.obterAfiliado();
        funcionario.getVenderF();
        funcionario.calcularPontos();
        System.out.println(funcionario);

        System.out.println("---------------------------------");

        Afiliados afiliados = new Afiliados("Maria");
        afiliados.mostrarCategoria();
        afiliados.getVenderA();
        afiliados.calcularPontos();
        System.out.println(afiliados);



    }
}
