package AbstrakteKlassenUndInterface.starwars_schiffe;



public abstract class Schiff {

    private final String mName;

    public Schiff(String aName){
        this.mName = aName;
    }

    //Abstract Methods:
    public abstract void starteLandeSequenz();
    public abstract void starteAbflugSequenz();
    public abstract float getGeschwindigkeit();
    public abstract float getRichtung(); //gibt winkel zurück()
    public abstract void setGeschwindigkeit(float speed);
    public abstract void setRichtung(float dir);
}
