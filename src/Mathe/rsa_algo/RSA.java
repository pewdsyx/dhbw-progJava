package Mathe.rsa_algo;

public class RSA {



    private int calculatePhi(int p, int q){
        return ((p-1) * (q-1));
    }

    private int ggT(int a, int b){
        int h = (a > b) ? b : a;
        for (int i = h; i > 1; i--) {
            if ((a % i) == 0 && (b % i) == 0) {
                return i;
            }
        }
        return 1;
    }

    private int chooseE(int n, int p, int q){
        int e = 0;

        while(true){
            //wähle zufällig e in den unteren bereichen

            if(this.ggT(e,n) == 1 && (1 < e) && (e < this.calculatePhi(p,q))){
                return e;
            }
        }
    }
}
