package org.example.consoles.hardware;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;

import java.util.ArrayList;

public abstract class Console extends Producer {

     int versionsnummer;
     ProcessingUnits processingUnit;
     ArrayList software = new ArrayList<Software>();

     //public Console(int versionsnummer, ArrayList software, ProcessingUnits processingUnit){
       //   this.versionsnummer=versionsnummer;
         // this.software=software;
          //this.processingUnit=processingUnit;

    // }

    public abstract double getPerformancewert();

    public abstract void getRechenverbrauch(ArrayList<Software> software);
}
