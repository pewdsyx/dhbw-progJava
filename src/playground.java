import java.security.*;
import java.util.Arrays;

public class playground{

    static boolean isPrim(int a){
        for (int p = 2; p < a; p++){
            if (a%p == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(isPrim(3));
        System.out.println(isPrim(7));
        System.out.println(isPrim(2657));
        System.out.println(isPrim(6));

        try {
            byte[] b1 = "Soll verschluesselt werden".getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] hashed = md.digest(b1);

            int[] out = new int[hashed.length];
            for (int i = 0; i < out.length-1; i++){
                out[i] = Byte.toUnsignedInt(hashed[i]);
            }

            int[] s1 = Arrays.stream(out).filter(s -> s != 0).toArray();
            String console = "";

            for (int s:s1) {
                console += (char)s;
            }
            System.out.println(console);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
