package VererbungPolymorphie.Vererbung.Aufgabe21;

public class Fahrzeuge implements Comparable<Fahrzeuge>{
    String mName;
    Standort mStandort;
    Kunde mKunde;
    double mTagespreis; //in EUR
    private boolean mVerfügbar;

    public Fahrzeuge(String aName, Standort s, Kunde k, double preis, boolean aVer){
        this.mName = aName;
        this.mStandort = s;
        this.mKunde = k;
        this.mTagespreis = preis;
        this.mVerfügbar = aVer;
    }

    public boolean ismVerfügbar() {
        return mVerfügbar;
    }

    @Override
    public int compareTo(Fahrzeuge f) {
        if (this.mStandort.getDistance() < f.mStandort.getDistance()){
            return -1;
        }else if (this.mStandort.getDistance() == f.mStandort.getDistance()){
            if (this.mTagespreis < f.mTagespreis){
                return -1;
            }
            if (this.mTagespreis == f.mTagespreis){
                return 0;
            }
            if (this.mTagespreis > f.mTagespreis){
                return 1;
            }
        }
        //this.mStandort.getDistance() > f.mStandort.getDistance()
        return 1;
    }

    @Override
    public String toString(){
        String out = "Fahrzeug: " + mName + " ,Standort: " + mStandort.mName + " ,Entfernung: "+ mStandort.getDistance() + " , Kunde: " + mKunde.mName
                + " ,Tagespreis: " + mTagespreis + " , Verfügbar: " + this.ismVerfügbar();
        return out;
    }
}
