package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ClienteEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy= "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PetEntity> pets;
	
	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
	
    }
    public String getName() {
            return name;
        }
    public void setName(String name) {
            this.name = name;}
          
            public List<PetEntity> getPets() {
                return pets;
            }
        public void setPets(List<PetEntity> pets) {
                this.pets = pets;
        }       
}
