package eigeneDatenstruktur.HashMap_Haus_Straße.GenericsT;

import java.util.HashMap;
import java.util.Map;

class Stadt {
    //membervariabeln
    String mName;
    Map<Integer,T_Strasse<String>> mStrassen;


    public Stadt(String aName){
        mName = aName;
        mStrassen = new HashMap<>();
    }

    public void addStrasse(T_Strasse<String> s){
        String aName = s.mName;
        mStrassen.put(String2int.map(aName),s);
    }

    public T_Strasse getStrasse(String name){
        //int idx = String2int.map(name);
        return mStrassen.get(String2int.map(name));
    }

}
