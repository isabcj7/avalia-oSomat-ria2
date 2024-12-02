package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ClienteEntity;
import com.example.demo.repositories.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	private final ClienteRepository clienteRepository;
	
	public ClienteController(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
		
	}
	
	@GetMapping
	public List<ClienteEntity> findAll(){
		return clienteRepository.findAll();
	}
	
	@PostMapping("/criar")
	public ClienteEntity save(@RequestBody ClienteEntity cliente) {
		return clienteRepository.save(cliente);
	}
}
