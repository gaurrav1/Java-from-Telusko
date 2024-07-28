package Threads;

// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("-");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("///");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        Runnable a = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("-");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable b = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("////");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
