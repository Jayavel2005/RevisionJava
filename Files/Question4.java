// package RevisionJava.Files;
import java.io.*;
public class Question4 {

    public static void main(String[] args) {
        File file = new File("jyavel.txt");

        try{
            FileWriter writer = new FileWriter(file);
            writer.write("Jaya");
            writer.close();
        }catch(IOException e){
            System.out.println(e);
        }

    }
}