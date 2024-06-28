// class A extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             try {
//                 System.out.println("NSTI");
//                 Thread.sleep(500); // Corrected sleep method
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             System.out.println("Thread A was interrupted :"e.getMessage());
//         }
//     }
// }

// public class D {
//     public static void main(String[] args) {
//         A t = new A();
//         t.start();
//         for (int i = 1; i <= 5; i++) {
//             try {
//                 System.out.println("I LOVE TO PLAY");
//                 Thread.sleep(500); // Corrected sleep method
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }


class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("NSTI");
                Thread.sleep(500); // Corrected sleep method
            } catch (InterruptedException e) {
                System.out.println("Thread A was interrupted: " + e.getMessage());
                
            }
        }
    }
}

public class D {
    public static void main(String[] args) {
        A t = new A();
        t.start();
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("I LOVE TO PLAY");
                Thread.sleep(1000); // Corrected sleep method
            } catch (InterruptedException e) {
                System.out.println("MAIN THERAD  was interrupted: " + e.getMessage());
            }
        }
    }
}
