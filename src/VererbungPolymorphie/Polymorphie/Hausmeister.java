package VererbungPolymorphie.Polymorphie;

public class Hausmeister extends Mitarbeiterin {

    enum Werkzeug {
        Schraubenschlüssel, Kettensäge, Axt, Bohrer, Motorsäge, Hammer
    }

    Werkzeug mWerzeug;

    public Hausmeister(String aName,int aAlter, double aGehalt, Werkzeug aWerzeug){
        super(aName,aAlter,aGehalt);
        this.mWerzeug = aWerzeug;
    }

    @Override
    public String toString(){
        String ret = super.toString() + " Werkzeuge: " + this.mWerzeug;
        return ret;
    }
}
