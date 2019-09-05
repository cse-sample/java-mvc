package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectjava1 {

        Projectjava1Delegate projectjava1Delegate = new Projectjava1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectjava1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}