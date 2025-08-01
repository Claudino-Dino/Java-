package com.faculdade.exercicios;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livro(String titulo, int numeroDePaginas){
        this.mudaTitulo(titulo);
        this.mudaAutor("Ue");
        this.mudaNumeroDePaginas(numeroDePaginas);
    }

    public void detalhesDoLivro(){
        System.out.println("Detalehes do livro");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroDePaginas);
    }

    public boolean comparaPaginas(Livro livroComparado){
        if (this.numeroDePaginas > livroComparado.pegaNumeroDePaginas()){
            System.out.println("O livro " + livroComparado.titulo + " tem mais páginas que o livro " + this.titulo);
            return false;
        }
        return true;
    }

    public String pegaTitulo(){
        return this.titulo;
    }

    public String mudaTitulo(String titulo){
        this.titulo = titulo;
        return this.titulo;
    }

    public String pegaAutor(){
        return this.autor;
    }

    public String mudaAutor(String autor){
        this.autor = autor;
        return this.autor;
    }

    public int pegaNumeroDePaginas(){
        return this.numeroDePaginas;
    }

    public int mudaNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
        return this.numeroDePaginas;
    }


}
