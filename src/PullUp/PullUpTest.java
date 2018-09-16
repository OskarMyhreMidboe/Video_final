package PullUp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PullupTest {
    pullUp.A c;
    pullUp.A d;

    @Before
    public void setup(){
        c = new C();
        d = new D();
    }

    @Test
    public void testerC(){
        Assert.assertEquals(4,c.addInt(1));
    }
    @Test
    public void testerD(){
        Assert.assertEquals(5, d.addInt(1));

    }
}
