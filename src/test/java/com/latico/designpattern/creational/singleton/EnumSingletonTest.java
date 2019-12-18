package com.latico.designpattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnumSingletonTest {

    @Test
    public void getInstance() {
        System.out.println(EnumSingleton.class);
        System.out.println("=====");
        System.out.println(EnumSingleton.getInstance().toString());
    }
}