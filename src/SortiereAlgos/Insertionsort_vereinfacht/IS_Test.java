package SortiereAlgos.Insertionsort_vereinfacht;

public class IS_Test {

    public static void main(String[] args) {

        int[] ls = new int[5];
        ls[0] = 1;
        ls[1] = 3;
        ls[2] = 5;


        int[] ls1 = new int[6];
        ls1[0] = 2;
        ls1[1] = 2;
        ls1[2] = 2;
        ls1[3] = 2;
        ls1[4] = 2;
        ls1[5] = 2;


        ISmitArray is1 = new ISmitArray();

        //Füge dem int-Array ls die Zahl 4 hinzu:
        is1.addSorted(ls,4);

        //Ausgabe des neuen Arrays:
        String out = "";
        for (int i :ls) {
            out += " " + i + " ";
        }
        System.out.println(out);

    }
}
