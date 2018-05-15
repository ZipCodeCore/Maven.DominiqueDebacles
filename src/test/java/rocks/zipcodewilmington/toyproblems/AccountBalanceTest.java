package rocks.zipcodewilmington.toyproblems;

import org.junit.Assert;
import org.junit.Test;

public class AccountBalanceTest {
    @Test
    public void testAccountBalanceMorning1() {
        // Given
        double currentBalance = 30.00;
        double transaction = -40.00;
        double expected = -40.00;

        // When
        double actual = AccountBalance.getBalance(currentBalance, transaction);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testAccountBalanceMorning2() {
        // Given
        double currentBalance = 30.00;
        double transaction = 40.00;
        double expected = 70.00;

        // When
        double actual = AccountBalance.getBalance(currentBalance, transaction);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testAccountBalanceMorning3() {
        // Given
        double currentBalance = 30.00;
        double transaction = -10.00;
        double expected = 20.00;

        // When
        double actual = AccountBalance.getBalance(currentBalance, transaction);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testAccountBalanceMorning4() {
        // Given
        double currentBalance = 30.00;
        double transaction = -30.00;
        double expected = 0.00;

        // When
        double actual = AccountBalance.getBalance(currentBalance, transaction);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    /* Account Balance Afternoon:
    Given two parameters, double currentBalance and an double[] array of transactions, return the new bank balance after
    applying all the transactions. Transactions can either be credit or debit. If the new balance is less than 0,
    apply a $30 overdraft fee.
     */

    @Test
    public void testAccountBalanceAfternoon1() {
        // Given
        double currentBalance = 30.00;
        double[] transactions = {-20.00, 30.00, -10.00, 5.00};
        double expected = 35.00;

        // When
        double actual = AccountBalance.getBalance(currentBalance, transactions);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testAccountBalanceAfternoon2() {
        // Given
        double currentBalance = 30.00;
        double[] transactions = {-20.00, -30.00, -10.00, -5.00};
        double expected = -65.00;

        // When
        double actual = AccountBalance.getBalance(currentBalance, transactions);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testAccountBalanceAfternoon3() {
        // Given
        double currentBalance = 30.00;
        double[] transactions = {-20.00, -5.00};
        double expected = 5.00;

        // When
        double actual = AccountBalance.getBalance(currentBalance, transactions);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testAccountBalanceAfternoon4() {
        // Given
        double currentBalance = 30.00;
        double[] transactions = {20.00, 5.00, 5.62, 3.84, -9.02};
        double expected = 55.44;

        // When
        double actual = AccountBalance.getBalance(currentBalance, transactions);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }
}
