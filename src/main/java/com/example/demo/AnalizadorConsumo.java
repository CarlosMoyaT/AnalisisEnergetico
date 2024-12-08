package com.example.demo;

import com.example.demo.Model.Consumo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@EntityScan(basePackages = "com.example.demo.Model")
public class AnalizadorConsumo {

	public static void main(String[] args) {

		SpringApplication.run(AnalizadorConsumo.class, args);
	}

	public static List<Consumo> filtrarPorConsumo(List<Consumo> consumos, double umbral) {
		return consumos.stream()
				.filter(consumo -> consumo.getConsumoKWh() >= umbral)
				.collect(Collectors.toList());
	}

	public static List<Consumo> filtrarPorTipo(List<Consumo> consumos, String tipo) {
		return consumos.stream()
				.filter(consumo -> consumo.getTipoUsuario().equalsIgnoreCase(tipo))
				.collect(Collectors.toList());
	}

}
