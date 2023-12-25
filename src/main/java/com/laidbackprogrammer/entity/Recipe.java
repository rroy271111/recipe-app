package com.laidbackprogrammer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recipe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String ingrediants;
	private String instructions;
	
	public Recipe() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIngrediants() {
		return ingrediants;
	}

	public void setIngrediants(String ingrediants) {
		this.ingrediants = ingrediants;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", ingrediants=" + ingrediants + ", instructions=" + instructions
				+ "]";
	}
	
	

}
