package org.example;

public class CelsiusToFahrenheitConverter implements CelsiusConverter {

    private static final double FREEZING_POINT = 32;
    private static final double COEFFICIENT = 1.8;

    @Override
    public double convert(double degree) {
        return degree * COEFFICIENT + FREEZING_POINT;
    }

    @Override
    public double convert(int degree) {
        return degree * COEFFICIENT + FREEZING_POINT;
    }
}