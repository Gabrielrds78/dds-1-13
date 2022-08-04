package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_4_introducao_ao_stream.dao;

import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_4_introducao_ao_stream.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarTodasFaturas(){
        //Obviamente você buscaria isso no banco de dados

        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("gabriel.ds.r.ds@gmail.com",350.0));
        faturas.add(new Fatura("pedro@gmail.com",150.0));
        faturas.add(new Fatura("joao@gmail.com",290.0));

        return faturas;
    }
}
