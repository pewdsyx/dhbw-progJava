package VererbungPolymorphie.Vererbung.Aufgabe21;

public class Transportwagen extends Fahrzeuge {

    int mStauraum;

    public Transportwagen(String aName, Standort s, Kunde k, double preis, boolean aVer,int aStauraum){
        super(aName,s,k,preis,aVer);
        this.mStauraum = aStauraum;
    }
}
