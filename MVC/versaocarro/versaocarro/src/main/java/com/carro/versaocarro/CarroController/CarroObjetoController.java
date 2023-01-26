package com.carro.versaocarro.CarroController;


import com.carro.versaocarro.model.CarroModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroObjetoController {

    //Qdo quero trazer um objeto, na declaração do metodo, identifico qual Classe gera o objeto
    //Na classe que assina o metodo, tem que ter Gets e Sets; assim o metodo pode bater nas variaveis que la estao.
    @PostMapping (path = "/completo")
    public CarroModel postCarroNovo(@RequestBody CarroModel carroModel){
        return carroModel;
    }
}
