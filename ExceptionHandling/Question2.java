import java.util.*;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try{
            int n = scanner.nextInt();
            if(n % 2 != 0){
                throw new Exception("The number sis Odd");
            }
            else{
                System.out.println("it is even");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}