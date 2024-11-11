// package RevisionJava.Files;

import java.io.File;

public class Ques1 {
    public static void main(String[] args) {
        File file = new File("D:/");

        if(file.exists() && file.length() != 0){
            if(file.isDirectory()){
                System.out.println("fircccccc");
            }
            else{
                System.out.println("fike");
            }
        }
    }
}
