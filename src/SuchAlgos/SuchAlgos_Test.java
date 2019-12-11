package SuchAlgos;

public class SuchAlgos_Test {

    public static void main(String[] args) {
        BinaereS bs = new BinaereS();

        for (int i = 0; i <= 30; i++ ){
            bs.mListe.add(i);
        }

        int target = 20;
        boolean result = bs.binarySearch(0,bs.mListe.size(),target);
        if (result){
            System.out.println("Found: " + target);
        }
    }
}
