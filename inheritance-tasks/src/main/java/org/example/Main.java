package org.example;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        Bird bird = new Bird();
        Cat cat = new Cat();

        dog.run(500);
        dog.run(501);
        dog.swim(10);
        dog.swim(11);
        dog.jump(0.5);
        dog.jump(0.51);
        horse.run(1500);
        horse.run(1501);
        horse.swim(100);
        horse.swim(101);
        horse.jump(3);
        horse.jump(3.1);
        bird.run(5);
        bird.run(6);
        bird.jump(0.2);
        bird.jump(0.21);
        bird.swim(1);
        cat.run(200);
        cat.run(201);
        cat.jump(2);
        cat.jump(2.1);
        cat.swim(2);

    }

}
