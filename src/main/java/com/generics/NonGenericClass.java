package com.generics;

import java.awt.*;

public class NonGenericClass {

    private Object t;

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }

    public static void main(String[] args) {

        NonGenericClass obj = new NonGenericClass();
        NonGenericClass obj1 = new NonGenericClass();
        obj.setT("John");
        obj1.setT("Harry");

//        String str = (String)obj1.getT();
        System.out.println("Name of object "+ obj1.getT());

    }
}
