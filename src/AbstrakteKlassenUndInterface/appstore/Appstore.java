package AbstrakteKlassenUndInterface.appstore;

import java.util.ArrayList;

public class Appstore {

    String mName;
    private ArrayList<App> mApps; //Typ App ist Interface!

    public Appstore(String aName){
        this.mName = aName;
        mApps = new ArrayList<>();
    }

    public void addApp(App aApp){
        mApps.add(aApp);
    }
}
