package com.lucidiovacas.mongodb.task1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/v1/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("add")
    private RecipeItem createRecipe(@RequestBody RecipeItem recipe) {
        log.info("Saving recipe {}", recipe.getTitle());
        return recipeService.saveRecipe(recipe);
    }

    @GetMapping
    private RecipeItem getRecipeByTitle(@RequestParam String title) {
        log.info("Getting recipe by title {}", title);
        return recipeService.findRecipeByTitle(title);
    }

    @GetMapping("all")
    private List<RecipeItem> getAllRecipes() {
        log.info("Getting all recipes");
        List<RecipeItem> recipes = recipeService.findAll();
        return recipes;
    }

    @GetMapping("fast-recipes")
    private List<RecipeItem> getFastRecipes() {
        log.info("Getting all fast recipes");
        List<RecipeItem> recipes = recipeService.findFastRecipes();
        return recipes;
    }

    @GetMapping("count")
    private Integer getCountFastRecipes() {
        log.info("Getting all fast recipes");
        return recipeService.countFastRecipes();
    }

    @DeleteMapping("/delete/{id}")
    private void deleteById(@PathVariable("id") String id) {
        log.info("Delete by id {}", id);
        recipeService.deleteRecipeById(id);
    }

}
