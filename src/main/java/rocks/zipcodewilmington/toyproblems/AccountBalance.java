package rocks.zipcodewilmington.toyproblems;

/**
 * Account Balance Morning:
 * Given two parameters, of type double, `currentBalance` and `transaction`,
 * return the new bank balance after applying the transaction.
 * Transactions can either be credit or debit.
 * If the new balance is less than 0, apply a $30 overdraft fee.
 */

public class AccountBalance {

    public static Double getBalance(double currentBalance, double transaction) {
        return getBalance(currentBalance, new double[]{transaction});
    }

    public static Double getBalance(double currentBalance, double[] transactions) {
        double newBalance = currentBalance;
        for (double transaction : transactions) {
            newBalance += transaction;
        }

        if (newBalance < 0) {
            newBalance -= 30;
        }

        return newBalance;
    }
}
