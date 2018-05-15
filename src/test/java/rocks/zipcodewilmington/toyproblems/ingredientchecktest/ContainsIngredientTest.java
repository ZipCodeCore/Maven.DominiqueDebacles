package rocks.zipcodewilmington.toyproblems.ingredientchecktest;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.toyproblems.IngredientChecker;

/**
 * @author leon on 5/15/18.
 */
public class ContainsIngredientTest {
    @Test
    public void containsIngredientPositiveTest1() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        String soughtIngredient = "dough";

        // When
        boolean outcome = IngredientChecker.containsIngredient(ingredients, soughtIngredient);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void containsIngredientPositiveTest2() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        String soughtIngredient = "pepperoni";

        // When
        boolean outcome = IngredientChecker.containsIngredient(ingredients, soughtIngredient);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void containsIngredientPositiveTest3() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        String soughtIngredient = "ham";

        // When
        boolean outcome = IngredientChecker.containsIngredient(ingredients, soughtIngredient);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void containsIngredientNegativeTest1() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        String soughtIngredient = "bat eye";

        // When
        boolean outcome = IngredientChecker.containsIngredient(ingredients, soughtIngredient);

        // Then
        Assert.assertFalse(outcome);
    }



    @Test
    public void containsIngredientNegativeTest2() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        String soughtIngredient = "cow tongue";

        // When
        boolean outcome = IngredientChecker.containsIngredient(ingredients, soughtIngredient);

        // Then
        Assert.assertFalse(outcome);
    }



    @Test
    public void containsIngredientNegativeTest3() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        String soughtIngredient = "snail larva";

        // When
        boolean outcome = IngredientChecker.containsIngredient(ingredients, soughtIngredient);

        // Then
        Assert.assertFalse(outcome);
    }


}