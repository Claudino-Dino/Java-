package com.faculdade.exercicios;

import org.jetbrains.annotations.NotNull;

public interface ContaInterface {
    double getSaldo();

    boolean saca(double valor);

    boolean deposita(double quantidade);

    void transfere(@NotNull Conta destino, double valor);

    double getRendimento();

    double calculaRendimento();

    String recuperaDadosConta();
}
