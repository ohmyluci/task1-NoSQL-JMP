package com.lucidiovacas.mongodb.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Task1Application {

	public static void main(String[] args) {

		SpringApplication.run(Task1Application.class, args);

	}

//	@Bean
//	CommandLineRunner runner(RecipeItemRepository repository) {
//		return args -> {
//			RecipeItem recipeItem = new RecipeItem("Vegan Beef");
//			repository.save(recipeItem);
//		};
//	}

}
