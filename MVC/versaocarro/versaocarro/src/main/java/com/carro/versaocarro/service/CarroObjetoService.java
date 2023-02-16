package com.carro.versaocarro.service;


import com.carro.versaocarro.model.CarroDto;
import com.carro.versaocarro.model.CarroObjetoModel;
import com.carro.versaocarro.repository.CarroObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroObjetoService {
    @Autowired
    private CarroObjetoRepository carroObjetoRepository;


    public CarroDto postCadastro(CarroDto carroDto) {
        CarroObjetoModel model=new CarroObjetoModel();
        //o model ta vazio
        //preciso salvar ele no banco de dados
        //como eu vou preencher o model com os dados que eu estou recebendo como parametro no metodo
        model.setAno(carroDto.getAno());
        model.setCor(carroDto.getCor());
        model.setChassi(carroDto.getChassi());
        model.setModelo(carroDto.getModelo());
        model.setMarca(carroDto.getMarca());
        carroObjetoRepository.save(model);


        /// no parametro é um DTO que passo, entao tenho que retornar DTO?
        return carroDto;
    }

    public List<CarroObjetoModel> getListaCarro() {
        return carroObjetoRepository.findAll(); //para esse metodo findall trazer a relação, na model deve ter um contrutor vazio obrigatoriamente
    }


    public void deleteCarro(Long id) {
        carroObjetoRepository.deleteById(id);
    }
}
