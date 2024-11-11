// package RevisionJava.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question6 {
    public static void main(String[] args) {
        File file = new File("jayavel.txt");

        int c = 0;
        int w = 0;
        int l = 0;

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String lines = reader.readLine();
            while (lines != null) {
                System.out.println(lines);
                l++;
                


                c += lines.length();

                String[] words = lines.split("\\s+");
                w += words.length;

                lines = reader.readLine();
                
            }

            
        }
        catch(IOException e){
            System.out.println(e);
        }


        System.out.println(c);
        System.out.println(w);
        System.out.println(l);
    }

    
}