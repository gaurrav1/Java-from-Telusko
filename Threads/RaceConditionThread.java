package Threads;
// Thread & Mutation
// Ensure method is thread safe(Atomic)

class Counter {
    public static int count = 0;
    static synchronized void increment() {
        count++;
    }
}

public class RaceConditionThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        };

        System.out.println("Initial Count: " + Counter.count);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Final Count: " + Counter.count);

    }
}
