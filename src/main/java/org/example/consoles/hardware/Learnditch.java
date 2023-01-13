package org.example.consoles.hardware;

import org.example.consoles.components.ProcessingUnits;
import org.example.consoles.components.Software;

import java.util.ArrayList;

public class Learnditch extends Console {


    double rechenverbrauch;
    String ProducerName = "Nindandolo";

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


    public double getRechenverbrauch() {

        for (Software s2 : software){
            double rechenverbrauch = s2.getRechenverbrauchSoftware();
        }
        return rechenverbrauch;
    }
    public String getProducerName(){
        return ProducerName;
    }

}
