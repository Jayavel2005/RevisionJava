import java.util.ArrayList;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        ArrayList<String> m = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            m.add(scanner.nextLine());
        }

        try{
            for(String numStr : m){
                n.add(Integer.parseInt(numStr));
            }
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        System.out.println(n);

    }    
}
