package org.example;

public abstract class Animal {
    private final String kind;
    private final Double runDistanceLimit;
    private final Double jumpHeightLimit;
    private final Double swimDistanceLimit;

    /**
     * Конструктор создает животное которое умеет бегать, прыгать и плавать
     */
    protected Animal(String kind, Double runDistanceLimit, Double jumpHeightLimit, Double swimDistanceLimit) {
        this.kind = kind;
        this.runDistanceLimit = runDistanceLimit;
        this.jumpHeightLimit = jumpHeightLimit;
        this.swimDistanceLimit = swimDistanceLimit;
    }

    /**
     * Конструктор создает животное, которое умеет бегать и прыгать, но не умеет плавать
     */
    protected Animal(String kind, Double runDistanceLimit, Double jumpHeightLimit) {
        this.kind = kind;
        this.runDistanceLimit = runDistanceLimit;
        this.jumpHeightLimit = jumpHeightLimit;
        this.swimDistanceLimit = null;
    }

    public void run(double distance) {
        if (runDistanceLimit == null || runDistanceLimit == 0){
            System.out.println("Я не умею бегать");
        } else if (distance > runDistanceLimit) {
            System.out.println(kind + " так быстро бегать не умеет");
        } else {
            System.out.println(kind + " побежал!");
        }
    }

    public void jump(double height) {
        if (jumpHeightLimit == null || jumpHeightLimit == 0){
            System.out.println("Я не умею прыгать");
        } else if (height > jumpHeightLimit) {
            System.out.println(kind + " так высоко прыгать не умеет");
        } else {
            System.out.println(kind + " прыгнул!");
        }
    }

    public void swim(double distance) {
        if (swimDistanceLimit == null || swimDistanceLimit == 0){
            System.out.println("Я не умею плавать");
        }
        else if (distance > swimDistanceLimit) {
            System.out.println(kind + " так далеко плавать не умеет");
        } else {
            System.out.println(kind + " поплыл!");
        }
    }

    public String getKind () {
        return kind;
    }

    public Double getRunDistanceLimit() {
        return runDistanceLimit;
    }

    public Double getJumpHeightLimit() {
        return jumpHeightLimit;
    }

    public Double getSwimDistanceLimit() {
        return swimDistanceLimit;
    }
}