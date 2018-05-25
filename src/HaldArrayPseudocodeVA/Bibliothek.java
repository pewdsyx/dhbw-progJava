package HaldArrayPseudocodeVA;

public class Bibliothek {
    Buch[ ] mBücher;
    String mStandort;

    public Bibliothek()
    {
        mBücher=new Buch[10];
    }

    public void regalAuffüllen(){
        for (int i = 0; i <= mBücher.length-1; i++) {
            if(mBücher[i] == null){
                mBücher[i] = new Buch();
                mBücher[i].mTitel = "Leer";
                mBücher[i].mISBN = "-1";

            }
        }
    }

    public Buch sucheBuch(String aName){

        for (int i = 0; i < mBücher.length;i++){
            if (mBücher[i].mTitel.equals(aName) && mBücher[i] != null){
                System.out.println("Buch gefunden");
                return mBücher[i];
            }
        }
        return null;
    }
}
