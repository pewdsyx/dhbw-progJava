package AbstrakteKlassenUndInterface.anzeigetafel;

import drawtext.*;

import java.awt.*;

public class DrawTextTest {
    public static void main(String[] args) {
        DrawText d = new DrawText();

        Textbaustein t1 = new Textbaustein(Color.black,"Java",50);
        Textbaustein t2 = new Textbaustein(Color.black,"ist",50);
        Textbaustein t3 = new Textbaustein(Color.black,"super",50);
        Textbaustein t4 = new Textbaustein(Color.black,"toll.",50);

        d.add(t1);
        d.add(t2);
        d.add(t3);
        d.add(t4);

        d.startShow();
    }
}
