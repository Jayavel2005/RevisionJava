// package RevisionJava.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question3 {
    public static void main(String[] args) {
        File file = new File("jayavel.txt");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String c =  reader.readLine();
            while (c != null) {
                System.out.println(c);
                c = reader.readLine();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }   
}
