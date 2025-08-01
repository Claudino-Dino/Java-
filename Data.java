package com.faculdade.exercicios;
import java.util.Calendar;
import java.util.Date;


public class Data {

    Calendar c = Calendar.getInstance();

    private int dia = c.get(Calendar.DAY_OF_MONTH);
    private int mes = c.get(Calendar.MONTH);
    private int ano = c.get(Calendar.YEAR);


    String dataFormatada(){

        String diaString = String.valueOf(this.dia),
                mesString = String.valueOf(this.mes),
                anoString = String.valueOf(this.ano);

        String formatado = diaString + "/" + mesString + "/" + anoString;

        return formatado;
    }
}
