import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String m = scanner.nextLine();
        Double n;
        try{
            n = Double.parseDouble(m);
            System.out.println(n);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
