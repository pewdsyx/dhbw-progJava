package eigeneDatenstruktur.HashMap_Haus_Straße.GenericsT;

class Haus {
    String mHausnummer;
    String mStrasse;
    int mAnzahlStockwerke;
    String mBesitzer;


    public Haus(String aStrasse,String aHausnummer, int aAnzahlStockwerke, String aBesitzer){
        mHausnummer=aHausnummer;
        mStrasse=aStrasse;
        mAnzahlStockwerke=aAnzahlStockwerke;
        mBesitzer=aBesitzer;
    }

}
