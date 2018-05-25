package HaldePdf;

public class Lagerverwaltung {
    //Membervariablen
    Palette[] mPalette;

    public int gebePlatznummerZurueck(Palette p){
        return p.mPositionImLager;
    }

    public String gebePaletteAus(Palette p){
        Palette aPalette = p;

        return aPalette.toString();
    }

    public int gebePlatznummer(Palette p){
        
        return p.mPositionImLager;
    }

}
