package org.example.human;

public abstract class Human {
    private final String name;
    private final int age;

    protected Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
