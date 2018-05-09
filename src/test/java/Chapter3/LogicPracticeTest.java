package Chapter3;

import org.junit.Assert;
import org.junit.Test;

public class LogicPracticeTest {

    @Test
    public void make10() {
        Assert.assertTrue(LogicPractice.make10(9,1));
        Assert.assertTrue(LogicPractice.make10(10,1));
        Assert.assertTrue(LogicPractice.make10(9,10));
        Assert.assertTrue(LogicPractice.make10(4,6));
        Assert.assertFalse(LogicPractice.make10(8,1));
        Assert.assertFalse(LogicPractice.make10(8,18));
        Assert.assertFalse(LogicPractice.make10(4,11));
    }

    @Test
    public void sleepIn() {
        Assert.assertTrue(LogicPractice.sleepIn(true, true));
        Assert.assertTrue(LogicPractice.sleepIn(false, true));
        Assert.assertTrue(LogicPractice.sleepIn(true, false));
        Assert.assertFalse(LogicPractice.sleepIn(false, false));
    }

    @Test
    public void sumOrDouble() {
        Assert.assertEquals(LogicPractice.sumOrDouble(2, 3), 5);
        Assert.assertEquals(LogicPractice.sumOrDouble(2, 2), 8);
        Assert.assertEquals(LogicPractice.sumOrDouble(1, 3), 4);
        Assert.assertEquals(LogicPractice.sumOrDouble(6, 23), 29);
        Assert.assertEquals(LogicPractice.sumOrDouble(12, 12), 48);
    }

    @Test
    public void differenceDigits() {
        Assert.assertEquals(LogicPractice.differenceDigits(10), 1);
        Assert.assertEquals(LogicPractice.differenceDigits(23), 1);
        Assert.assertEquals(LogicPractice.differenceDigits(52), 3);
        Assert.assertEquals(LogicPractice.differenceDigits(73), 4);
        Assert.assertEquals(LogicPractice.differenceDigits(99), 0);
    }

    @Test
    public void notString() {
        Assert.assertEquals(LogicPractice.notString("cat"), "not cat");
        Assert.assertEquals(LogicPractice.notString("me"), "not me");
        Assert.assertEquals(LogicPractice.notString("not a chance"), "not a chance");
        Assert.assertEquals(LogicPractice.notString("notably"), "not notably");
    }

    @Test
    public void repayment() {
        Assert.assertTrue(LogicPractice.repayment(true, true));
        Assert.assertFalse(LogicPractice.repayment(false, true));
        Assert.assertFalse(LogicPractice.repayment(true, false));
        Assert.assertFalse(LogicPractice.repayment(false, false));
    }

    @Test
    public void removeCharacter() {
        Assert.assertEquals(LogicPractice.removeCharacter("Hello", 0), "ello");
        Assert.assertEquals(LogicPractice.removeCharacter("Notebook", 4), "Noteook");
        Assert.assertEquals(LogicPractice.removeCharacter("impress", 20), "impress");
    }

    @Test
    public void roundSum() {
        Assert.assertEquals(LogicPractice.roundSum(1,2,3), 10);
        Assert.assertEquals(LogicPractice.roundSum(12,12,14), 30);
        Assert.assertEquals(LogicPractice.roundSum(16,18,19), 60);
        Assert.assertEquals(LogicPractice.roundSum(3,3,4), 10);
    }

    @Test
    public void blackJack() {
        Assert.assertEquals(LogicPractice.blackJack(10, 11), 11);
        Assert.assertEquals(LogicPractice.blackJack(20, 11), 20);
        Assert.assertEquals(LogicPractice.blackJack(21, 20), 21);
        Assert.assertEquals(LogicPractice.blackJack(22, 10), 10);
        Assert.assertEquals(LogicPractice.blackJack(19, 22), 19);
    }

    @Test
    public void evenlySpaced() {
        Assert.assertTrue(LogicPractice.evenlySpaced(1,2,3));
        Assert.assertTrue(LogicPractice.evenlySpaced(2,4,6));
        Assert.assertTrue(LogicPractice.evenlySpaced(6,4,2));
        Assert.assertTrue(LogicPractice.evenlySpaced(1,7,4));

        Assert.assertFalse(LogicPractice.evenlySpaced(2,7,4));
        Assert.assertFalse(LogicPractice.evenlySpaced(1,2,9));
        Assert.assertFalse(LogicPractice.evenlySpaced(3,2,13));
        Assert.assertFalse(LogicPractice.evenlySpaced(19,9,3));


    }

}
