package eigeneDatenstruktur.HashMap_Haus_Straße;

public class Stadt {
    //membervariabeln
    String mName;
    Strasse[] mStrassen;


    public Stadt(String aName){
        mName = aName;
        mStrassen = new Strasse[21];
    }

    public void addStrasse(Strasse s){
        String aName = s.mName;
        mStrassen[String2int.map(aName)] = s;
    }

    public Strasse getStrasse(String name){
        //int idx = String2int.map(name);
        return mStrassen[String2int.map(name)];
    }

}
