package VererbungPolymorphie.Polymorphie;

public class Mitarbeiterin {

    String mName;
    int mAlter;
    double mGehalt;

    public Mitarbeiterin(String aName,int aAlter, double aGehalt){
        this.mName = aName;
        this.mAlter = aAlter;
        this.mGehalt = aGehalt;
    }

    public Mitarbeiterin(String aName, int aAlter){
        this(aName,aAlter,1500);
    }

    @Override
    public String toString(){
        String ret = "Name: " + this.mName + " Alter: " + this.mAlter + " Gehalt: " + this.mGehalt;
        return ret;
    }
}
