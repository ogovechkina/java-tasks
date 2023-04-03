package org.example2.barrier;

import org.example2.barrier.Barrier;
import org.example2.barrier.Competitor;

public class RunningTrackBarrier implements Barrier {
    private final double distance;

    public RunningTrackBarrier(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public boolean cross(Competitor competitor) {
        if (competitor.run(distance)) {
            System.out.println("Успешно пробежал дистанцию в " + distance + " метров.");
            return true;
        } else {
            System.out.println("Не смог пробежать.");
            return false;
        }
    }
}
