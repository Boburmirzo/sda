package com.sda.tasks.common.junit;

import org.junit.Assert;
import org.junit.Test;

public class Max1020Test {
    @Test
    public void test1() {
        Max1020 inst1 = new Max1020();
        int expect = 19;
        int result = inst1.max1020(11, 19);
        Assert.assertEquals(expect, result);
    }
}
