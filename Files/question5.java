import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class question5 {
    public static void main(String[] args) {
        String srcFile = "jayavel.txt";
        String desFile = "jyavel.txt";
        try{
            FileInputStream inputStream = new FileInputStream(srcFile);
            FileOutputStream outputStream = new FileOutputStream(desFile);
            int byteData ;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

        }catch(IOException e){
            System.out.println(e);
        }
               

    }
}