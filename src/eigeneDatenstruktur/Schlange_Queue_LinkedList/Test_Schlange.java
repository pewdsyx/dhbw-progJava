package eigeneDatenstruktur.Schlange_Queue_LinkedList;

public class Test_Schlange {

    public static void main(String[] args) {
        Schlange<String> s = new Schlange<>();
        s.add("erster Eintrag");
        s.add("erster Eintrag");
        s.add("erster Eintrag");
        s.add("zweiter Eintrag");
        s.add("dritter Eintrag");

        System.out.println(s.mSize);
        //von hinten nach vorne durchhangeln
        System.out.println(s.mTail.mPrev.mContent);
        //von vorne nach hinten durchhangeln
        System.out.println(s.mHead.mNext.mContent);

        System.out.println(s.containsGiveElement("erster Eintrag"));




    }
}
