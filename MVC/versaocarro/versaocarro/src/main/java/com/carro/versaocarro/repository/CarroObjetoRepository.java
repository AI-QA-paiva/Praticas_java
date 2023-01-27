package com.carro.versaocarro.repository;

import com.carro.versaocarro.model.CarroObjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//lembrar que nome da classe model, deve seguir mesma descrição das classe; "CarroObjetoModel", CarroObjetoService, CarroObjetoController,...
@Repository
public interface CarroObjetoRepository extends JpaRepository<CarroObjetoModel, Long>{

}
