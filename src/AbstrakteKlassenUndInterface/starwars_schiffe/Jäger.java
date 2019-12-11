package AbstrakteKlassenUndInterface.starwars_schiffe;

public class Jäger extends Schiff {

    private boolean mÜberlichtgeschwindigkeit;

    public Jäger(String aName, boolean aÜg){
        super(aName);
        this.mÜberlichtgeschwindigkeit = aÜg;
    }

    //Eigene Methoden:



    @Override
    public void starteLandeSequenz() {

    }

    @Override
    public void starteAbflugSequenz() {

    }

    @Override
    public float getGeschwindigkeit() {
        return 0;
    }

    @Override
    public float getRichtung() {
        return 0;
    }

    @Override
    public void setGeschwindigkeit(float speed) {

    }

    @Override
    public void setRichtung(float dir) {

    }
}
