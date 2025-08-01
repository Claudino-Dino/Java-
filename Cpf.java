package com.faculdade.exercicios;

public class Cpf {

    private String nome;
    private String endereco;
    private String cpf = "06875038331";
    private int idade;

    public String getCpf(){
        return this.cpf;
    }

    public void mudaCPF(String cpf){
        if (this.idade <= 60) {
            validaCPF(cpf);
            this.cpf = cpf;
        }
        this.cpf = cpf;
    }

    private boolean validaCPF(String cpf) {

        String cpfTratado = cpf.replace("-", "");
        cpfTratado = cpf.replace(".", "");

        if (cpfTratado.length() == 11){
            System.out.println("CPF Válido.");
            return true;
        }

        System.out.println("CPF Inválido");
        return false;
    }

}
