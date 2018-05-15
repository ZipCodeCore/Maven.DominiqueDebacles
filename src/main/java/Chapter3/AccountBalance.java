package Chapter3;

public class AccountBalance {

    public static double getBalance(double currentBalance, double transaction) {
        return getBalance(currentBalance, new double[]{transaction});
    }

    public static double getBalance(double currentBalance, double[] transactions) {
        double newBalance = currentBalance;

        for(int i = 0; i < transactions.length; i++) {
            newBalance += transactions[i];
        }

        if (newBalance < 0) {
            newBalance -= 30;
        }

        return newBalance;
    }
}
