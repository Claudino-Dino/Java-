package com.faculdade.exercicios;
import org.jetbrains.annotations.NotNull;

public class Conta implements ContaInterface {

    String titular;
    private double saldo = 0;
    private String agencia;
    private Data dataDeAbertura = new Data();
    private double ganhoMensal;
    private static int totalDeContas;

    Conta(){
        Conta.totalDeContas += 1;
    }

    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }

    @Override
    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public boolean saca(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente...");
            return false;
        }
        this.saldo -= valor * 0.00038;
        this.saldo -= valor;
        return true;
    }

    @Override
    public boolean deposita(double quantidade) {
        if (quantidade < 0){
            System.out.println("Valor inválido, digite um valor positivo!");
            return false;
        }
        this.saldo += quantidade;
        return true;
    }

    @Override
    public void transfere(@NotNull Conta destino, double valor){
        this.saldo -= valor;
        destino.saldo += valor;
    }

    @Override
    public double getRendimento(){
        return calculaRendimento();
    }

    @Override
    public double calculaRendimento(){
        return this.saldo *= 0.1;
    }

    @Override
    public String recuperaDadosConta(){
        String dados;

        dados = "Titular: " + this.titular + "\n";
        dados += "Saldo: " + this.saldo + "\n";
        dados += "Rendimento: " + this.calculaRendimento() + "\n";
        dados += "Data: " + this.dataDeAbertura.dataFormatada();

        return dados;
    }
}
