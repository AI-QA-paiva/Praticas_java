package com.carro.versaocarro.model;

import javax.persistence.*;


@Entity
@Table (name = "caranga")

public class CarroObjetoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarro;
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String chassi;



    public CarroObjetoModel(Long idCarro, String marca, String modelo, String ano, String cor, String chassi) {
        this.idCarro = idCarro;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.chassi = chassi;
    }

    public CarroObjetoModel(){

    }


    public Long getIdCarro() {
        return idCarro;
    }

    //Postman nao precisa ter o Set de idCarro ativo; na resposta precisa que o getIcarro esteja ativo para mostrar sequnciamento do Id
//    public void setIdCarro(){
//        this.idCarro = idCarro;
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
