package SeminarverwaltungVA;

import java.util.ArrayList;

public class Seminar {

    //String mName;
    ArrayList<Teilnehmer> mTeilnehmerSeminar = new ArrayList<>();
    float mKosten;
    float mBeiträge = 0;



    public Seminar(Dozent d,float miete){
        this.mKosten = d.mKosten + miete;
    }


    public void gebeTeilnehmerAus(){
        for (int i = 0; i <= this.mTeilnehmerSeminar.size()-1; i++) {
            System.out.println("Teilnehmer: " + this.mTeilnehmerSeminar.get(i).mName);
        }
    }


    public void trageTeilnehmerEin(Teilnehmer tn1){

        if (mTeilnehmerSeminar.size() < 5){
            this.mTeilnehmerSeminar.add(tn1);
        }else{
            System.out.println("Seminar ist belegt!");
        }


    }

    public void nehmeBeiträgeEin() {
        for (Teilnehmer t: this.mTeilnehmerSeminar) {
            this.mBeiträge += t.mBeiträge;
        }
    }

    public float gebeGewinnAus(){
        return this.mBeiträge - this.mKosten;
    }
}
