package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_8_api_de_data.model;

import java.time.Year;

public class Carro {

    private String modelo;
    private double valorDiaria;
    private Year anoDeFabricacao;

    public Carro(String modelo, double valorDiaria, Year anoDeFabricacao) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Year getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(Year anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
}
