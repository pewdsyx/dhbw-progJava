package Fluglinie;

import java.util.ArrayList;

public class Verbindung {
    Flughafen mStart;
    Flughafen mZiel;
    ArrayList<Flug> mFlüge;

    public Verbindung(){
        this.mFlüge = new ArrayList<>();
    }
}
