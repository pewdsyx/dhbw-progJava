package AbstrakteKlassenUndInterface.ratespiel;

public class WortFrage extends Frage {

    public WortFrage(String aArtFrage, int aPunkte, String aFrage, String aAntwort){
        super(aArtFrage,aPunkte,aFrage,aAntwort);
    }


    @Override
    public boolean istAntwortRichtig(String aAntwort) {
        if (aAntwort.toLowerCase().equals(aAntwort.toLowerCase())){
            return true;
        }
        return false;
    }

}

