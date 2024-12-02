package com.example.demo.controllers;

import com.example.demo.entities.PetEntity;
import com.example.demo.repositories.PetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

private final PetRepository petRepository;

public PetController(PetRepository petRepository) {
this.petRepository = petRepository;
}

@GetMapping
public List<PetEntity> findAll() {
return petRepository.findAll();
}

@PostMapping
public PetEntity save(@RequestBody PetEntity pet) {
return petRepository.save(pet);
}
}