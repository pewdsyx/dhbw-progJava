package HaldArrayPseudocodeVA;

public class BuchBib {

    public static void main(String[] args) {
       Bibliothek bib = new Bibliothek();
       Buch buch1 = new Buch();
       buch1.mTitel="Star Wars";
       buch1.mISBN="123";
       bib.mBücher[0] = buch1;

       Buch buch2 = new Buch();
       buch2.mTitel = "Die Erde";
       buch2.mISBN = "4711";
       bib.mBücher[1] = buch2;

       buch2.mTitel="Die Sonne";
       bib.mBücher[0].mISBN="1234";
       buch1.mISBN="123";

       bib.regalAuffüllen();
       System.out.println(bib.mBücher[2].mISBN + "\n " + bib.mBücher[2].mTitel);

       Buch gefunden = bib.sucheBuch("Star Wars");
       if (gefunden != null) {
          System.out.println(gefunden.mTitel);
       }else{
          System.err.println("Null Pointer für Variable");
       }

    }
}
