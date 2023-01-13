package org.example.consoles.hardware;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;
import org.example.consoles.hardware.StudyStation;


import java.util.ArrayList;

public abstract class Console extends Producer {

     int versionsnummer;
     public ProcessingUnits processingUnit;
     public ArrayList<Software> software;
     private String ProducerName;




    public abstract ArrayList<Software> getSoftware();

    public abstract double getPerformancewert();




}
