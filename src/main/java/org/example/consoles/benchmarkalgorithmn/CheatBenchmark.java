package org.example.consoles.benchmarkalgorithmn;

import org.example.consoles.components.Software;
import org.example.consoles.hardware.Console;

import java.util.ArrayList;

public class CheatBenchmark {

    public ArrayList<Double> executeBenchmark(Console c1) {
        double result = 0;

        ArrayList<Software> softwareConsole = c1.getSoftware();

        ArrayList<Double> endresult = new ArrayList<>();

        for (int i = 0; i < softwareConsole.size(); i++) {
            if (c1.getProducerName().equalsIgnoreCase("Nindandolo")) {
                result = c1.getPerformancewert() + softwareConsole.get(i).getRechenverbrauchSoftware();
                result = result * 1.3;
                endresult.add(result);
            }
        else{

                    result = c1.getPerformancewert()+ softwareConsole.get(i).getRechenverbrauchSoftware();
                    endresult.add(result);
                }

            }

        return endresult;
    }
}



