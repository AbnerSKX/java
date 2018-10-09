package builder;

import org.junit.jupiter.api.Test;

public class BuilderDemo {

	@Test
	void test() {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonvegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		nonvegMeal.showItems();
		System.out.println("Total Cost: " + nonvegMeal.getCost());
	}
}
