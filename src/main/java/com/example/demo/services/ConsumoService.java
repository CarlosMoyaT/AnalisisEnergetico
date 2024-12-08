package com.example.demo.services;

import com.example.demo.Model.Consumo;
import com.example.demo.Repository.ConsumoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumoService {
    private final ConsumoRepository consumoRepository;

    public ConsumoService(ConsumoRepository consumoRepository) {
        this.consumoRepository = consumoRepository;
    }

    public List<Consumo> obtenerTodos() {
        return consumoRepository.findAll();
    }

    public List<Consumo> filtrarPorTipoUsuario(String tipo) {
        return consumoRepository.findByTipoUsuario(tipo);
    }

    public List<Consumo> filtrarPorConsumoMinimo(double umbral) {
        return consumoRepository.findByConsumoKWhGreaterThanEqual(umbral);
    }

    public double calcularConsumoTotal() {
        return consumoRepository.findAll()
                .stream()
                .mapToDouble(Consumo::getConsumoKWh)
                .sum();
    }
}
