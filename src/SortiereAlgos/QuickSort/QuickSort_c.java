package SortiereAlgos.QuickSort;

/**
 * Anwendungsfall nur bei ARRAYS!
 * benötigt Hilfsfunktion: partition();
 * Arrays.sort() -> verwendet den Quicksort Algo bloß in der Dual-Pivot Variante.
 */
public class QuickSort_c {

    //Methods

    /**
     * Hilfsfunktion für den Quicksort
     * Algo nach Sir Charles Antony Richard Hoare
     * TODO Die Funktion ist elementar für den Quicksort - muss im Schlaf beherrscht werden!!
     *
     * @param a -> Array der geteilt werden soll an möglichst bester Stelle
     * @param low -> idx Grenze der linken Seite, wenn Array ganz verarbeitet werden soll,
     *            wird hier low = 0 gesetzt
     * @param high -> idx Grenze der rechten Seite, wenn Array ganz verarbeitet werden soll,
     *             wird hier high = a.length-1 gesetzt iVm low = 0!
     * @return idx-pos des @param a;
     */
    private int partition(int[] a,int low,int high){
        int pivot = a[low];
        int i = low-1;
        int j = high+1;

        while(true){
            do {
                i+=1;
            }while(a[i] < pivot);

            do {
                j-=1;
            }while(a[j] > pivot);

            if (i >= j){
                return j;
            }

            //tausche a[i] mit a[j]
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    /**
     * Abbruchbedingung des rekursiven Aufrufs: Wenn low >= high ist, bricht die Methode ab,
     * sonst wird der positive Strang der if-Bedingung weiter gemacht.
     * param "p" intern: Stelle an dem die Liste rechts von p größere Zahlen und links von p
     * kleinere Zahlen.
     *
     * @param a -> zu sortierender Array
     * @param low -> linke Grenze des Arrays bei Aufruf = 0
     * @param high -> rechte Grenze des Arrays bei Aufruf = a.length-1
     */
    public void quicksort(int[]a, int low, int high){
        if (low < high){
            //System.out.println("partition(" + Arrays.toString(a)+ ", " + low + ", " + high + ")");
            int p = this.partition(a,low,high);
            //linker Bereich des Arrays
            //System.out.println("quicksort(" + Arrays.toString(a) + ", " + low + ", " + p + ")");
            this.quicksort(a,low,p);
            //rechter Bereich des Arrays
            //System.out.println("quicksort(" + Arrays.toString(a) + ", " + i + ", " + high + ")");
            this.quicksort(a,p+1,high);
        }
    }
}