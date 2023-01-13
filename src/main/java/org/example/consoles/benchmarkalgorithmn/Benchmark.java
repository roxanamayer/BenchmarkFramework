package org.example.consoles.benchmarkalgorithmn;

import org.example.consoles.components.Software;
import org.example.consoles.hardware.Console;
import org.example.consoles.hardware.StudyStation;

import java.util.ArrayList;

public class Benchmark {



    public ArrayList<Double> executeBenchmark(Console c1){
        double result = 0;

        ArrayList<Software> softwareConsole = c1.getSoftware();

        ArrayList<Double>endresult = new ArrayList<>();

        for(int i=0; i<softwareConsole.size(); i++){
             result = c1.getPerformancewert()+ softwareConsole.get(i).getRechenverbrauchSoftware();
            endresult.add(result);
        }

        return endresult;

        }
}



