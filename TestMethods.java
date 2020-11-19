import lesson6.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMethods {
    Main ourMain;

    @Before
    public void init () {
        ourMain = new Main();
    }

    @Test
    public void t1() {
        int[] arrForSend = new int[]{1,3,3,3,2,3,3,1,7};
        int[] arrWithRightReturnValue = new int[]{1,7};
        Assert.assertArrayEquals(arrWithRightReturnValue, ourMain.addArrayWithNumberFour(arrForSend));
    }

    @Test
    public void t2() {
        int[] arrForSend = new int[]{1,3,4,3,2,3,3,1,7};
        int[] arrWithRightReturnValue = new int[]{3,2,3,3,1,7};
        Assert.assertArrayEquals(arrWithRightReturnValue, ourMain.addArrayWithNumberFour(arrForSend));
    }

    @Test (expected = RuntimeException.class)
    public void t3() {
        int[] arrForSend = new int[]{1,3,3,3,2,3,4,1,7};
        int[] arrWithRightReturnValue = new int[]{1,7};
        Assert.assertArrayEquals(arrWithRightReturnValue, ourMain.addArrayWithNumberFour(arrForSend));
    }


}
