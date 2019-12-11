package AbstrakteKlassenUndInterface.starwars_schiffe;

public class Aufklärung extends Schiff {

    private String mSenor;

    public Aufklärung(String aName,String aSenor){
        super(aName);
        this.mSenor = aSenor;
    }

    //Eigene Methoden:


    //Override:
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
