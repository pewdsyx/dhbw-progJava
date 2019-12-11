package AbstrakteKlassenUndInterface.ratespielOHNE;

public class RSohneTEST {
    public static void main(String[] args) {
        Ratespiel r1 = new Ratespiel(new Spieler("Yves",0));

        r1.setFragen(new JaNeinFrage(10,"Heiße ich Yves?",1));

        r1.spiele();
    }
}
