package com.carro.versaocarro.service;


import com.carro.versaocarro.model.CarroObjetoModel;
import com.carro.versaocarro.repository.CarroObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroObjetoService {
    @Autowired
    private CarroObjetoRepository carroObjetoRepository;


    public CarroObjetoModel postCadastro(CarroObjetoModel carroModel) {
        return carroObjetoRepository.save(carroModel);
    }

    public List<CarroObjetoModel> getListaCarro() {
        return carroObjetoRepository.findAll(); //para esse metodo findall trazer a relação, na model deve ter um contrutor vazio obrigatoriamente
    }


    public void deleteCarro(Long id) {
        carroObjetoRepository.deleteById(id);
    }
}
