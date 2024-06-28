public class PrintNumbers {
    public static void main(String[] args) {
        // Create and start thread 1
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds between prints
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create and start thread 2
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds between prints
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
