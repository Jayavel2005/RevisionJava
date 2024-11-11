// package RevisionJava.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        HashSet<Integer> mySet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            myList.add(scanner.nextInt());
        }

        for (Integer integer : myList) {
            mySet.add(integer);
        };
        System.out.println(mySet);
        
    }
}
