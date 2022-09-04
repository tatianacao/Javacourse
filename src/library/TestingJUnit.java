package library;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import org.junit.Assert;
import org.junit.Test;

public class TestingJUnit {
    Calculator cal = new Calculator ();
    @Test
    public void testAdd(){
      //req: 3+7 = 10
    int addTotal = cal.add(3,7);
    System.out.println(cal.add(3,7));
    Assert.assertEquals(10, cal.add(3, 7));
    }

    @Test
    public void testSub(){
    //req: 20-12 = 8
    int subTotal = cal.sub(20, 12);
    System.out.println(cal.sub(20, 12));
    Assert.assertEquals(8, cal.sub(20, 12));
    //this takes two parameters, expected and actual
//had to add hamcrest and junit
        //assertion verifies if the expected result is the acdtual
    }
}
