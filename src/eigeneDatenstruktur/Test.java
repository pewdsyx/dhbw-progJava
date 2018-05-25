package eigeneDatenstruktur;

public class Test {
    public static void main(String[] args) {

        Regal r1 = new Regal();
        r1.add("das erste Paket");
        r1.add("das zweite Paket");
        r1.add("Yves");

        System.out.println(r1.mNextFreeIndex);
        System.out.println(r1.get(1));

        Regal r2 = new Regal();
        r2.add("xxxxx");
        r2.add("cccccc");
        r2.add("vvvvv");

        Regal r3 = r1.join(r2);
        int c = 0;
        for (String s :
             r3.mRegalArray) {
            System.out.println("Solt: "+ c + " "+s);
            c++;
        }

        System.out.println(r3.delete("Yves"));
        System.out.println(r3.get(2));

    }
}
