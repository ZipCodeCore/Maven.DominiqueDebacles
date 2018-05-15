package rocks.zipcodewilmington.toyproblems.ingredientchecktest;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.toyproblems.IngredientChecker;

/**
 * @author leon on 5/15/18.
 */
public class ContainsSpecificIngredientTest {


    @Test
    public void containsPineapplePositiveTest() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        boolean expected = true;

        // When
        boolean actual = IngredientChecker.containsPineapple(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void containsPineappleNegativeTest1() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "ham", "broccoli"};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.containsPineapple(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsPineappleNegativeTest2() {
        // Given
        String[] ingredients = {};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.containsPineapple(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void containsCheesePositiveTest() {
        // Given
        String[] ingredients = {"dough", "cheese", "pepperoni", "pineapple", "ham", "broccoli"};
        boolean expected = true;

        // When
        boolean actual = IngredientChecker.containsCheese(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void containsCheeseNegativeTest1() {
        // Given
        String[] ingredients = {"dough", "pineapple", "pepperoni", "ham", "broccoli"};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.containsCheese(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsCheeseNegativeTest2() {
        // Given
        String[] ingredients = {};
        boolean expected = false;

        // When
        boolean actual = IngredientChecker.containsCheese(ingredients);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
