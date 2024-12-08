package com.example.demo.Controller;


import com.example.demo.Model.Consumo;
import com.example.demo.services.ConsumoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/consumo")
public class ConsumoController {
    private final ConsumoService consumoService;

    public ConsumoController(ConsumoService consumoService) {
        this.consumoService = consumoService;
    }

    @GetMapping("/todos")
    public List<Consumo> obtenerTodos() {
        return consumoService.obtenerTodos();
    }

    @GetMapping("/tipo{tipoUsuario}")
    public List<Consumo> getConsumoPorTipo(@PathVariable String tipoUsuario) {
        return consumoService.filtrarPorTipoUsuario(tipoUsuario);
    }

    @GetMapping("/minimo/{umbral}")
    public List<Consumo> getConsumoPorMinimo(@PathVariable double umbral) {
        return consumoService.filtrarPorConsumoMinimo(umbral);
    }

    @GetMapping("/total")
    public double getConsumoTotal() {
        return consumoService.calcularConsumoTotal();
    }
}
