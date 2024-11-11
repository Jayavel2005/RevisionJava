import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        try{
            if(n % 2 != 0){
                throw new Exception("It is an odd");
            }
            else{
                System.out.println("Its an even");
            }
        }
        catch(Exception e){
            System.out.println(e. getMessage());
        }
    }
}
