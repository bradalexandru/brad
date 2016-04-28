package com.javafortesters.com.javafortesters.hex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexandru.brad on 4/26/2016.
 */
public class ToHeXString {
    @Test
    public void toHexString(){
        Integer hex = new Integer(21);
        Integer.toHexString(hex);
        assertEquals("15", Integer.toHexString(hex));
    }

}
