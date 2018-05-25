package loesungenVA.seminarverwaltung;

import java.util.ArrayList;

public class Institut {

    ArrayList<Seminar> mSeminarList;

    public Institut(){
        mSeminarList = new ArrayList<>();
    }


    /**
     * Votieraufgabe 4; Ausgabe ist noch nicht schön!
     * @return gibt ein Beschreibung als Text zurück
     */
    public String getDiscription(){
        String ausgabe = "";
        ArrayList<Teilnehmer> aTeilnehmer = new ArrayList<>();
        for (Seminar k:
             mSeminarList) {
            ausgabe += k.mName;
            ausgabe += k.mDozent.mName;
            ausgabe += k.getGewinn();
            for (Teilnehmer t:
                 k.mTeilnehmer) {
                if (!aTeilnehmer.contains(t)) {
                    aTeilnehmer.add(t);
                }
            }
        }
        for (Teilnehmer t:
             aTeilnehmer) {
            ausgabe += t.mName;
        }

        return ausgabe;
    }

}
