package com.piegarden.aecipeapp.controllers;

import com.piegarden.aecipeapp.domain.Category;
import com.piegarden.aecipeapp.domain.UnitOfMeasure;
import com.piegarden.aecipeapp.repositories.CategoryRepository;
import com.piegarden.aecipeapp.repositories.UnitOfMeasureRepository;
import com.piegarden.aecipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        //log.debug("Home page navigated too");
        return "index";
    }
}
