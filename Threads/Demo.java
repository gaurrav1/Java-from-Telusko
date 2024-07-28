package Threads;

class A extends Thread{
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("-");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("///");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.getPriority());
        System.out.println(b.getPriority());

        a.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
    }
}
