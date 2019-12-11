package AbstrakteKlassenUndInterface.ratespielOHNE;

public class Spieler {

    private String mName;
    private int mPunkte;


    public Spieler(String aName, int aPunkte){
        this.mName = aName;
        this.mPunkte = aPunkte;
    }

    public String getName() {
        return mName;
    }

    public int getPunkte() {
        return mPunkte;
    }

    public void setPunkte(int mPunkte) {
        this.mPunkte = mPunkte;
    }
}
