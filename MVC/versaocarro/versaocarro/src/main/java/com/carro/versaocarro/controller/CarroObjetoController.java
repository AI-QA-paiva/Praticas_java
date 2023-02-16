package com.carro.versaocarro.controller;


import com.carro.versaocarro.model.CarroDto;
import com.carro.versaocarro.model.CarroObjetoModel;
import com.carro.versaocarro.service.CarroObjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarroObjetoController {

    //Qdo quero trazer um objeto, na declaração do metodo, identifico qual Classe gera o objeto
    //Na classe que assina o metodo, tem que ter Gets e Sets; assim o metodo pode bater nas variaveis que la estao.
    //aqui nao persiste no banco, pois retorno somente pega campos da model, preenche e nao salva dado em banco de dados.
    @PostMapping (path = "/completo")
    public CarroObjetoModel postCarroNovo(@RequestBody CarroObjetoModel carroModel){
        return carroModel;
    }

    //persistindo no banco Postgres SQL

    @Autowired
    private CarroObjetoService carroObjetoService;

    @PostMapping (path = "/salvando")
    public CarroDto postCarroNovinho(@RequestBody CarroDto carroDto){
        CarroDto carro = carroObjetoService.postCadastro(carroDto);
        return carro;
    }

    @GetMapping (path = "/salvando")
    public List<CarroObjetoModel> getCarros(){
        return carroObjetoService.getListaCarro();
    }

    @DeleteMapping (path = "/salvando/{id}")
    public void deletCarro(@PathVariable Long id){
        carroObjetoService.deleteCarro(id);

    }

}
