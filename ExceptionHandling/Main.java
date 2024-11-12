class Printer {
    private boolean isOdd = true;

    public synchronized void printOdd(int value) throws InterruptedException {
        while (!isOdd) {
            wait();
        }
        System.out.println("Odd: " + value);
        isOdd = false; // Switch turn to even
        notify();
    }

    public synchronized void printEven(int value) throws InterruptedException {
        while (isOdd) {
            wait();
        }
        System.out.println("Even: " + value);
        isOdd = true; // Switch turn to odd
        notify();
    }
}

class OddThread extends Thread {
    private final int limit;
    private final Printer printer;

    OddThread(Printer printer, int limit) {
        this.printer = printer;
        this.limit = limit;
    }

    public void run() {
        try {
            for (int i = 1; i <= limit; i += 2) {
                printer.printOdd(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class EvenThread extends Thread {
    private final int limit;
    private final Printer printer;

    EvenThread(Printer printer, int limit) {
        this.printer = printer;
        this.limit = limit;
    }

    public void run() {
        try {
            for (int i = 2; i <= limit; i += 2) {
                printer.printEven(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        int limit = 10; // Limit up to which you want to print numbers

        OddThread oddThread = new OddThread(printer, limit);
        EvenThread evenThread = new EvenThread(printer, limit);

        oddThread.start();
        evenThread.start();
    }
}
