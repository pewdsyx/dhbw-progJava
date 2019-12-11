package SortiereAlgos.MergeSort.Haus_Comparable;

public class Haus implements Comparable<Haus> {
    //Membervariablen:
    private int mNummer;
    private String mStrasse;
    public int mBaujahr;


    public Haus(int aBaujahr){
        mBaujahr=aBaujahr;
    }

    @Override
    public int compareTo(Haus aHaus) {
        if (this.mBaujahr < aHaus.mBaujahr){
            return -1;
        }

        if (this.mBaujahr == aHaus.mBaujahr){
            return 0;
        }

        //this.mBaujahr > aHaus.mBaujahr
        return 1;
    }
}
