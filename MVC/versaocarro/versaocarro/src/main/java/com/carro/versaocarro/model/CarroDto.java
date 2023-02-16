package com.carro.versaocarro.model;

public class CarroDto {
//objeto de trafegar dados

    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String chassi;


    public CarroDto(){

    }

    public CarroDto(String marca, String modelo, String ano, String cor, String chassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.chassi = chassi;
    }

    //metodo para construtor para converter dados da entidade pra Dto
    public CarroDto(CarroObjetoModel carroObjetoModel) {
        marca = carroObjetoModel.getMarca();
        modelo = carroObjetoModel.getModelo();
        ano = carroObjetoModel.getAno();
        cor = carroObjetoModel.getCor();
        chassi = carroObjetoModel.getChassi();
    }

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
