// package RevisionJava.Collections;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        String word = "Jayfrgrg";
        Add(myList, word);
        Add(myList, word);
        Add(myList, word);
        Add(myList, word);
        Add(myList, word);

        remove(myList, word);
        iterate(myList);

    }

    public static void Add(ArrayList<String> myList , String word){
        myList.add(word);
    }

    public static void remove(ArrayList<String> myList , String word){
        myList.remove(word);
    }

    public static void iterate(ArrayList<String> myList){
        for (String string : myList) {
            System.out.println(string);
        }
    }
}
