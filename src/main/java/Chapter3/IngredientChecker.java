package Chapter3;

public class IngredientChecker {

    public static boolean checkIngredients(String[] ingredients) {
        int ingredientCount = 0;

        for (int i = 0; i < ingredients.length; i++)
        {
            if (ingredients[i] == "dough" ||
                    ingredients[i] == "cheese" ||
                    ingredients[i] == "pepperoni" ||
                    ingredients[i] == "tomato sauce")
            {
                ingredientCount++;
            }

            if (ingredientCount == 4)
            {
                return true;
            }
        }

        return false;
    }

    public static boolean checkForPineapple(String[] ingredients) {
        for (int i = 0; i < ingredients.length; i++)
        {
            if (ingredients[i] == "pineapple") {
                return true;
            }
        }

        return false;
    }
}
