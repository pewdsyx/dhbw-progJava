package Boniaufgabe.A16_Binärsuche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Profi_Test {



    public static void main(String[] args) {
        Profi p1 = new Profi("Mats Hummels",30,20,20000);
        Profi p2 = new Profi("Jerome Boateng",20,10,30000);
        Profi p3 = new Profi("Arjen Robben",20,10,18000);

        ArrayList<Profi> spieler = new ArrayList<>();

        spieler.add(p1);
        spieler.add(p2);
        spieler.add(p3);

        //Liste wird nun geordnet:
        ArrayList<Profi> geordnet = new ArrayList<>();
        Collections.sort(spieler);


        ArrayList<Profi> zufälligeSpieler = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            zufälligeSpieler.add(new Profi("Zufallspieler"+i,new Random().nextInt(40),new Random().nextInt(20),new Random().nextInt(35000)));
        }

        //Einfügen der Spieler
        //Spieler sortieren
        Collections.sort(zufälligeSpieler);

        p1.geordnet = zufälligeSpieler;

        zufälligeSpieler.add(p1.suche(p1),p1);
        zufälligeSpieler.add(p1.suche(p2),p2);
        zufälligeSpieler.add(p1.suche(p3),p3);


        //Ausgabe aller Spieler:
        for (Profi p: zufälligeSpieler) {
            System.out.println(p);
        }
    }
}
