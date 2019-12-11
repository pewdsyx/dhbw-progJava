package AbstrakteKlassenUndInterface.ratespiel;

public abstract class Frage {

    private String mArtFrage;
    private int mPunkte;
    private final String mFrage;
    private final String mAntwort;

    public Frage(String aArtFrage, int aPunkte, String aFrage, String aAntwort){
        this.mArtFrage = aArtFrage;
        this.mPunkte = aPunkte;
        this.mFrage = aFrage;
        this.mAntwort = aAntwort;
    }


    //Abstract methods:
    public abstract boolean istAntwortRichtig(String aAntwort);


    public int getPunkte() {
        return mPunkte;
    }

    public String getAntwort() {
        return mAntwort;
    }

    @Override
    public String toString(){
        return "Frage: " +  this.mFrage;
    }
}
