package org.example2.barrier;

import org.example2.barrier.Barrier;
import org.example2.barrier.Competitor;

public class WallBarrier implements Barrier {
    private final Double height;

    public WallBarrier(Double height) {
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public boolean cross(Competitor competitor) {
        if (competitor.jump(height)) {
            System.out.println("Успешно перепрыгнул " + height + " метров.");
            return true;
        } else {
            System.out.println("Не смог перепрыгнуть.");
            return false;
        }
    }
}
