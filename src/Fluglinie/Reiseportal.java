package Fluglinie;

import java.util.ArrayList;

public class Reiseportal {

    ArrayList<Fluglinie> mLinien;
    ArrayList<Buchung> mBuchungen;


    public Reiseportal(){
        this.mLinien = new ArrayList<>();
        this.mBuchungen = new ArrayList<>();
    }

    public ArrayList<Flug> getFlugNichtVoll(Flughafen aVon,Flughafen aNach){
        ArrayList<Flug> mRet = new ArrayList<>();


        return mRet;
    }

    public boolean bucheFlug(Flug aFlug, Passagier aPass){
        return false;
    }
}
