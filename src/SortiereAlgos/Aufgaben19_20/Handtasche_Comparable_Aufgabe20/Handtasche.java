package SortiereAlgos.Aufgaben19_20.Handtasche_Comparable_Aufgabe20;

public class Handtasche implements Comparable<Handtasche> {
    //final, da die Handtasche ihre Eigenschaften nicht nach der
    //Erzeugung ändert.

    private final String mMarke;
    private final String[] mFarbeAuswahl = new String[] {"gelb", "braun", "grün", "blau", "beige", "schwarz"};
    private final int mFarbAuswahl; //wird für die compareTo():int benutzt
    private final String mFarbe;
    private final int mVolumen;
    private final int mAnzahlFächer;

    public Handtasche(String aMarke,int aFarbAuswahl,int aVolumen,int aAnzahlFächer){
        this.mMarke = aMarke;
        if (aFarbAuswahl > 5 || aFarbAuswahl < 0){
            this.mFarbe = this.mFarbeAuswahl[0];
            this.mFarbAuswahl = 0;
            System.err.println("Farbauswahl inkorrekt! Standardwert gesetzt!");
        }else{
            this.mFarbe = this.mFarbeAuswahl[aFarbAuswahl]; // idx 0  - 5
            this.mFarbAuswahl = aFarbAuswahl;
        }
        this.mVolumen = aVolumen; //in cm^3
        this.mAnzahlFächer = aAnzahlFächer;
    }

    public Handtasche(){
        this("NoName",0,0,0);
        System.err.println("NoName Handtasche erzeugt!");
        System.err.println(this.toString());
    }

    //AnzahlFächer und Volumen gleich, nun nach Farbe
    @Override
    public int compareTo(Handtasche ht){
        if (this.mAnzahlFächer < ht.mAnzahlFächer){
            return -1;
        }

        if (this.mAnzahlFächer == ht.mAnzahlFächer){
            //Anzahl Fächer gleich, jetzt nach Volumen:
            if (this.mVolumen < ht.mVolumen){
                return -1;
            }else if(this.mVolumen == ht.mVolumen){
                //hier Anzahl und Volumen gleich, jetzt nach Farbe nach idx der Farbe
                if (this.mFarbAuswahl < ht.mFarbAuswahl){
                    return -1;
                }else if (this.mFarbAuswahl == ht.mFarbAuswahl){
                    return 0;
                }else{
                    //this.mFarbAuswahl > ht.mFarbAuswahl
                    return 1;
                }
            }else{
                //Volumen größer
                return 1;
            }
        }
        //this.mAnzahlFächer > ht.mAnzahlFächer
        return 1;
    }

    @Override
    public String toString(){
        String out = "Marke: " + this.mMarke + "    " + "Farbe: " + this.mFarbe + "     " +
                "Volumen: " + this.mVolumen + " cm^3" + "   " + "AnzahlFächer: " + this.mAnzahlFächer;
        return out;
    }
}
