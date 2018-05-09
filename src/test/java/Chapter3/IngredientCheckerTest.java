package Chapter3;

import org.junit.Assert;
import org.junit.Test;

public class IngredientCheckerTest {
    /* Ingredient Checker Morning:
       Tariq loves pizza, but hates pineapple. Given a an array of strings representing pizza ingredients, return true if
       the ingredients contain pineapple. Return false if the ingredients do not.

       Can add extra difficulty by testing ingredients ignoring case
    */
    @Test
    public void testIngredientCheckerMorning1() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        boolean expected = true;

        // When
        boolean actual = IngredientChecker.checkForPineapple(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIngredientCheckerMorning2() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "ham", "broccoli"};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.checkForPineapple(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIngredientCheckerMorning3() {
        // Given
        String[] ingredients = {};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.checkForPineapple(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    /* Ingredient Checker Afternoon:
       Dominique wants to make a pepperoni pizza. In order to make the pizza, she needs to insure that she has
       all the ingredients necessary. Ingredients include dough, cheese, tomato sauce and pepperoni. Given an array of
       strings representing the ingredients in her fridge, return true if she has all of the necessary ingredients.
       Return false if she is missing any ingredients. The list of ingredients contains no duplicates.

       Can add extra difficulty by testing ingredients ignoring case
    */

    @Test
    public void testIngredientCheckerAfternoon1() {
        // Given
        String[] ingredients = {"dough", "cheese", "tomato sauce", "pepperoni"};
        boolean expected = true;

        // When
        boolean actual = IngredientChecker.checkIngredients(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIngredientCheckerAfternoon2() {
        // Given
        String[] ingredients = {"dough", "cheese", "tomato sauce", "pepperoni", "pineapple", "ham", "broccoli"};
        boolean expected = true;

        // When
        boolean actual = IngredientChecker.checkIngredients(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIngredientCheckerAfternoon3() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.checkIngredients(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIngredientCheckerAfternoon4() {
        // Given
        String[] ingredients = {};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.checkIngredients(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
