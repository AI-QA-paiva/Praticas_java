package com.carro.versaocarro.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NaoObjetosController {

    //Quando quero apenas um metodo que me traga um retorno que não seja objeto
    //na declaração do método, coloco o tipo, não indico parametro, e o retorno é valor do tipo que passei no retorno como que uma constante
    //La no postman, naõ coloque requisião tipo Http; basta colocar localhost:8080 na chamada
    @PostMapping
    public Integer postCarroNovo(){
        return 1994;
    }

//    @PostMapping
//    public String postCarroInformacoes(){
//        return "Monza, cor prata, ano 1994";
//    }

    //Quando passo um caminho
    //o retorno é valor do tipo que passei no retorno como que uma constante

    @PostMapping (path = "/identificar")
    public String postPath(@RequestBody String qualquer){
        return qualquer;
    }



}

