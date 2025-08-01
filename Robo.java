package com.faculdade.exercicios;

public class Robo {

    private int bracos;
    private int pernas;
    private int tronco;
    private int cabeca;
    private String nome;

    Robo(String nome){
        this.nome = nome;
    }

    Robo(int bracos, String nome){
        this(nome);
        this.bracos = bracos;
    }

}
