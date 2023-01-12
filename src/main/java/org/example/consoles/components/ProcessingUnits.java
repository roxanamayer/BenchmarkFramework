package org.example.consoles.components;

public class ProcessingUnits {
    final String name;
    final double performancewert;


    public ProcessingUnits(String name, double performancewert)  {
        this.name = name;
        this.performancewert = performancewert;
        if (performancewert > 50.0 || performancewert < 1.0){
            throw new IllegalArgumentException();
        }

    }

    public double getPerformancewertUnit(){
        return performancewert;
    }
}
