package Threading.java;

public class MainThreadExample {
    public static void main(String[] args) {
        Mythread t1 = new Mythread(); // create object of thread
        Mythread t2 = new Mythread(); // another thread

        t1.start();  // start thread 1
        t2.start();  // start thread 2

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

