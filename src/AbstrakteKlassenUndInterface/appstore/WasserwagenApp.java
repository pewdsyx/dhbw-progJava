package AbstrakteKlassenUndInterface.appstore;

public class WasserwagenApp implements App{

    //Memberfields
    private String mName;
    private String mBeschreibung;
    private double mPreis;

    public WasserwagenApp(String aName, String aBesch, double aPreis){
        this.mName = aName;
        this.mBeschreibung = aBesch;
        this.mPreis = aPreis;
    }




    @Override
    public String getName() {
        return this.mName;
    }

    @Override
    public String getBeschreibung() {
        return this.mBeschreibung;
    }

    @Override
    public double getPreis() {
        return this.mPreis;
    }
}
