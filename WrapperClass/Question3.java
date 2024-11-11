// package RevisionJava.WrapperClass;

public class Question3 {
    public static void main(String[] args) {
        Integer num1 = 12;
        Integer num2 = 12;
        Integer num3 = 870;
        Integer num4 = 870;

        // Using == operator
        System.out.println("Using == operator:");
        System.out.println("num1 == num2: " + (num1 == num2)); // true
        System.out.println("num3 == num4: " + (num3 == num4)); // false
        System.out.println("num1.equals(num2): " + num1.equals(num2)); // true
        System.out.println("num3.equals(num4): " + num3.equals(num4)); // true


    }
}
