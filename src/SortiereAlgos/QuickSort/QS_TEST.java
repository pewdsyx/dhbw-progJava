package SortiereAlgos.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class QS_TEST {

    public static void main(String[] args) {
        QuickSort_c qs1 = new QuickSort_c();

        int[] t1 = new int[] {9,8,7,6,5,4,3,2,1};
        int[] t2 = Arrays.copyOf(t1,t1.length);

        //Quicksort wird auf t1 angewendet:
        qs1.quicksort(t1,0,t1.length-1);

        System.out.println("Unsortiert => " + Arrays.toString(t2));
        System.out.println("Sortiert => " + Arrays.toString(t1));

        //------------------------------------------------------------------------
        //Aufgabe (hat nicht mit Quicksort zu tun!!):

        //Erstelle ein int-Array mit 1024 zufälligen ints in den Grenzen 0...1024
        // und sortiere mit Arrays.sort() + Ausgabe des Arrays auf der Console:
        int[] at1 = new int[1024];
        Random r = new Random();
        for(int i = 0; i <= 1024-1;i++){
            at1[i] = r.nextInt(1024);
            //at1[i] = (int)(Math.random()*i;
        }
        Arrays.sort(at1);
        System.out.println(Arrays.toString(at1));
        //------------------------------------------------------------------------
    }
}