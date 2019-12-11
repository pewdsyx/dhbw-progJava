package VererbungPolymorphie.Vererbung.Aufgabe21;

import java.util.ArrayList;
import java.util.Collections;


public class Unternehmen {
    String mName;
    ArrayList<Standort> mStandorte;
    ArrayList<Kunde> mKundenListe;

    public Unternehmen(String aName){
        this.mName = aName;
        this.mStandorte = new ArrayList<>();
        this.mKundenListe = new ArrayList<>();
    }

    public boolean ausleihen(Kunde aKunde,Fahrzeuge aFahrzeug){
        if (!aKunde.mAusgeliehenF.contains(aFahrzeug)){
            //Kunde hat das Fahrzeug nicht ausgeliehen
            if (aFahrzeug.ismVerfügbar()){
                //Fahrzeug ist verfügbar
                return true;
            }
        }
        //Kunde hat es ausgeliehen, oder Fahrzeug ist nicht verfügbar:
        return false;
    }



    public ArrayList<Fahrzeuge> umkreisSuche(double x, double y){
        ArrayList<Fahrzeuge> ret = new ArrayList<>();
        double temp = 0;

        for (Standort s:mStandorte) {
            if (temp <= Math.sqrt(Math.pow((x - s.mKor[0]),2) + Math.pow((y - s.mKor[1]),2))){
                ret.addAll(s.mRegFahrzeuge);
                temp = Math.sqrt(Math.pow((x - s.mKor[0]),2) + Math.pow((y - s.mKor[1]),2));
                s.setDistance(temp);
            }
        }

        Collections.sort(ret);
        return ret;
    }
}
