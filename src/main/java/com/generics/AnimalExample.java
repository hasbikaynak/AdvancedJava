package com.generics;

import java.util.ArrayList;
import java.util.List;

public class AnimalExample {
   static List<Animal> list = new ArrayList<>();
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Dog dog = new Dog();

        method(animal);
        method(cat);
        method(dog);

        for (Animal item: list) {
            item.eat();
        }
    }

    private static void method(Animal animal){

        list.add(animal);


    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cat is eating...");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog is eating...");
    }
}


