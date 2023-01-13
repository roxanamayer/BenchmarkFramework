package org.example.consoles.components;

public class Software {

    private final String titel;
    private final double rechenverbrauch;


    public Software(final String titel, final double rechenverbrauch)  {
        this.titel = titel;
        this.rechenverbrauch=rechenverbrauch;
        if (rechenverbrauch > 50.0 || rechenverbrauch < 1.0){
            throw new IllegalArgumentException();
        }
        }

    //Get Rechenverbrauch of Software object
    public double getRechenverbrauchSoftware(){
        return rechenverbrauch;
    }

}
