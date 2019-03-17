package com.piegarden.aecipeapp.services;

import com.piegarden.aecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
