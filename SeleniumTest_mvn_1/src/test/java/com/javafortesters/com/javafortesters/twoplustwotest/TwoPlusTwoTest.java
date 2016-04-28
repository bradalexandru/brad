package com.javafortesters.com.javafortesters.twoplustwotest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexandru.brad on 4/26/2016.
 */
public class TwoPlusTwoTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        Assert.assertEquals("2+2=4", 4, answer );

        int second = answer /2;
        Assert.assertEquals("second=answer/2",2,second);
    }
}
