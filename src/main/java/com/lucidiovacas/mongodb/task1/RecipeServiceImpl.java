package com.lucidiovacas.mongodb.task1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeItemRepository recipeItemRepo;

    public RecipeServiceImpl(RecipeItemRepository recipeItemRepo) {
        this.recipeItemRepo = recipeItemRepo;
    }

    @Override
    public RecipeItem findRecipeByTitle(String title) {
        return recipeItemRepo.findItemByTitle(title);
    }

    @Override
    public List<RecipeItem> findAll() {
        return recipeItemRepo.findAll();
    }

    @Override
    public RecipeItem saveRecipe(RecipeItem recipeItem) {
        return recipeItemRepo.save(recipeItem);
    }

    @Override
    public void deleteRecipeById(String id) {
        recipeItemRepo.deleteById(id);
    }

    @Override
    public List<RecipeItem> findFastRecipes() {
        return recipeItemRepo.findFastRecipes();
    }

    @Override
    public Integer countFastRecipes() {
        return recipeItemRepo.countFastRecipes();
    }
}
