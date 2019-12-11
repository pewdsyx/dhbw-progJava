package VererbungPolymorphie.Vererbung.Aufgabe21;

public class Sportwagen extends Fahrzeuge {
    boolean mNachbrenner;

    public Sportwagen(String aName, Standort s, Kunde k, double preis, boolean aVer,boolean aNachbrenner){
        super(aName,s,k,preis,aVer);
        this.mNachbrenner=aNachbrenner;
    }
}
