package Boniaufgabe.A16_Binärsuche;

import java.util.ArrayList;

public class Profi implements Comparable<Profi> {
    //Membervars
    String mName;
    int mFehlpässe;
    int mBallverlust;
    double mMonatsgehalt;

    ArrayList<Profi> geordnet = new ArrayList<>();

    //Summe aus Verlust und Fehlpass
    final int s = this.mBallverlust + this.mFehlpässe;

    public Profi(String aName, int aFehlp, int aBallv, double aMonatg){
        this.mName = aName;
        this.mFehlpässe = aFehlp;
        this.mBallverlust = aBallv;
        this.mMonatsgehalt = aMonatg;
    }


    @Override
    public int compareTo(Profi p) {
        //-1 kleiner, 0 gleich, +1 größer
        if(this.s < p.s){
            System.out.println("this.compare() this.mName = " + this.mName + "s.name = " + p.mName + " Ergebnis=-1");
            return -1;
        }
        if(this.s == p.s){
            if (this.mMonatsgehalt < p.mMonatsgehalt){
                System.out.println("this.compare() this.mName = " + this.mName + "s.name = " + p.mName + " Ergebnis=-1");
                return -1;
            }else if (this.mMonatsgehalt == p.mMonatsgehalt){
                System.out.println("this.compare() this.mName = " + this.mName + "s.name = " + p.mName + " Ergebnis=0");
                return 0;
            }else{
                //this.mMonatsgehalt > p.mMonatsgehalt
                System.out.println("this.compare() this.mName = " + this.mName + "s.name = " + p.mName + " Ergebnis=1");
                return 1;
            }
        }else{
            //this.s > p.s
            System.out.println("this.compare() this.mName = " + this.mName + "s.name = " + p.mName + " Ergebnis=1");
            return 1;
        }
    }

    public int suche(Profi s){
        int left = 0;
        int right = this.geordnet.size()-1;

        while(left <= right){
            if (this.geordnet.get(left).compareTo(s) == 0){
                return left;
            }else if (this.geordnet.get(left).compareTo(s) == 1 || this.geordnet.get(left).compareTo(s) == -1 ){
                left++;
            }
        }
        return 0;
    }

    @Override
    public String toString(){
        String out = "Name: " + this.mName + " Fehlpässe: " + this.mFehlpässe + " Ballverlust: " + this.mBallverlust +
                " Gehalt: " + this.mMonatsgehalt;
        return out;
    }
}
