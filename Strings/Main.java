public class Main {

    public static void main(String[] args) {
        Runnable a = () ->{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        Runnable  b= () ->{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };

        Thread aa = new Thread(a);
        Thread bb = new Thread(b);
        aa.start();;
        bb.start();
    }
}