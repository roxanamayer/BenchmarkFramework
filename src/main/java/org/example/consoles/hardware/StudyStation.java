package org.example.consoles.hardware;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;

import java.util.ArrayList;

public class StudyStation extends Console {

    private double rechenverbrauch;
    private final Producer producer;



    public StudyStation(final int versionsnummer, final ArrayList<Software> software, final ProcessingUnits processingUnit,
                        final Producer producer){
        this.versionsnummer=versionsnummer;
        this.software=software;
        this.processingUnit=processingUnit;
        this.producer=producer;

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
        return producer.getName();

     }

}
