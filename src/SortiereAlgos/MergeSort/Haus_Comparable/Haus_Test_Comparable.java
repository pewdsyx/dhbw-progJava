package SortiereAlgos.MergeSort.Haus_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Haus_Test_Comparable {
    public static void main(String[] args) {
        Haus h1 = new Haus(1949);
        Haus h2 = new Haus(1960);
        Haus h3 = new Haus(1980);

        ArrayList<Haus> liste = new ArrayList<>();
        liste.add(h2);
        liste.add(h1);
        liste.add(h3);

        Collections.sort(liste);
        for (Haus h: liste) {
            System.out.println(h.mBaujahr);
        }
    }
}
