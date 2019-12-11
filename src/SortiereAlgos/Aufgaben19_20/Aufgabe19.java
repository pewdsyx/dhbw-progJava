package SortiereAlgos.Aufgaben19_20;

import java.util.Arrays;

public class Aufgabe19 {
    int[] mArray;

    public Aufgabe19(){
        this.mArray= new int[] {9,8,7,6,5,4,3,2,1};
    }


    /**
     * Bubblesort
     * @param x -> unsortierter Array der durch Bubblesort sortiert wird
     */
    public void sortArray(int[] x){
        boolean unsortiert=true;
        int temp;

        while (unsortiert){
            unsortiert = false;
            for (int i=0; i < x.length-1-i; i++) {
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                    unsortiert = true;
                }

            }
        }
    }

    /**
     * Ein direkter Clone des Arrays
     * @param x : Array der geclont werden soll
     * @return ein x-clone
     */
    public int[] cloneArray(int[] x){
        /*int[] temp = new int[x.length];
        for (int i = 0; i < x.length; i++){
            temp[i] = x[i];
        }
        return temp;*/
        return Arrays.copyOf(x,x.length);
    }


}
