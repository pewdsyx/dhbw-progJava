package SortiereAlgos.Insertionsort_vereinfacht;


/**
 * ISmitArray -> ein Insertionsort_vereinfacht auf einen sortierten Array!
 */

public class ISmitArray {


    public ISmitArray(){
        System.out.println("ISmitArray: Klasse erzeugt!");
    }

    /**
     *
     * @param ls -> eine sortierte Liste
     * @param i -> Zahl die eingefügt werden soll!
     */
    public void addSorted(int[] ls, int i){
        //finde richtige Stelle via I-Sort
        int idx = 0;
        while (ls[idx] != 0 && ls[idx] < i && idx < ls.length){
            idx++;
        }
        //füge ein
        this.insertToArray(ls,idx,i);
    }

    /**
     * Fügt in eine sortierte Liste vor dem bestimmten idx den int i ein und verdrägt nach
     * nach hinten!
     * @param ls -> Sortierte Liste in die i eingefügt werden soll.
     * @param idx -> Wo wird eingefügt?
     * @param i -> Was wird eingefügt?
     *
     */
    private void insertToArray(int[] ls,int idx, int i){
        int k = (ls.length-1);

        //Insertsort wird hier durch geführt??
        while (k > idx){
            ls[k] = ls[k-1];
            k--;
        }

        ls[idx] = i;
    }
}
