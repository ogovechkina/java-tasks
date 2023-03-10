package org.example;

public class Cat extends Animal {

    public Cat() {
        super("Котик", 200, 2);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Я не умею плавать!");
    }
}