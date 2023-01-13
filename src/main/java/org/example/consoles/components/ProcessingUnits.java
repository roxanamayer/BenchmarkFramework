package org.example.consoles.components;

public class ProcessingUnits {
    private final String name;
    private final double performancewert;


    public ProcessingUnits(final String name, final double performancewert)  {
        this.name = name;
        this.performancewert = performancewert;
        if (performancewert > 50.0 || performancewert < 1.0){
            throw new IllegalArgumentException();
        }

    }

    //Get Performance Wert of Processing Unit
    public double getPerformancewertUnit(){
        return performancewert;
    }
}
