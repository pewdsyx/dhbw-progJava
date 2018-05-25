package HaldePdf;

public class Palette {
    String mName;
    float mGewicht;
    int mPositionImLager;

    public String toString(){
        String aString = "Name der Palette: " + mName + "\n" +
                "Gewicht: " + mGewicht + "\n" + "Hinweis Platznummer: "+
                mPositionImLager;
        return aString;
    }

}
