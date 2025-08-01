package com.faculdade.exercicios;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = 2;

    }

    public void exibirProduto(){
        System.out.println("Detalhes do produto: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println(" ");

    }

    public boolean vender(){
        if (this.quantidade > 0){
            System.out.println("Produto vendido!");
            this.quantidade -= 1;
            return true;
        }

        System.out.println("Estoque acabou!");
        return false;
    }

}
