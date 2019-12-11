package eigeneDatenstruktur.HashMap_Haus_Straße.GenericsT;

class String2int {

    public static int map(String s){

        int summe = 0;
        for (int i = 1; i<s.length()+1;i++){
            char c = s.charAt(i-1);
            byte b = (byte)c;
            //System.out.println(b);
            summe+=b*i;

        }

        return summe % 21;
    }

    public static void main(String[] args) {
        //System.out.println(map("S"));

        Stadt stadt1 = new Stadt("Mannheim");
        T_Strasse<String> s1 = new T_Strasse<>("Poststr.");
        T_Strasse<String> s2 = new T_Strasse<>("Poststr.");

        s1.mHäuser.add(new Haus("Poststr.","2",2,"Yves"));
        s1.mHäuser.add(new Haus("Poststr.","3",2,"Yves"));
        s1.mHäuser.add(new Haus("Poststr.","4",2,"Yves"));

        s2.mHäuser.add(new Haus("Coblitzalle","1",2,"Yves"));
        s2.mHäuser.add(new Haus("Coblitzalle","2",4,"Yves"));

        stadt1.addStrasse(s1);
        stadt1.addStrasse(s2);

        T_Strasse<String> poststr = stadt1.getStrasse("Poststr.");


        System.out.println(poststr.mHäuser.size());

    }
}
