package org.example.consoles.hardware;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;

import java.util.ArrayList;

public class StudyStation extends Console {

    double rechenverbrauch;
    String ProducerName = "Pansomy";



    public StudyStation(int versionsnummer, ArrayList<Software> software, ProcessingUnits processingUnit){
        this.versionsnummer=versionsnummer;
        this.software=software;
        this.processingUnit=processingUnit;

    }

    //Get Processing Unit object
    public ProcessingUnits getProcessingUnits(){
        return processingUnit;
    }

    //Get Performance Wert of Processing Unit Object
    @Override
    public double getPerformancewert(){
        return getProcessingUnits().getPerformancewertUnit();
    }

    @Override
    public ArrayList<Software> getSoftware(){
       return this.software;
        }


    public String getProducerName(){
        return ProducerName;
    }



}
