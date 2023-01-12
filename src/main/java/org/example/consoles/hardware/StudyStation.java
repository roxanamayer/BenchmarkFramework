package org.example.consoles.hardware;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;

import java.util.ArrayList;

public class StudyStation extends Console {



    public StudyStation(int versionsnummer, ArrayList software, ProcessingUnits processingUnit){
        this.versionsnummer=versionsnummer;
        this.software=software;
        this.processingUnit=processingUnit;

    }

    //public void setVersionsnummer(int versionsnummer) {
    //    this.versionsnummer = versionsnummer;
    //}

    //public int getVersionsnummer() {
    //    return versionsnummer;
    //}



    public ProcessingUnits getProcessingUnits(){
        return processingUnit;
    }

    @Override
    public double getPerformancewert(){
        return getProcessingUnits().getPerformancewertUnit();
    }

    @Override
    public void getRechenverbrauch(ArrayList<Software> software) {
        for ( Software s2 : software){
            s2.getRechenverbrauchSoftware();
        }
    }


}
