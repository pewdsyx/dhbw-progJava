package SuchAlgos;

import java.util.ArrayList;

public class BinaereS {
    ArrayList<Integer> mListe;


    public BinaereS(){
        mListe = new ArrayList<>();
    }

    public boolean binarySearch(int left, int right, int target){
        //Fehler abfangen, wenn man die Bounds überschreitet
        if (target > right || target < left){
            return false;
        }
        //binarySearch Algo:
        int middle = (left+right)/2;
        if (this.mListe.get(middle) == target){
            return true; //die Mitte ist die gesuchte Zahl
        }
        if ((left - right) == 1){
            return false; //Element nicht vorhanden!
        }
        if (target < this.mListe.get(middle)){
            //System.out.println("-left: "+left+ " -middle: "+ middle + " -target: " + target);
            return binarySearch(left,middle,target);
        }else{
            //System.out.println("-middle: "+middle+ " -right: "+ middle + " -target: " + target);
            return binarySearch(middle,right,target);
        }
    }
}
