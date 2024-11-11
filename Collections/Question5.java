// package RevisionJava.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        HashMap<String, String> mapp = new HashMap<>();
        mapp.put("Jaya", "gee");
        mapp.put("sdfsf", "sdfsgrg");
        mapp.forEach((key,value) ->
        System.out.println(key + " "+ value));

    }
}