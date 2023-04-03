package org.example2.competitor;

import org.example2.barrier.Competitor;

public class Human implements Competitor {
    private static final double RUN_DISTANCE_LIMIT = 2000.4;
    private static final double JUMP_HEIGHT_LIMIT = 1.5;

    private final String name;

    public Human(String name) {
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
