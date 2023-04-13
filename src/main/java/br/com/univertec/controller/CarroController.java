package br.com.univertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.univertec.entity.Carro;
import br.com.univertec.repository.CarroRepository;

@RestController
@RequestMapping("/carros")
public class CarroController {

	@Autowired
	private CarroRepository carroRepository;

	@GetMapping
	@RequestMapping("/hello")
	public String hello() {
		return "olá";
	}

	@GetMapping
	@RequestMapping("/todos_carros")
	public List<Carro> getAll() {
		return carroRepository.findAll();
	}

}
