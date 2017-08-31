import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {
    @Test
    public void test(){fail("KUY");}

    @Test
    public void testCase(){
        Assert.assertEquals(Controller.test(),"15.00");
    }

}