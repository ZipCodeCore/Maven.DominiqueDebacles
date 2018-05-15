package rocks.zipcodewilmington.toyproblems;

import org.junit.Assert;
import org.junit.Test;

public class IngredientCheckerTest {
    /* Ingredient Checker Morning:
       Tariq loves pizza, but hates pineapple. Given a an array of strings representing pizza ingredients, return true if
       the ingredients contain pineapple. Return false if the ingredients do not.

       Can add extra difficulty by testing ingredients ignoring case
    */
    @Test
    public void checkForPineapplePositiveTest() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        boolean expected = true;

        // When
        boolean actual = IngredientChecker.containsPineapple(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void checkForPineappleNegativeTest1() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "ham", "broccoli"};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.containsPineapple(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkForPineappleNegativeTest2() {
        // Given
        String[] ingredients = {};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.containsPineapple(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isValidIngredientsPositive1() {
        // Given
        String[] ingredients = {"dough", "cheese", "tomato sauce", "pepperoni"};
        boolean expected = true;

        // When
        boolean actual = IngredientChecker.isValidIngredients(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isValidIngredientsPositive2() {
        // Given
        String[] ingredients = {"dough", "cheese", "tomato sauce", "pepperoni", "pineapple", "ham", "broccoli"};
        boolean expected = true;

        // When
        boolean actual = IngredientChecker.isValidIngredients(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isValidIngredientsNegative1() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.isValidIngredients(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isValidIngredientsNegative2() {
        // Given
        String[] ingredients = {};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.isValidIngredients(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void isValidIngredientsNegative3() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "a human earlobe"};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.isValidIngredients(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
