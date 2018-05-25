package loesungenVA.seminarverwaltung;

import java.util.ArrayList;

public class Seminar {

	String mName;
	double mMiete;
	int mMaxAnzTeilnehmer;
	double mBeitrag;//in Euro
	ArrayList<Teilnehmer> mTeilnehmer;
	Dozent mDozent;
	
	public Seminar(String aName)
	{
		mTeilnehmer=new ArrayList<Teilnehmer>();
		mMiete=200;
		mMaxAnzTeilnehmer=20;
		mBeitrag=10;
		mDozent=null;
		mName=aName;
	}
	
	/**
	 * 
	 * @param aTeilnehmer
	 * @return false, wenn die Eintragung nicht erfolgreich war
	 */
	public boolean addTeilnehmer(Teilnehmer aTeilnehmer)
	{
		boolean ret=false;
		
		if (mTeilnehmer.size()<mMaxAnzTeilnehmer)
		{
			mTeilnehmer.add(aTeilnehmer);
			ret=true;
		}		
		return ret;
	}	
	
	public double getGewinn()
	{
		if (mDozent!=null)
		{
			double kosten=mDozent.mKosten+mMiete;
			double einnahmen=mTeilnehmer.size()*mBeitrag;
			return einnahmen-kosten;
			
		}else
		{
			return Double.NaN;
		}
	}

	/**
	 * Votieraufgabe 3
	 * @param aName
	 * @return gibt ein Seminar zurück,
	 */
	public Seminar clone(String aName){
		Seminar ret = new Seminar(aName);
		ret.mMiete = mMiete;
		ret.mBeitrag = mBeitrag;
		ret.mMaxAnzTeilnehmer = mMaxAnzTeilnehmer;
		ret.mDozent = mDozent;
		//ret.mName = aName;
		for (Teilnehmer t:
			 mTeilnehmer) {
			ret.mTeilnehmer.add(t);
		}

		return ret;
	}
}
