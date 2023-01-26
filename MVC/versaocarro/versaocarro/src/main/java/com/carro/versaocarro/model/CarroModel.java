package com.carro.versaocarro.model;

public class CarroModel {

    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String chassi;


//    public CarroModel(String marca, String modelo, String ano, String cor, String chassi) {
//        this.marca = marca;
//        this.modelo = modelo;
//        this.ano = ano;
//        this.cor = cor;
//        this.chassi = chassi;
//    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
