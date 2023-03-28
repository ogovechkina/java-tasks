package org.example;

public class CelsiusToKelvinConverter implements CelsiusConverter {
    private static final double COEFFICIENT = 273.15;

    @Override
    public double convert(double degree) {
        return degree + COEFFICIENT;
    }
}
