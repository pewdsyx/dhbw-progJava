package eigeneDatenstruktur.Regal_ArrayList;

public class Test {
    public static void main(String[] args) {

        Regal r1 = new Regal();
        r1.add(2);
        r1.add(3);
        r1.add(2);

        System.out.println(r1.mNextFreeIndex);
        System.out.println(r1.get(1));

        Regal r2 = new Regal();
        r2.add(5);
        r2.add(7);
        r2.add(9);

        Regal r3 = r1.join(r2);
        int c = 0;
        for (Object s :
             r3.mRegalArray) {
            System.out.println("Slot: "+ c + " " + "Inhalt: " +s);
            c++;
        }

        r3.contains(2);

        System.out.println(r3.delete(9));
        System.out.println(r3.get(2));

    }
}
