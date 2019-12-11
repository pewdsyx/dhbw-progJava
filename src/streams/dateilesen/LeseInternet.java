package streams.dateilesen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class LeseInternet {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.de/");
            BufferedReader buff = new BufferedReader(new InputStreamReader(url.openStream()));
            while (buff.ready()){
                System.out.println(buff.readLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
