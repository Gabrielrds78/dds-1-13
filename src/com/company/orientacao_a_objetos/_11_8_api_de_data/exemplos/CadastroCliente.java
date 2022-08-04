package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_8_api_de_data.exemplos;

import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_8_api_de_data.model.Cliente;

import java.time.LocalDate;
import java.time.Month;

public class CadastroCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Filipe Vaz", LocalDate.of(1937, Month.MARCH,9));

    }
}
