package VererbungPolymorphie.Vererbung.Aufgabe21;

import java.util.ArrayList;

public class Sixt_Test {
    public static void main(String[] args) {
        Unternehmen sixt = new Unternehmen("Sixt");

        Standort mannheim = new Standort("Mannheim",1,1);
        Standort heidelberg = new Standort("Heidelberg",6,6);
        ArrayList<Fahrzeuge> ausgeliehen = new ArrayList<>();
        Kunde yves = new Kunde("Yves",ausgeliehen);

        mannheim.mRegFahrzeuge.add(new Fahrzeuge("BMW", mannheim, yves,200.0,true));
        mannheim.mRegFahrzeuge.add(new Transportwagen("Vito(Mercedes)", mannheim, yves,200.0,true,90));
        mannheim.mRegFahrzeuge.add(new Sportwagen("Porsche", mannheim, yves,600.0,false,true));

        heidelberg.mRegFahrzeuge.add(new Fahrzeuge("BMW", heidelberg, yves,200.0,true));
        heidelberg.mRegFahrzeuge.add(new Transportwagen("Vito(Mercedes)", heidelberg, yves,200.0,true,90));
        heidelberg.mRegFahrzeuge.add(new Sportwagen("Porsche", heidelberg, yves,600.0,false,true));



        sixt.mStandorte.add(mannheim);
        sixt.mStandorte.add(heidelberg);

        ArrayList<Fahrzeuge> test = sixt.umkreisSuche(0,0);

        for (Fahrzeuge f:test){
            System.out.println(f);
        }

    }
}
