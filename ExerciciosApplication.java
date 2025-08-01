package com.faculdade.exercicios;
import java.io.IOException;

public class ExerciciosApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		FabricaDeCarro instance = FabricaDeCarro.getInstance();

		instance.setModelo("Toyota Corolla");

		instance.setFunciona(true);

		instance.detalhesCarro();
	}

}