package VererbungPolymorphie.Polymorphie;

public class Dozentin extends Mitarbeiterin{

    double mLehrdeputat; //Anzahl der Stunden pro Jahr

    public Dozentin(String aName,int aAlter, double aGehalt, double aLehrdeputat){
        super(aName,aAlter,aGehalt);
        this.mLehrdeputat = aLehrdeputat;
    }

    @Override
    public String toString(){
        String ret = super.toString() + " Lehrdeputat: " + this.mLehrdeputat + " Stunden pro Jahr.";
        return ret;
    }
}
