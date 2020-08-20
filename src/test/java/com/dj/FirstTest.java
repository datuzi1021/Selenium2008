package com.dj;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2020/8/20.
 */
public class FirstTest {
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest被执行=======");

    }
    @Test
    public void testFirst(){
        System.out.println("test被执行========");
    }
}
