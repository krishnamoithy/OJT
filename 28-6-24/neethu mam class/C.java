class D implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("THIS IS MY CHILD THREAD");
        }
    }
}

public class C {
    public static void main(String[] args) {
        D r= new D();
        Thread t = new Thread(r);
        t.start();
        for(int i=1; i<=5; i++){
            System.out.println("THIS IS MAIN THREAD");
        }
    }
}
