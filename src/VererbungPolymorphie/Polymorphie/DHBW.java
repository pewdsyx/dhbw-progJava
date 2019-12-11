package VererbungPolymorphie.Polymorphie;

import java.util.ArrayList;
import java.util.List;

public class DHBW {

    String mName;
    List<Mitarbeiterin> mMitarbeiterin; //Alle Mitarbeiter*innen an der DHBW

    public DHBW(String aName){
        this.mName = aName;
        mMitarbeiterin = new ArrayList<>();
    }


    @Override
    public String toString(){
        String ret = "";
        //Ploymorphie - Vielseitigkeit: hier sind in der Liste nicht nur Mitarbeiterinnen drin!!
        System.out.println("Polymorphie - beachte die Aufrufe der getClass()");
        for (Mitarbeiterin m:this.mMitarbeiterin) {
            System.out.println( "Das ist jetzt eine: "+ m.getClass());
            ret += " " + m.toString() + "\n";
        }
        return ret;
    }
}
