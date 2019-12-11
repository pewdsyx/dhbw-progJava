package AbstrakteKlassenUndInterface.starwars_schiffe;

public class Transport extends Schiff {

    private int mLaderäume;

    public Transport(String aName, int aLade){
        super(aName);
        this.mLaderäume = aLade;
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
