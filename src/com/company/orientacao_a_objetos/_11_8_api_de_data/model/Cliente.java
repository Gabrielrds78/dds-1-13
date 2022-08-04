package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_8_api_de_data.model;

import java.time.LocalDate;

public class Cliente {
    private String mome;
    private LocalDate dataNascimento;

    public Cliente(String mome, LocalDate dataNascimento) {
        this.mome = mome;
        this.dataNascimento = dataNascimento;
    }

    public String getMome() {
        return mome;
    }

    public void setMome(String mome) {
        this.mome = mome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
