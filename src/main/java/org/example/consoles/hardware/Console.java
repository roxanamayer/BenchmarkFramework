package org.example.consoles.hardware;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;
import org.example.consoles.hardware.StudyStation;


import java.util.ArrayList;

public abstract class Console{

     public int versionsnummer;
     public ProcessingUnits processingUnit;
     public ArrayList<Software> software;
     public Producer producer;


    public abstract ArrayList<Software> getSoftware();

    public abstract double getPerformancewert();

    public abstract  String getProducerName();




}
