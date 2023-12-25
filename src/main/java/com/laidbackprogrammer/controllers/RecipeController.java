package com.laidbackprogrammer.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laidbackprogrammer.entity.Recipe;
import com.laidbackprogrammer.entity.RecipeRepository;

@RestController
public class RecipeController {

	@Autowired
	private RecipeRepository recipeRepository;

	@GetMapping()
	public List<Recipe> getAllRecipes() {

		return recipeRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Recipe> getRecipeById(@PathVariable("id") Long id) {
		Optional<Recipe> recipe = recipeRepository.findById(id);
		return recipe.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

	}

	@PostMapping()
	public Recipe createRecipe(@RequestBody Recipe recipe) {
		return recipeRepository.save(recipe);

	}
}
