package Mathe.euklidischerAlgo;

public class EEA {

    private double x1,x2,x3 = 0;
    private double y1,y2,y3 = 0;
    private double t1,t2,t3 = 0;

    private double q = 0;

    private double berechneEEA(int a, int b) throws Exception{
        if(a < b){
            this.x1 = 1;
            this.x2 = 0;
            this.x3 = b;

            this.y1 = 0;
            this.y2 = 1;
            this.y3 = a;

            while (true){
                System.out.println("bin hier");
                if(this.y3 == 0){
                    System.out.println(x3 + " = ggT(" + a + ", " + b + ")");
                    return x3; // x3 = ggT(a,b)
                }

                if (this.y3 == 1){
                    System.out.println(y2 + " = "+ a + "^-1 kongruent 1 mod "+ b);
                    return y2; // y2 = a^-1 mod b
                }

                this.q = Math.floor((this.x3 / this.y3)); // Gaußklammer

                this.t1 = this.x1 - ( q * y1);
                this.t2 = this.x2 - ( q * y2);
                this.t3 = this.x3 - ( q * y3);

                this.x1 = this.y1;
                this.x2 = this.y2;
                this.x3 = this.y3;

                this.y1 = this.t1;
                this.y2 = this.t2;
                this.y3 = this.t3;
            }
        }
        throw new Exception("Error: a > b");
    }

    public double startCal(int a, int b) {
        try {
            return this.berechneEEA(a,b);
        }catch (Exception ie){
            ie.printStackTrace();
        }finally {
            return -1.0;
        }
    }
}
