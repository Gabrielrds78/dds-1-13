package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_1_introducao_ao_lambda.exemplo;

import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_1_introducao_ao_lambda.dao.FaturaDAO;
import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_1_introducao_ao_lambda.modelo.Fatura;

import java.util.List;

public class ExemploLamba {
    public static void main(String[] args) {

        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturaVencidas();
        
    }
}
