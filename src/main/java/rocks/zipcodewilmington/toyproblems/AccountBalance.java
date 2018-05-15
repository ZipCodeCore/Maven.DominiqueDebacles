package rocks.zipcodewilmington.toyproblems;

/**
 * Account Balance Morning:
 * Given two parameters, of type double, `currentBalance` and `transaction`,
 * return the new bank balance after applying the transaction.
 * Transactions can either be credit or debit.
 * If the new balance is less than 0, apply a $30 overdraft fee.
 */

public class AccountBalance {

    public static double getBalance(double currentBalance, double transaction) {
        return getBalance(currentBalance, new double[]{transaction});
    }

    public static double getBalance(double currentBalance, double[] transactions) {
        double newBalance = currentBalance;

        for (int i = 0; i < transactions.length; i++) {
            newBalance += transactions[i];
        }

        if (newBalance < 0) {
            newBalance -= 30;
        }

        return newBalance;
    }
}
