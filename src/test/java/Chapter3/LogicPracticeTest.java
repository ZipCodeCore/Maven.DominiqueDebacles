package Chapter3;

import org.junit.Assert;
import org.junit.Test;

public class LogicPracticeTest {

    @Test
    public void notString() {
        Assert.assertEquals(LogicPractice.notString("cat"), "not cat");
        Assert.assertEquals(LogicPractice.notString("me"), "not me");
        Assert.assertEquals(LogicPractice.notString("not a chance"), "not a chance");
        Assert.assertEquals(LogicPractice.notString("notably"), "not notably");
    }

    @Test
    public void repayment() {
        Assert.assertTrue(LogicPractice.isRepaymentRequired(true, true));
        Assert.assertFalse(LogicPractice.isRepaymentRequired(false, true));
        Assert.assertFalse(LogicPractice.isRepaymentRequired(true, false));
        Assert.assertFalse(LogicPractice.isRepaymentRequired(false, false));
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
        Assert.assertEquals(LogicPractice.getBlackJackValue(10, 11), 11);
        Assert.assertEquals(LogicPractice.getBlackJackValue(20, 11), 20);
        Assert.assertEquals(LogicPractice.getBlackJackValue(21, 20), 21);
        Assert.assertEquals(LogicPractice.getBlackJackValue(22, 10), 10);
        Assert.assertEquals(LogicPractice.getBlackJackValue(19, 22), 19);
    }

    @Test
    public void evenlySpaced() {
        Assert.assertTrue(LogicPractice.isEvenlySpaced(1,2,3));
        Assert.assertTrue(LogicPractice.isEvenlySpaced(2,4,6));
        Assert.assertTrue(LogicPractice.isEvenlySpaced(6,4,2));
        Assert.assertTrue(LogicPractice.isEvenlySpaced(1,7,4));

        Assert.assertFalse(LogicPractice.isEvenlySpaced(2,7,4));
        Assert.assertFalse(LogicPractice.isEvenlySpaced(1,2,9));
        Assert.assertFalse(LogicPractice.isEvenlySpaced(3,2,13));
        Assert.assertFalse(LogicPractice.isEvenlySpaced(19,9,3));
    }

}
