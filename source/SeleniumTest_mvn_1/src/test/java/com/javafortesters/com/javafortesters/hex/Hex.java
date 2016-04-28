package com.javafortesters.com.javafortesters.hex;

import java.lang.*;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static java.lang.Integer.*;

/**
 * Created by alexandru.brad on 4/26/2016.
 */

public class Hex {

    @Test
    public void test() {
        Assert.assertEquals(true, Integer.toHexString(11).equals("b"));
    }

    @Test
    public void test2() {
        assertEquals("11 equals to b","b", toHexString(11));
    }

    @Test
    public void test3() {
        assertEquals("3 equals to 3", 3, Integer.valueOf("3").intValue());
    }

    @Test
    public void test4() {
        assertEquals("5 equals to 5", 5 , parseInt("5"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(true, Integer.toHexString(21).equals("15"));
    }


    @Test
    public void integerHex(){

        Integer hex = new Integer(11);
        assertEquals("b", hex.toHexString(hex));
    }
}
