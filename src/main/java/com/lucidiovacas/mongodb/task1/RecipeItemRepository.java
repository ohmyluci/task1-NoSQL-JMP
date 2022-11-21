package com.lucidiovacas.mongodb.task1;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeItemRepository extends MongoRepository<RecipeItem, String> {

    @Query("{title:'?0'}")
    RecipeItem findItemByTitle(String title);

    @Aggregation(pipeline = {
            "{'$match':{'prep_time' : {$lt : 15}}}",
    })
    List<RecipeItem> findFastRecipes();

    @Aggregation(pipeline = {
            "{'$match':{'prep_time' : {$lt : 15}}}",
            "{'$group':{'_id': null, 'myCount': { $sum:1 }}}"
    })
    Integer countFastRecipes();

    public long count();
}
