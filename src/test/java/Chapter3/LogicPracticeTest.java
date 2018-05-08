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

    

}
