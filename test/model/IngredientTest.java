package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IngredientTest {
	
	Ingredient ingredientTest;
	
	public void setupStage1() {
		String name="Tomate";
		double weight=245;
		Ingredient tomate = new Ingredient(name, weight);
	}
	
	public void testAddWeight1() {
		setupStage1();
		ingredientTest.addWeight(54);
	}
	
	public void testAddWeight2() {
		setupStage1();
		ingredientTest.addWeight(-100);
	}
	
	public void testRemoveWeight1() {
		setupStage1();
		ingredientTest.removeWeight(45);
	}
	
	public void testRemoveWeight2() {
		setupStage1();
		ingredientTest.removeWeight(-100);
	}
	

}
