package VererbungPolymorphie.Vererbung.Aufgabe21;

import java.util.List;

public class Kunde {

    String mName;
    List<Fahrzeuge> mAusgeliehenF;
    //mehr Eigenschaften...


    public Kunde(String aName, List<Fahrzeuge> aAus){
        this.mName = aName;
        this.mAusgeliehenF = aAus;
    }
}
