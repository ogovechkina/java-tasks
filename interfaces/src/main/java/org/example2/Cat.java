package org.example2;

public class Cat implements Competitor {
    private static final double RUN_DISTANCE_LIMIT = 3000;
    private static final double JUMP_HEIGHT_LIMIT = 2.5;
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean jump(double jumpHeight) {
        return jumpHeight <= JUMP_HEIGHT_LIMIT;
    }

    @Override
    public boolean run(double distance) {
        return distance <= RUN_DISTANCE_LIMIT;
    }

    @Override
    public String getName() {
        return name;
    }
}
