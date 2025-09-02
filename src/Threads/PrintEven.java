package Threads;

public class PrintEven implements Runnable {
    final Object mutex;
    PrintEven(Object mutex) {
        this.mutex = mutex;
    }
    public void printEven() throws InterruptedException {
        synchronized (mutex) {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i);
                mutex.notify();
                mutex.wait();
            }
        }
    }

    @Override
    public void run() {
        try {
            printEven();
        }catch (InterruptedException e){
            System.out.println("Even Thread interrupted");
        }
    }
}
