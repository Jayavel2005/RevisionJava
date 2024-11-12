import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final int maxSize = 5; // Limited buffer size
    private final Queue<Integer> buffer = new LinkedList<>();

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == maxSize) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait(); // Wait until there's space in the buffer
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer that there's something to consume
    }

    public synchronized void consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait(); // Wait until there's something to consume
        }
        int value = buffer.poll();
        System.out.println("Consumed: " + value);
        notify(); // Notify the producer that there's space in the buffer
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) { // Produce 10 items
                buffer.produce(i);
                Thread.sleep(500); // Slow down for easy observation
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) { // Consume 10 items
                buffer.consume();
                Thread.sleep(800); // Slow down for easy observation
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(); // Create a buffer with size 5
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
