package com.sda.tasks.common.junit;

import org.junit.Assert;
import org.junit.Test;

public class MakePiTest {

    MakePi makePi = new MakePi();

    @Test
    public void case1(){
        int[] expect = {3,1,4};
        int[] actual = MakePi.makePi(3);

        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void case2(){
        int[] expect = {3,1,4,1,5,9};
        int[] actual = MakePi.makePi(6);

        Assert.assertArrayEquals(expect, actual);
    }
}
