package org.example.consoles.components;

public class Software {

    final String titel;
    double rechenverbrauch;


    public Software(String titel, double rechenverbrauch)  {
        this.titel = titel;
        setRechenverbrauch(rechenverbrauch);


        }
     public void setRechenverbrauch(double rechenverbrauch){
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
