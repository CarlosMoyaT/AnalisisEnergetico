package com.example.demo.Model;

import com.example.demo.AnalizadorConsumo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EntityScan(basePackages = "com.example.demo.Model")
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		Consumo consumo1 = new Consumo(1L, "usuario1", LocalDate.now(), 120.5, 0.15, "residencial");
		Consumo consumo2 = new Consumo(2L, "usuario2", LocalDate.now(), 85.5, 0.15, "industrial");
		List<Consumo> consumos = Arrays.asList(consumo1, consumo2);

		List<Consumo> consumosAltos = AnalizadorConsumo.filtrarPorConsumo(consumos, 100.0);
		System.out.println("Consumos mayores a 100 kWh: " + consumosAltos);
	}

}
