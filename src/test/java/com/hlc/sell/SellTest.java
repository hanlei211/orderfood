package com.hlc.sell;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SellApplication.class})
public class SellTest {

    @Test
    public  void  testOne(){
        System.out.println("hello world!");
        TestCase.assertEquals(1,1);
    }

    @Test
    public  void  testTwo(){
        System.out.println("hello world2!");
        TestCase.assertEquals(1,1);
    }

    @Before
    public  void  testBefore(){
         System.out.println("Before");
    }

    @After
    public  void  testAfter(){
        System.out.println("After");
    }
}