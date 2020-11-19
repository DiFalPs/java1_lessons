import lesson6.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestMethod2 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{8,8,99,23, 9}, false},
                {new int[]{1, 4, 1, 4, 4, 1, 1}, true},
                {new int[]{2, 19, 20, 23, 3}, false}
        });
    }


    private int[] in;
    private boolean out;
    public TestMethod2(int[] in, boolean out) {
        this.in = in;
        this.out = out;
    }
    private Main main;

    @Before
    public void startTest() {
        main = new Main();
    }

    @Test
    public void t1() {
        Assert.assertEquals(Main.tOrFIfArrHave1And2(in), out);
    }
}
