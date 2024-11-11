import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            String s = "Jayavel";
            if(!(s.contains("a") ||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u"))){
                throw new Exception("No vowels");
            }else{
                System.out.println("true");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
