package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RecipeTest {
	
	Recipe recipeTest;

	void setupStage1(){
		recipeTest = new Recipe(null, 0);
	}
	
	void setupStage2() {
		recipeTest=new Recipe(null, 0);
		
		recipeTest.addIngredient("Cebolla", 315);
		
		recipeTest.addIngredient("Ajo", 58);
		
		recipeTest.addIngredient("Arroz", 120);
		
		
	}
	
	@Test
	public void testAddIngredient1() {
		setupStage1();
		String n="sal";
		Double w=12.0;
		recipeTest.addIngredient(n, w);
		assertEquals(1, recipeTest.size());
	}
	
	@Test
	public void testAddIngredient2() {
		setupStage2();
		recipeTest.addIngredient("Pimienta", 6);
	}
	
	public void testAddIngredient3() {
		setupStage2();
		
	}

	/*
	List<Ingredient> ingredientsTest;
	ingredientsTest=new ArrayList<Ingredient>();
	assertNotNull(ingredientsTest);
	assertEquals(ingredientsTest.size(), 0); 
	*/
}
