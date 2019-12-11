package VererbungPolymorphie.Polymorphie;

public class PolymorphieTest {

    public static void main(String[] args) {
        DHBW dhbwMannheim = new DHBW("DHBW Mannheim");
        Mitarbeiterin m1 = new Mitarbeiterin("Hans",22,2000);
        Mitarbeiterin m2 = new Mitarbeiterin("Paul",22);

        Mitarbeiterin d1 = new Dozentin("Hildegard", 32,10000,598);
        Mitarbeiterin h1 = new Hausmeister("Herbert",50,2900,Hausmeister.Werkzeug.Bohrer);

        //System.out.println(m2.toString()); .toString() braucht man nicht da Sysout auto die toString
        //anwendet:
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1);
        System.out.println(h1);

        dhbwMannheim.mMitarbeiterin.add(m1);
        dhbwMannheim.mMitarbeiterin.add(m2);
        dhbwMannheim.mMitarbeiterin.add(d1);
        dhbwMannheim.mMitarbeiterin.add(h1);

        System.out.println(dhbwMannheim);
    }
}
