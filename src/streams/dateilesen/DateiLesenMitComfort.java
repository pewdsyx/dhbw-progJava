package streams.dateilesen;

import java.io.*;


public class DateiLesenMitComfort {
    public static void main(String[] args) {
        File fr = new File(
                "C:\\Users\\Yves Staudenmaier\\IdeaProjects\\DHBW-Playground\\src\\streams\\dateilesen\\meineDatei.txt");

        try{
            FileReader fileinput = new FileReader(fr);
            BufferedReader buff = new BufferedReader(fileinput);
            while (buff.ready()){
                String line = buff.readLine();
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
