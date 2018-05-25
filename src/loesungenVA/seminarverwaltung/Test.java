package loesungenVA.seminarverwaltung;

public class Test {

	public static void main(String[] args) {

		Institut i1=new Institut();
		//Seminare müssen noch dem Institut hinzugeügt werden

		Seminar s1=new Seminar("Mathe");
		Seminar s2=new Seminar("Kung Fu");

		
		Teilnehmer t1=new Teilnehmer("Marie");
		Teilnehmer t2=new Teilnehmer("Hans");
		
		Dozent d1=new Dozent("Meister Fang");
		Dozent d2=new Dozent("Rübezahl");
		d2.mKosten=0;
		
		s2.mDozent=d1;
		s2.addTeilnehmer(t1);
		s2.addTeilnehmer(t2);
		
		s1.mDozent=d2;
		s1.addTeilnehmer(t1);
		s1.addTeilnehmer(t2);
		
		System.out.println("Gewinn Mathe="+s1.getGewinn());
		System.out.println("Gewinn Kung Fu="+s2.getGewinn());

		//Klonen des Seminars s1 mit allen Atributen
		Seminar s3 = s1.clone("Mathe-AG");
		System.out.println(s3.mName);

		i1.mSeminarList.add(s1);
		i1.mSeminarList.add(s2);
		i1.mSeminarList.add(s3);
		System.out.println(i1.getDiscription());
	}

}
