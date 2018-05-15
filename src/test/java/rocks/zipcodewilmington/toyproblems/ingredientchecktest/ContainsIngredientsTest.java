package rocks.zipcodewilmington.toyproblems.ingredientchecktest;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.toyproblems.IngredientChecker;

/**
 * @author leon on 5/15/18.
 */
public class ContainsIngredientsTest {
    @Test
    public void containsIngredientsPositiveTest1() {
        // Given
        String[] soughtIngredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};

        // When
        boolean outcome = IngredientChecker.containsIngredients(ingredients, soughtIngredients);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void containsIngredientsPositiveTest2() {
        // Given
        String[] soughtIngredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "tomato"};
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "tomato"};

        // When
        boolean outcome = IngredientChecker.containsIngredients(ingredients, soughtIngredients);

        // Then
        Assert.assertTrue(outcome);
    }

    @Test
    public void containsIngredientsPositiveTest3() {
        // Given
        String[] soughtIngredients = {"dough", "cheese", "pepperoni", "pineapple"};
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "tomato"};

        // When
        boolean outcome = IngredientChecker.containsIngredients(ingredients, soughtIngredients);

        // Then
        Assert.assertTrue(outcome);
    }

    @Test
    public void containsIngredientsNegativeTest1() {
        // Given
        String[] soughtIngredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "tomato"};
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham"};

        // When
        boolean outcome = IngredientChecker.containsIngredients(ingredients, soughtIngredients);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void containsIngredientsNegativeTest2() {
        // Given
        String[] soughtIngredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "tomato"};
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple"};

        // When
        boolean outcome = IngredientChecker.containsIngredients(ingredients, soughtIngredients);

        // Then
        Assert.assertTrue(outcome);
    }

    @Test
    public void containsIngredientsNegativeTest3() {
        // Given
        String[] soughtIngredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "tomato"};
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "dog hair"};

        // When
        boolean outcome = IngredientChecker.containsIngredients(ingredients, soughtIngredients);

        // Then
        Assert.assertTrue(outcome);
    }

    @Test
    public void containsIngredientsNegativeTest4() {
        // Given
        String[] soughtIngredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "tomato", "etc."};
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "tomato"};

        // When
        boolean outcome = IngredientChecker.containsIngredients(ingredients, soughtIngredients);

        // Then
        Assert.assertTrue(outcome);
    }

}
