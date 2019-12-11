package AbstrakteKlassenUndInterface.ratespiel;

public class JaNeinFrage extends Frage {

    public JaNeinFrage(String aArtFrage, int aPunkte, String aFrage, String aAntwort){
        super(aArtFrage,aPunkte,aFrage,aAntwort);
    }

    @Override
    public boolean istAntwortRichtig(String aAntwort) {
        if (aAntwort != null){
            if (aAntwort.toLowerCase().equals(this.getAntwort().toLowerCase())){
                //Antwort richtig
                return true;
            }else {
                //Antwort falsch
                return false;
            }
        }
        return false; //Antwort außerhalb des Bereichs!
    }
}
