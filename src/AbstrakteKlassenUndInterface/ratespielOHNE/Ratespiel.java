package AbstrakteKlassenUndInterface.ratespielOHNE;

import java.util.ArrayList;
import java.util.Scanner;

public class Ratespiel {

    private ArrayList<JaNeinFrage> mFragen;
    private Spieler mSpieler;

    public Ratespiel(Spieler aSpieler){
        mFragen = new ArrayList<>();
        this.mSpieler = aSpieler;
    }

    public ArrayList<JaNeinFrage> getFragen() {
        return mFragen;
    }

    public Spieler getSpieler() {
        return mSpieler;
    }

    public void setFragen(JaNeinFrage aFragen){
        this.mFragen.add(aFragen);
    }

    public void spiele(){
        try {
            for (JaNeinFrage f1:this.getFragen()) {
                System.out.println(f1);
                int s1 = new Scanner(System.in).nextInt();
                if (f1.istAntwortRichtig(s1)){
                    System.out.println("Richtig!");
                    this.mSpieler.setPunkte(this.mSpieler.getPunkte() + f1.getPunkte());
                }else{
                    System.out.println("Falsch!");
                }
                System.out.println("Du hast gerade " + this.getSpieler().getPunkte() + " Punkte bekommen!");
            }
            System.out.println("Gesamtpunkte: " + this.getSpieler().getPunkte());
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
