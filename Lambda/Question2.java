interface Operate{
    public int  oprate(int a , int b);
}
public class Question2 {
    public static void main(String[] args) {
        Operate add = (int a, int b) ->{
            return a + b;
        };

        System.out.println(add.oprate(4, 5));
    }    
}
