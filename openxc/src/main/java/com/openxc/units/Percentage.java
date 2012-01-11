package com.openxc.units;

/**
 * Percentage, a unit expressing a number as a fraction of 100.
 */
public class Percentage extends Quantity<Double> implements Unit {

    public Percentage(double value) {
        super(value);
    }
}
