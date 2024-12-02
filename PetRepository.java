package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.PetEntity;

public interface PetRepository extends JpaRepository<PetEntity, Long> {

}
