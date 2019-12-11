package streams.dateilesen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DateiLesen {
    public static void main(String[] args) {
        File meineDatei = new File(
                "C:\\Users\\Yves Staudenmaier\\IdeaProjects\\DHBW-Playground\\src\\streams\\dateilesen\\meineDatei.txt");

        System.out.println(meineDatei.exists());

        try {
            FileReader fr = new FileReader(meineDatei);
            char[] charArray = new char[4];
            while (fr.ready()){
                fr.read(charArray);
                showCharArray(charArray);
            }
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void showCharArray(char[] cbuf){
        for (char c:cbuf) {
            System.out.println(c);
        }
        System.out.println();
    }

}
