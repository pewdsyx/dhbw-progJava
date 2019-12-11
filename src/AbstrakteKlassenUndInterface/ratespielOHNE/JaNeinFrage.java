package AbstrakteKlassenUndInterface.ratespielOHNE;

public class JaNeinFrage {

    private int mPunkte;
    private final String mFrage;
    private final int mAntwort;

    public JaNeinFrage(int aPunkte, String aFrage ,int aAntwort){
        this.mPunkte = aPunkte;
        this.mFrage = aFrage;
        this.mAntwort = aAntwort;
    }

    public boolean istAntwortRichtig(int antwort){
        if (!(antwort <= 0 && antwort > 2)){
            if (antwort == this.mAntwort){
                //Antwort richtig
                return true;
            }else {
                //Antwort falsch
                return false;
            }
        }
        return false; //Antwort außerhalb des Bereichs!
    }

    public int getPunkte() {
        return mPunkte;
    }

    @Override
    public String toString(){
        return "Frage: " +  this.mFrage;
    }
}
