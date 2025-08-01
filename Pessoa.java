package com.faculdade.exercicios;

public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;

    Pessoa(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
}
