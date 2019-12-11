package SortiereAlgos.Aufgaben19_20.Handtasche_Comparable_Aufgabe20.EnummerationFarbe;

public class EnumTest {

    enum FARBE {
        rot,grün,blau;

    }
    public static void main(String[] args) {

        String f1 = "rot";
        String f2 = "grün";
        String f3 = "blau";

        //System.out.println(f1<f2); <- funktioniert nicht!

        int farbe0 = 0; //rot
        int farbe1 = 1; //grün
        int farbe2 = 2; //blau

        System.out.println(farbe0<farbe1);
        System.out.println(FARBE.blau);

        FARBE meineFarbe1 = FARBE.rot;
        FARBE meineFarbe2 = FARBE.blau;

        System.out.println(meineFarbe1.ordinal() < meineFarbe2.ordinal());

        FARBE[] meineFarben = new FARBE[] {meineFarbe1,meineFarbe2};
        FARBE test = meineFarben[0];
        System.out.println(test);

    }
}
