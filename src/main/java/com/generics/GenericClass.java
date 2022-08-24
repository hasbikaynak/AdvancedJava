package com.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericClass<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        GenericClass<String> obj = new GenericClass<>();

        obj.setT("Home");

        System.out.println("Name of object "+ obj.getT());

        GenericClass<Integer> obj1 = new GenericClass<>();

        obj1.setT(1);

        System.out.println("Name of object "+ obj1.getT());


        List<String> list = new ArrayList<>();
        list.add("String type");
//        list.add(1);

        Map<String,Integer> map = new HashMap<>();
        map.put("id",1);
        map.put("image",1);

    }
}
