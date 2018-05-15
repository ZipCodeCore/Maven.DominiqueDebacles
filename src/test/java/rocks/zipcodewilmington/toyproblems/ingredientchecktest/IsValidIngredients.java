package rocks.zipcodewilmington.toyproblems.ingredientchecktest;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.toyproblems.IngredientChecker;

/**
 * @author leon on 5/15/18.
 */
public class IsValidIngredients {

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
