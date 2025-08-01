package com.faculdade.exercicios;

public class FabricaDeCarro {

    private String modelo;
    private boolean funciona;
    private static int totalDeCarros;

    private static FabricaDeCarro instance;

    private FabricaDeCarro(){};

    public static FabricaDeCarro getInstance(){

        if (instance == null){
            instance = new FabricaDeCarro();
            FabricaDeCarro.totalDeCarros += 1;
        }
        return instance;

    }

    public void setFunciona(boolean resp){
        this.funciona = resp;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void detalhesCarro(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("funciona: " + this.funciona);
        System.out.println("Total de Carros: " + FabricaDeCarro.totalDeCarros);
    }
}
