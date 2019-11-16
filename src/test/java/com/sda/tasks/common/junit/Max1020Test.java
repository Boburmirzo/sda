package com.sda.tasks.common.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Max1020Test {
    private Max1020 max1020;

    @Before
    public void setUp(){
        max1020 = new Max1020();
    }
    @After
    public void removeObject(){
        max1020 = null;
    }
    @Test
    public void test1() {
        int expect = 19;
        int result = max1020.max1020(11, 19);
        Assert.assertEquals(expect, result);
    }
}
