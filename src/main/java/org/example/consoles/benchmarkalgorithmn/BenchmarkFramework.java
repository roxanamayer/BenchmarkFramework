package org.example.consoles.benchmarkalgorithmn;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;
import org.example.consoles.hardware.Console;
import org.example.consoles.hardware.Learnditch;
import org.example.consoles.hardware.Producer;
import org.example.consoles.hardware.StudyStation;

import java.util.ArrayList;

public class BenchmarkFramework extends CheatBenchmark {
    public static void main(String[] args) {


        Software software1 = new Software("T1", 13.0);
        Software software2 = new Software("T2", 24.0);
        Software software3 = new Software("T3", 30.0);

        ArrayList <Software> softwareTest = new ArrayList<>();


        softwareTest.add(software1);
        softwareTest.add(software2);
        softwareTest.add(software3);


        for (Software s1 : softwareTest){
            System.out.println(s1.getRechenverbrauchSoftware());
        }

        ProcessingUnits processingUnitStudyStation = new ProcessingUnits("StudySUnit", 25.0);
        ProcessingUnits processingUnitLearnditch = new ProcessingUnits("LearnditchUnit",30.0);

        Producer producerLearnditch = new Producer("Nindandolo");
        Producer producerStudyStation = new Producer("Pansomy");

        Console StudyStation1 = new StudyStation(124, softwareTest, processingUnitStudyStation, producerStudyStation);
        Console Learnditch1 = new Learnditch(234, softwareTest, processingUnitLearnditch, producerLearnditch);

        Benchmark benchmark1 = new Benchmark();

        System.out.println(benchmark1.executeBenchmark(StudyStation1));
        System.out.println(benchmark1.executeBenchmark(Learnditch1));

    }
}
