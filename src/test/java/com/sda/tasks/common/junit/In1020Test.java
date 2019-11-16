package com.sda.tasks.common.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class In1020Test {
    private In1020 inst1 = new In1020();
    @After
    public void remove(){
        inst1 = null;
    }
    @Test
    public void test1(){
        boolean result = inst1.icyHot(0, 0);
        boolean expect = false;
        Assert.assertFalse(expect!=result);
    }
    @Test
    public void test2(){
        boolean result = inst1.icyHot(-150, 50);
        boolean expect = false;
        Assert.assertFalse(expect!=result);
    }
    @Test
    public void test3(){
        boolean result = inst1.icyHot(0, 100);
        boolean expect = false;
        Assert.assertFalse(expect!=result);
    }
    @Test
    public void test4(){
        boolean result = inst1.icyHot(-150, 101);
        boolean expect = true;
        Assert.assertFalse(expect!=result);
    }

}
