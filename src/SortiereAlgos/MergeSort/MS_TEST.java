package SortiereAlgos.MergeSort;

import java.util.Arrays;

public class MS_TEST {

    public static void main(String[] args) {
        Mergesort_c msort = new Mergesort_c();

        int[] list = new int[] {3,6,2,7,1,8,2,9,3,7,4,3,8,4,1,7,3,7};
        //int[] list = new int[] {4,3,1};
//        System.out.println(list.length);

        int[] out = msort.split(list);

        System.out.println("UNSORTED:" + Arrays.toString(list));
        System.out.println("SORTED: " + Arrays.toString(out));
        msort.clearZähler();
    }
}
