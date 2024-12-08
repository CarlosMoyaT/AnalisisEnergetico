package com.example.demo.Repository;

import com.example.demo.Model.Consumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, Long> {
    List<Consumo> findByTipoUsuario(String tipoUsuario);
    List<Consumo> findByConsumoKWhGreaterThanEqual(double consumoMinimo);

}

