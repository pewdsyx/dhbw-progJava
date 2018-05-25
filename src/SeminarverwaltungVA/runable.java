package SeminarverwaltungVA;

public class runable {

    public static void main(String[] args) {
        Seminar s1 = new Seminar(new Dozent(200),300);
        Seminar s2 = new Seminar(new Dozent(250),300);
        //Seminar s3 = new Seminar(new Dozent(250),300);

        Teilnehmer t1 = new Teilnehmer("Yves",300);
        Teilnehmer t2 = new Teilnehmer("Jorge",300);
        Teilnehmer t3 = new Teilnehmer("Julia",300);
        Teilnehmer t4 = new Teilnehmer("Gökce",300);
        Teilnehmer t5 = new Teilnehmer("Tobias",300);
        Teilnehmer t6 = new Teilnehmer("Sabrina",300);
        Teilnehmer t7 = new Teilnehmer("Bella",300);


        s1.trageTeilnehmerEin(t1);
        s1.trageTeilnehmerEin(t2);
        s1.trageTeilnehmerEin(t3);
        s1.trageTeilnehmerEin(t4);
        s1.trageTeilnehmerEin(t5);
        //funktioniert nicht da Seminar Größe 5 ist:
        s1.trageTeilnehmerEin(t6);

        s2.trageTeilnehmerEin(t6);
        s2.trageTeilnehmerEin(t7);

        s1.gebeTeilnehmerAus();

        s1.nehmeBeiträgeEin();
        System.out.println(s1.gebeGewinnAus());


    }
}
