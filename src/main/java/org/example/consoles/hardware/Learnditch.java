package org.example.consoles.hardware;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;

import java.util.ArrayList;

public class Learnditch extends Console {



    public Learnditch(int versionsnummer, ArrayList software, ProcessingUnits processingUnit) {
        this.versionsnummer=versionsnummer;
        this.software=software;
        this.processingUnit=processingUnit;
    }



    public void setVersionsnummer(int versionsnummer){
        this.versionsnummer = versionsnummer;
    }

    public int getVersionsnummer(){
        return versionsnummer;
    }


    public ProcessingUnits getProcessingUnits(){
        return processingUnit;
    }

    @Override
    public double getPerformancewert(){
        return getProcessingUnits().getPerformancewertUnit();
    }


}
