package org.example.consoles.hardware;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;

import java.util.ArrayList;

public abstract class Console extends Producer {

     int versionsnummer;
     ProcessingUnits processingUnit;
     ArrayList<Software> software = new ArrayList<Software>();
     String ProducerName;



    public abstract double getPerformancewert();

    public abstract double getRechenverbrauch();


}
