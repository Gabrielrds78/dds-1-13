package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_4_introducao_ao_stream.teste;

import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_4_introducao_ao_stream.dao.FaturaDAO;
import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_4_introducao_ao_stream.modelo.Fatura;

import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Fatura> faturas = new FaturaDAO().buscarTodasFaturas();

        /*for (Fatura f : faturas){
            if (f.getValor() > 250.0){
                System.out.println("ALERTA: Fatura acima de R$250,00 -> " + f);
            }
        }

         */

        faturas.stream()
                .filter(Fatura::estaEmRisco)
                .forEach(System.out::println);
    }
}
