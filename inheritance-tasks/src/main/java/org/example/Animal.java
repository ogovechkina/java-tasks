package org.example;

public abstract class Animal {
    private final String kind;
    private final int runDistanceLimit;
    private final double jumpHeightLimit;
    private final int swimDistanceLimit;

    /**
     * Создает животное которое умеет бегать, прыгать и плавать
     */
    protected Animal(String kind, int runDistanceLimit, double jumpHeightLimit, int swimDistanceLimit) {
        this.kind = kind;
        this.runDistanceLimit = runDistanceLimit;
        this.jumpHeightLimit = jumpHeightLimit;
        this.swimDistanceLimit = swimDistanceLimit;
    }

    /**
     * Конструктор создает животное, которое умеет бегать и прыгать, но не умеет плавать
     */
    protected Animal(String kind, int runDistanceLimit, double jumpHeightLimit) {
        this.kind = kind;
        this.runDistanceLimit = runDistanceLimit;
        this.jumpHeightLimit = jumpHeightLimit;
        this.swimDistanceLimit = 0;
    }

    public void run(int distance) {
        if (distance > runDistanceLimit) {
            System.out.println(kind + " так быстро бегать не умеет");
        } else {
            System.out.println(kind + " побежал!");
        }
    }

    public void jump(double height) {
        if (height > jumpHeightLimit) {
            System.out.println(kind + " так высоко прыгать не умеет");
        } else {
            System.out.println(kind + " прыгнул!");
        }
    }

    public void swim(int distance) {
        if (distance > swimDistanceLimit) {
            System.out.println(kind + " так далеко плавать не умеет");
        } else {
            System.out.println(kind + " поплыл!");
        }
    }

    public String getKind() {
        return kind;
    }

    public int getRunDistanceLimit() {
        return runDistanceLimit;
    }

    public double getJumpHeightLimit() {
        return jumpHeightLimit;
    }

    public int getSwimDistanceLimit() {
        return swimDistanceLimit;
    }
}
