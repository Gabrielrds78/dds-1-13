package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_8_api_de_data.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {

    private Cliente cliente;
    private Carro carro;
    private LocalDateTime dataEHoraDaRetirada;
    private LocalDateTime dataEHoraPrevistaParaDevolucao;
    private LocalDateTime dataEHoraRealDaDevolucao;

    public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraDaRetirada, LocalDateTime dataEHoraPrevistaParaDevolucao, LocalDateTime dataEHoraRealDaDevolucao) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataEHoraDaRetirada = dataEHoraDaRetirada;
        this.dataEHoraPrevistaParaDevolucao = dataEHoraPrevistaParaDevolucao;
        this.dataEHoraRealDaDevolucao = dataEHoraRealDaDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDateTime getDataEHoraDaRetirada() {
        return dataEHoraDaRetirada;
    }

    public void setDataEHoraDaRetirada(LocalDateTime dataEHoraDaRetirada) {
        this.dataEHoraDaRetirada = dataEHoraDaRetirada;
    }

    public LocalDateTime getDataEHoraPrevistaParaDevolucao() {
        return dataEHoraPrevistaParaDevolucao;
    }

    public void setDataEHoraPrevistaParaDevolucao(LocalDateTime dataEHoraPrevistaParaDevolucao) {
        this.dataEHoraPrevistaParaDevolucao = dataEHoraPrevistaParaDevolucao;
    }

    public LocalDateTime getDataEHoraRealDaDevolucao() {
        return dataEHoraRealDaDevolucao;
    }

    public void setDataEHoraRealDaDevolucao(LocalDateTime dataEHoraRealDaDevolucao) {
        this.dataEHoraRealDaDevolucao = dataEHoraRealDaDevolucao;
    }

    public void imprimirFatura(){
        Duration duration = Duration.between(dataEHoraPrevistaParaDevolucao, dataEHoraRealDaDevolucao);
        System.out.println(">>>>>>>>>> FATURA <<<<<<<<<<");
        if (!duration.isNegative()){
            double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
            System.out.printf("Valor da multa: R$ %.2f. Pois você atrasou %d dias.", multa, duration.toHours());
        } else {
            System.out.println("Obrigado. Você foi pontual.");
        }
    }
}
