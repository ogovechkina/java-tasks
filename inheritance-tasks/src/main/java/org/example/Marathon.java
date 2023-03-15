package org.example;

public class Marathon {
    private final Animal[] zoo;
    private final double distance;

    public Marathon(Animal[] zoo, double distance) {
        this.zoo = zoo;
        this.distance = distance;
    }

    public void start() {
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].run(distance);
        }
    }
}
