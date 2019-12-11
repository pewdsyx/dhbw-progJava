package AbstrakteKlassenUndInterface.ratespiel;


public class DreiAntwortenFrage extends Frage {

    private final String[] mAntwort = new String[3];

    public DreiAntwortenFrage(String aArtFrage, int aPunkte, String aFrage, String[] aAntwort){
        super(aArtFrage, aPunkte, aFrage,null);
        this.mAntwort[0] = aAntwort[0];
        this.mAntwort[1] = aAntwort[1];
        this.mAntwort[2] = aAntwort[2];

    }

    public String[] getArrayAntwort() {
        return mAntwort;
    }

    @Override
    public boolean istAntwortRichtig(String aAntwort) {
        for (int i = 0; i <= mAntwort.length-1; i++){
            if (aAntwort.toLowerCase().equals(mAntwort[i].toLowerCase())){
                return true;
            }
        }
        return false;
    }

    /*@Override
    public String toString(){
        String ret = " ";
        for (int i = 0; i <= mAntwort.length-1; i++){
            ret += "Mögliche Antwort " + i + " :" + mAntwort[i];
        }
        return ret;
    }*/
}
