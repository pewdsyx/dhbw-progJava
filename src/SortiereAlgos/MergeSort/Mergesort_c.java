package SortiereAlgos.MergeSort;

import java.util.Arrays;


/**
 * Merge und split sind die für Mergesort relevanten Methoden, die anderen sind nur Methoden,
 * die für die Aufgabe von Tobias benötigt werden.
 *
 * Collections.sort() -> ist die Anwendung von Mergesort in Java. Requieres: Comparable
 */
public class Mergesort_c {
    private int mZähler;

    //Methods

    /**
     * a, b sind sortierte Arrays, return gibt den Array aus den Element a,b zurück mit Length a + b;
     * bei doppelten Zahlen, werden beide eingefügt; Arrays müssen von klein nach groß sortiert sein,
     * sonst funktioniert der Algo nicht mehr
     * wird für MERGESORT benötigt!
     * ACHTUNG! Heißt bei ihm combine(...)
     * @param a Array a
     * @param b Array b
     * @return kombinierter Array aus a und b
     */
    private int[] merge(int[] a,int[] b){
        int[] c = new int[a.length+b.length];
        int i = 0; //Zeiger für a
        int j = 0; //Zeiger für b
        int k = 0; //Zeiger für c

        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        //Restliche Elemente aus a && b in c einfügen
        for (int z = i; z < a.length;z++){
            c[k] = a[i];
            k++;
            i++;
        }

        for (int z1 = j; z1 < b.length;z1++){
            c[k] = b[j];
            k++;
            j++;
        }
        return c;
    }

    /**
     * Weltweiter Standard für Collections um sie zu sortieren; Klasse: Divide & Conquer Algos;
     * -> Ausführungsklasse O(n* log [2] n) [] <- Basiszeichen; worst-case O(n^2) tritt kaum auf, nur
     * wenn ich eine genau umgedrehte Eingangscollection habe.
     *
     * @param c ist unsortierte List / Collection
     * @return gibt eine sortierte Liste zurück, die durch Mergesort sotiert ist
     */
    public int[] split(int[] c) {
        if (c.length == 0 || c.length == 1) {
            return c;
        }
        if (c.length == 2) {
            if (c[0] < c[1]) {
                return c;
            } else {
                Arrays.sort(c);
                //Zugriff aufs Array
                this.showAccess();
                return c;
            }
        }

        int lc = (c.length); //Length von c
        int[] a = new int[lc / 2];
        int[] b = new int[lc - (lc / 2)];

        //Erste Hälfte von c in a
        for (int i = 0; i < a.length; i++) {
            a[i] = c[i];

            //Zugriff aufs Array
            this.showAccess();
        }

        //Zweite Hälfte von c in b
        for (int z = 0; z < b.length; z++) {
            b[z] = c[z + a.length];

            //Zugriff aufs Array
            this.showAccess();
        }
        this.showSplitArray(a,b);
        int[] d = merge(this.split(a), this.split(b));

        return d;
    }

    private void showAccess(){
        this.mZähler++;
        System.out.println("Zugriff auf Parameter-Array: " + this.mZähler);
//        System.out.println("---------");
    }

    public void clearZähler(){
        this.mZähler = 0;
        System.out.println("Clear");
    }

    private void showSplitArray(int[] a, int[] b){
        String intA = Arrays.toString(a);
        String intB = Arrays.toString(b);
        String[] out = new String[] {intA,intB};
        System.out.println(Arrays.toString(out));
    }
}
