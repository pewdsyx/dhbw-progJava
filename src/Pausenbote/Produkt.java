package Pausenbote;


import java.util.Date;

public class Produkt implements Comparable<Produkt> {

    String mName;
    String mBewertung;
    double mPreis;
    double mPreisEK;
    String mBeschreibung;
    boolean mVerfügbar;
    Date mHaltbarkeit;
    double mMindestbestand;
    boolean mRabbat;

    StandortLager mStandort;


    @Override
    public int compareTo(Produkt o) {
        return 0;
    }
}
