package com.lucidiovacas.mongodb.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document("recipes")
@AllArgsConstructor
@NoArgsConstructor
public class RecipeItem implements Serializable {

    @Id
    private String id;
    private String title;

    @Field("prep_time")
    private Float prepTime;

    @Field("likes_count")
    private Integer likesCount;

    public RecipeItem(String title, Float prepTime, Integer likesCount) {
        this.title = title;
        this.prepTime = prepTime;
        this.likesCount = likesCount;
    }
}

