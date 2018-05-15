package rocks.zipcodewilmington.toyproblems;


/**
 * Ingredient Checker Afternoon:
 * Dominique wants to make a pepperoni pizza.
 * In order to make the pizza, she needs to insure that she has all the ingredients necessary.
 * Ingredients include dough, cheese, tomato sauce and pepperoni.
 * Given an array of strings representing the ingredients in her fridge, return true if she has all of the necessary ingredients.
 * Return false if she is missing any ingredients.
 * The list of ingredients contains no duplicates.
 * Can add extra difficulty by testing ingredients ignoring case
 */

public class IngredientChecker {

    public static boolean isValidIngredients(String[] ingredients) {
        boolean containsDough = containsIngredient(ingredients, "dough");
        boolean containsCheese = containsIngredient(ingredients, "cheese");
        boolean containsPepperoni = containsIngredient(ingredients, "pepperoni");
        boolean containsTomatoSauce = containsIngredient(ingredients, "tomato sauce");
        return containsDough && containsCheese && containsPepperoni && containsTomatoSauce;
    }

    public static boolean containsPineapple(String[] ingredients) {
        return containsIngredient(ingredients, "pineapple");
    }


    public static boolean containsCheese(String[] ingredients) {
        return containsIngredient(ingredients, "apple");
    }

    public static boolean containsIngredient(String[] ingredients, String soughtIngredient) {
        for (String ingredient : ingredients) {
            if (ingredient.equals(soughtIngredient)) {
                return true;
            }
        }
        return false;
    }
}
