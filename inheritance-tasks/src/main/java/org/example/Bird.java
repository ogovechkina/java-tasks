package org.example;

public class Bird extends Animal {

    public Bird() {
        super("Птичка", 5., 0.2);
    }

    @Override
    public void run(double distance) {
        if (distance > super.getRunDistanceLimit()) {
            System.out.println(super.getKind() + " так далеко летать не умеет");
        } else {
            System.out.println(super.getKind() + " полетела!");
        }
    }
}