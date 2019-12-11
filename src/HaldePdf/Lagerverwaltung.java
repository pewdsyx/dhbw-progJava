package HaldePdf;

public class Lagerverwaltung {
    //Membervariablen
    Palette[] mPalette;

    public int gebePlatznummerZurueck(Palette p){
        return p.mPositionImLager;
    }

    public String gebePaletteAus(Palette p){
        return p.toString();
    }

    public int gebePlatznummer(Palette p){
        
        return p.mPositionImLager;
    }

}
