package eigeneDatenstruktur.HashMap_Haus_Straße.GenericsT;

import java.util.ArrayList;

class T_Strasse<T> {
    T mName;
    ArrayList<Haus> mHäuser;

    public T_Strasse(T aName) {
        this.mName = aName;
        mHäuser = new ArrayList<>();
    }
}