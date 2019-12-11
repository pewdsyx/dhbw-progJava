package eigeneDatenstruktur.HashMap_Haus_Straße;

public class String2int {

    public static int map(String s){

        int summe = 0;
        for (int i = 1; i<s.length()+1;i++){
            char c = s.charAt(i-1);
            byte b = (byte)c;
            //System.out.println(b);
            summe+=b*i;
            //System.out.println("Summe: " + b*i);

        }

        return summe % 21;
    }

    public static void main(String[] args) {
        //System.out.println(map("S"));

        Stadt stadt1 = new Stadt("Mannheim");
        Strasse s1 = new Strasse("Poststr.");
        Strasse s2 = new Strasse("Coblitzalle");

        s1.mHäuser.add(new Haus("Poststr.","2",2,"Yves",1949));
        s1.mHäuser.add(new Haus("Poststr.","3",2,"Yves",1960));
        s1.mHäuser.add(new Haus("Poststr.","4",2,"Yves",1990));

        s2.mHäuser.add(new Haus("Coblitzalle","1",2,"Yves",1990));
        s2.mHäuser.add(new Haus("Coblitzalle","2",4,"Yves",1996));

        stadt1.addStrasse(s1);
        stadt1.addStrasse(s2);

        Strasse poststr = stadt1.getStrasse("Poststr.");
        for (Haus h:
             poststr.mHäuser) {
            //System.out.println("Poststr: " + h.mHausnummer);
        }

        System.out.println(poststr.mHäuser.size());

    }
}
