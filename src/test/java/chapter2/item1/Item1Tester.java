package chapter2.item1;

import org.junit.Assert;
import org.junit.Test;

public class Item1Tester {

    @Test
    public void testStaticFactory() {
        Item1 one = Item1.withoutAddress("jim", 56);
        Assert.assertEquals("test", one.getAddress());
    }

}
