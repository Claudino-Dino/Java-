package com.faculdade.exercicios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {

    static void Calc_Interface(){
        print("+=========================+\n");
        print("|  C A L C U L A D O R A  |\n");
        print("+=========================+\n");
        print("| 1 - SOMA                |\n");
        print("| 2 - SUBTRAÇÃO           |\n");
        print("| 3 - MULTIPLICAÇÃO       |\n");
        print("| 4 - DIVISÃO             |\n");
        print("| 5 - SAIR                |\n");
        print("+=========================+\n");
    }

    static void switch_case(int case_switch){
        switch (case_switch) {
            case 1:
                Soma();
                break;
            case 2:
                Subtração();
                break;
            case 3:
                Multiplicacao();
                break;
            case 4:
                Divisao();
                break;
            case 5:
                print("Finalizando...");
        }
    }

    static void print(String text){
        System.out.print(text);
    }

    static void Soma() {
        Scanner scan = new Scanner(System.in);

        int resp = 0;
        while (resp != 2) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scan.nextInt();
            System.out.print("Digite o primeiro número: ");
            int num2 = scan.nextInt();
            System.out.println(num1 + num2);

            System.out.println("\nDeseja continuar?: [S - 1/ N - 2]");
            resp = scan.nextInt();

        }
    }

    static void Subtração() {
        Scanner scan = new Scanner(System.in);

        int resp = 0;
        while (resp != 2) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scan.nextInt();
            System.out.print("Digite o primeiro número: ");
            int num2 = scan.nextInt();
            System.out.println(num1 - num2);

            System.out.println("\nDeseja continuar?: [S - 1/ N - 2]");
            resp = scan.nextInt();

        }
    }

    static void Multiplicacao() {
        Scanner scan = new Scanner(System.in);

        int resp = 0;
        while (resp != 2) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scan.nextInt();
            System.out.print("Digite o primeiro número: ");
            int num2 = scan.nextInt();
            System.out.println(num1 * num2);

            System.out.println("\nDeseja continuar?: [S - 1/ N - 2]");
            resp = scan.nextInt();

        }
    }

    static void Divisao() {
        Scanner scan = new Scanner(System.in);

        int resp = 0;
        while (resp != 2) {
            System.out.print("Digite o primeiro número: ");
            int num1 = scan.nextInt();
            System.out.print("Digite o primeiro número: ");
            int num2 = scan.nextInt();
            System.out.println(num1 / num2);

            System.out.println("\nDeseja continuar?: [S - 1/ N - 2]");
            resp = scan.nextInt();

        }
    }

}