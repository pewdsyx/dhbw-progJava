package eigeneDatenstruktur.HashMap_Haus_Straße;

import java.util.ArrayList;

public class Strasse {
    String mName;
    ArrayList<Haus> mHäuser;

    public Strasse(String aName){
        mName = aName;
        mHäuser = new ArrayList<>();
    }

}
