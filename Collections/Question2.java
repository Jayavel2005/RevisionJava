// package RevisionJava.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// import java.*;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            myList.add(scanner.nextInt());
        }
        System.out.println(Collections.max(myList));
        System.out.println(Collections.min(myList));
        for (Integer integer : myList) {
            sum += integer;
        }

        System.out.println(sum);
    }
}
