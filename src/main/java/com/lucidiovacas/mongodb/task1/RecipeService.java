package com.lucidiovacas.mongodb.task1;

import org.springframework.stereotype.Service;

import java.util.List;

public interface RecipeService{

    public RecipeItem findRecipeByTitle(String title);
    public List<RecipeItem> findAll();
    public RecipeItem saveRecipe(RecipeItem recipeItem);
    public void deleteRecipeById(String id);
    public List<RecipeItem> findFastRecipes();
    public Integer countFastRecipes();
}
