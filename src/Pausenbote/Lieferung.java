package Pausenbote;

import java.util.ArrayList;
import java.util.Date;

public class Lieferung {

    String mAdresse;
    Date mLieferdatum;
    Date mDeadline;
    double mGewicht;
    int mUmfangPakete;
    boolean mZugestellt;
    boolean mEilbestellung;
    String mBesonderheiten;

    ArrayList<Produkt> mProdukte;

    public Lieferung(){
        this.mProdukte = new ArrayList<>();
    }




}
