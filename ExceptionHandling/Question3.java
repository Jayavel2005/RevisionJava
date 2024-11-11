import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        HashSet myList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        try{
            for(int i = 0;i<5;i++){
                int number = scanner.nextInt();
                if(myList.contains(number)){
                    throw new Exception("Duplicate element is occurred");
                }
                else{
                    myList.add(number);
                }
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }   
}
