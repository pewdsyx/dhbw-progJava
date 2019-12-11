package AbstrakteKlassenUndInterface.ratespiel;


public class RSohneTEST {
    public static void main(String[] args) {
        Ratespiel r1 = new Ratespiel(new Spieler("Yves",0));

        r1.setFragen(new JaNeinFrage("JaNeinFrage",10,"Heiße ich Yves?","ja"));
        r1.setFragen(new JaNeinFrage("JaNeinFrage",20,"Bist Du ein Affe?","nein"));

        r1.setFragen(new DreiAntwortenFrage("DreiAntwortFrage",10,"Drei Wörter?",
                new String[] {"Affe","Kuh","Weihnachtsmann"}));
        r1.setFragen(new DreiAntwortenFrage("DreiAntwortFrage",30,"Drei Wörter?",
                new String[] {"Hund","Katze","Panda"}));

        r1.setFragen(new WortFrage("WortFrage",10,"Wort mit B","Binnenschiff"));
        r1.setFragen(new WortFrage("WortFrage",100,"Wort mit A","Affe"));

        r1.spiele();
    }
}
