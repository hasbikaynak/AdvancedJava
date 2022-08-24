package com.generics;

public class GenericClassTwoParams<K,V> {

    private K key;
    private V value;

    public GenericClassTwoParams(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericClassTwoParams<String,Integer> map = new GenericClassTwoParams<>("id",1);
        System.out.println(map.getKey()+ " = " + map.getValue());
    }
}
