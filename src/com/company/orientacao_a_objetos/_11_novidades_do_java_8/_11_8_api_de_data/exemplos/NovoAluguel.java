package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_8_api_de_data.exemplos;

import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_8_api_de_data.model.Carro;
import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_8_api_de_data.model.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class NovoAluguel {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("joão Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
        Carro carro = new Carro("Gol", 90.0, Year.of(2012));

        
    }
}
