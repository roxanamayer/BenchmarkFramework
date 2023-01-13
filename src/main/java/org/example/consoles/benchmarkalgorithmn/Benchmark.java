package org.example.consoles.benchmarkalgorithmn;

import org.example.consoles.components.Software;
import org.example.consoles.hardware.Console;
import org.example.consoles.hardware.StudyStation;

import java.util.ArrayList;

public class Benchmark {



    public void executeBenchmark(Console c1){
        double result = 0;

        ArrayList<Double> rechenverbrauch = new ArrayList<>();
        for (double m : rechenverbrauch){
            rechenverbrauch.add(c1.getRechenverbrauch());
        }

        for (int i=0; i<rechenverbrauch.size(); i++){
            System.out.println(c1.getPerformancewert()/rechenverbrauch.get(i));

        }




    }
}
