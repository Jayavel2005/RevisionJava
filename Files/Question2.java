// package RevisionJava.Files;

import java.io.File;

public class Question2 {
    public static void main(String[] args) {
        File file = new File("D:/");
        if(file.exists() && file.length() != 0){
            if(file.canRead()){
                System.out.println("Tyr");
            }else{
                System.out.println("false");
            }
            if (file.canWrite()) {
                System.out.println("worfwfsfs");
            }
            else
                System.out.println("ono f sdcvsdvidsviudsfvds");
        }else{
            System.out.println("no file ");
        }
    }
}
