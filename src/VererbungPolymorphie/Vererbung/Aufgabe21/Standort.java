package VererbungPolymorphie.Vererbung.Aufgabe21;

import java.util.ArrayList;
import java.util.List;

public class Standort {

    ArrayList<Fahrzeuge> mRegFahrzeuge;
    String mName;
    final double[] mKor;

    //Kordinaten
    private double mX;
    private double mY;

    private double distance; //In Abhängigkeit zu umkreisSuche();

    public Standort(String aName, double aX, double aY){
        this.mRegFahrzeuge = new ArrayList<>();
        this.mName = aName;
        this.mX = aX;
        this.mY = aY;
        //Kordinate abhängig dargestellt:
        this.mKor = new double[] {this.mX,this.mY};
    }

    public List<Fahrzeuge> getAvailbleVehicle(){
        List<Fahrzeuge> avaibleVehicle = new ArrayList<>();
        for (Fahrzeuge f:this.mRegFahrzeuge) {
            if (f.ismVerfügbar()){
                avaibleVehicle.add(f);
            }
        }
        return avaibleVehicle;
    }


    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }
}
