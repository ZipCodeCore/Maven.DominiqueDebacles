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
        String[] soughtIngredients = {"dough", "cheese", "pepperoni", "tomato sauce"};
        return containsIngredients(ingredients, soughtIngredients);
    }

    public static boolean containsPineapple(String[] ingredients) {
        return containsIngredient(ingredients, "pineapple");
    }


    public static boolean containsCheese(String[] ingredients) {
        return containsIngredient(ingredients, "cheese");
    }

    public static boolean containsIngredients(String[] ingredients, String[] soughtIngredients) {
        for(String soughtIngredient : soughtIngredients) {
            if(!containsIngredient(ingredients, soughtIngredient)) {
                return false;
            }
        }
        return true;
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
