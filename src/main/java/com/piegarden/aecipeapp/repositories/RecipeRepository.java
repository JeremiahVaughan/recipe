package com.piegarden.aecipeapp.repositories;

import com.piegarden.aecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
