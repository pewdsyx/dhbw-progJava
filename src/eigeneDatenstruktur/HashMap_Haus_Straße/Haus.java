package eigeneDatenstruktur.HashMap_Haus_Straße;

public class Haus implements Comparable {
    String mHausnummer;
    String mStrasse;
    int mAnzahlStockwerke;
    String mBesitzer;
    int mBaujahr;


    public Haus(String aStrasse,String aHausnummer, int aAnzahlStockwerke, String aBesitzer,
                int aBaujahr){
        mHausnummer=aHausnummer;
        mStrasse=aStrasse;
        mAnzahlStockwerke=aAnzahlStockwerke;
        mBesitzer=aBesitzer;
        mBaujahr=aBaujahr;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
