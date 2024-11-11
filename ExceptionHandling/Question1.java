import java.util.*;
public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int result = n1 / n2;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    
    }
}