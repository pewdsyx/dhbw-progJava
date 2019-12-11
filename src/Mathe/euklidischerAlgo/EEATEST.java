package Mathe.euklidischerAlgo;

public class EEATEST {
    static int ggt(int zahl1, int zahl2) {
        while (zahl2 != 0) {
            if (zahl1 > zahl2) {
                zahl1 -= zahl2;
            } else {
                zahl2 -= zahl1;
            }
        }
        return zahl1;
    }

    public static void main(String[] args) {
        EEA e1 = new EEA();
        e1.startCal(7 ,11);

        //ggT(a,b) = 1:
        System.out.println("ggT(a,b) = 1");
        for (int i = 1; i <= 18; i++){
            for (int y = 1; y <= 18; y++){
                if (ggt(i,y) == 1){
                    System.out.println("a= " + i + ", b= " + y + " => 1");
                }
            }
        }

    }
}
