package org.example2.barrier;

import org.example2.competitor.Jumper;
import org.example2.competitor.Runner;

public interface Competitor extends Runner, Jumper {

    String getName();
}
