// package RevisionJava.Generics;

public class q1 {

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String str = "The quick brown fox jumps over the lazy dog";

        for (char string : alphabet.toCharArray()) {
            System.out.print(string + " ");
        }
        System.out.println();
        for(char string : alphabet.toCharArray()){
            System.out.print(str.indexOf(string) + " ");
        }
    }
    
}