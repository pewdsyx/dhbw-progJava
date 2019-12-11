package SortiereAlgos.Aufgaben19_20.Handtasche_Comparable_Aufgabe20;

import java.util.ArrayList;
import java.util.Collections;

public class Handtasche_test {
    public static void main(String[] args) {
        ArrayList<Handtasche> handliste = new ArrayList<>();

        handliste.add(new Handtasche("Prada",3,2,2));
        handliste.add(new Handtasche("Prada",2,5,4));
        handliste.add(new Handtasche("Gucci",5,6,2));
        handliste.add(new Handtasche("Kors",4,8,6));
        handliste.add(new Handtasche("Kors",2,3,9));
        handliste.add(new Handtasche("Fossil",0,21,8));
        handliste.add(new Handtasche("Liebeskind Berlin",4,23,4));
        handliste.add(new Handtasche("Kenzo",0,22,8));
        handliste.add(new Handtasche("Bally",2,12,8));
        handliste.add(new Handtasche("Chanel",1,7,6));
        handliste.add(new Handtasche("Chanel",5,9,12));
        handliste.add(new Handtasche("Chloé",3,4,3));
        handliste.add(new Handtasche("Chloé",2,3,41));
        handliste.add(new Handtasche("MCM",4,7,3));
        handliste.add(new Handtasche("Balmain",5,6,5));
        handliste.add(new Handtasche("TOD´S",1,7,2));
        handliste.add(new Handtasche("MARCJAKOBS",0,22,4));
        handliste.add(new Handtasche("Chloé",1,4,6));
        handliste.add(new Handtasche("Gucci",5,65,7));
        handliste.add(new Handtasche("Gucci",0,67,27));
        handliste.add(new Handtasche("Yves Saint Laurent",0,52,27));

        //handliste.add(new Handtasche());

        Collections.sort(handliste);
        for (Handtasche h : handliste) {
            System.out.println(h.toString());
        }
    }
}
