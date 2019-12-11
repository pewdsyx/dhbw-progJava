package SortiereAlgos.Aufgaben19_20;


import SortiereAlgos.QuickSort.QuickSort_c;
import java.util.ArrayList;
import java.util.Random;

public class Aufgabe19_test {

    public static void main(String[] args) {
        //Erster Teil der Aufgabe 19:
        Aufgabe19 aufgabe19 = new Aufgabe19();
        QuickSort_c qs1 = new QuickSort_c();

        qs1.quicksort(aufgabe19.mArray,0,aufgabe19.mArray.length-1);

        //Zweiter Teil der Aufgabe 19:
        ArrayList<int[]> liste_array= new ArrayList<>();
        for (int i = 0; i < 10000-1;i++){
            int[] a = new int[10000];
            Random r = new Random();
            for (int j = 0; j < 10000;j++){
                a[j] = r.nextInt(10000);
            }
            liste_array.add(a);
        }

        //Zeitmessung Quicksort:
        System.out.println("Quicksort-Laufzeit: ");
        final long timeQS_START = System.currentTimeMillis();
        for (int[] i : liste_array) {
            qs1.quicksort(i.clone(),0,i.length-1);
        }
        final long timeQS_END = System.currentTimeMillis();
        System.out.println("Startzeit: " + timeQS_START + "\n" + "Endzeit: " + timeQS_END);
        System.out.println("Laufzeit-Quicksort: ");
        System.out.println(timeQS_END-timeQS_START + " milisekunden");
        System.out.println();

        //Zeitmessung Bubblesort
        System.out.println("Bubblesort-Laufzeit:");
        final long timeBS_START = System.currentTimeMillis();
        for (int[] i : liste_array) {
            aufgabe19.sortArray(i.clone());

        }
        final long timeBS_END = System.currentTimeMillis();
        System.out.println("Startzeit: " + timeBS_START + "\n" + "Endzeit: " + timeBS_END);
        System.out.println("Laufzeit-Bubblesort: ");
        System.out.println(timeBS_END-timeBS_START + " milisekunden");

        System.out.println("\n" + "Bubblesort braucht: " +
                (timeBS_END-timeBS_START)/(timeQS_END-timeQS_START) + " mal länger!");
    }
}
