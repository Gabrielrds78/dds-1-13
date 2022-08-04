package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_4_introducao_ao_stream.modelo;

public class Fatura {

    private String email;
    private double valor;

    public Fatura(String email, double valor) {
        this.email = email;
        this.valor = valor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean estaEmRisco (){
        return valor >= 250 ? true : false;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "email='" + email + '\'' +
                ", valor=" + valor +
                '}';
    }
}
