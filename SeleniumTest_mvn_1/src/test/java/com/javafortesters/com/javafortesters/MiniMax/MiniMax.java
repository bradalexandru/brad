package com.javafortesters.com.javafortesters.MiniMax;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * Created by alexandru.brad on 4/26/2016.
 */

public class MiniMax {

    @Test
    public void test() {
        Assert.assertEquals(true, (MIN_VALUE == -2147483648));
    }

    @Test
    public void test2() {
        Assert.assertEquals(true, (Integer.MAX_VALUE == 2147483647));
    }
    @Test
    public void test3() {
        Assert.assertEquals(-2147483648, MIN_VALUE);
    }

    @Test
    public void test4() {
        Assert.assertEquals(MAX_VALUE, 2147483647);
    }


}
