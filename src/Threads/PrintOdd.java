package Threads;

public class PrintOdd implements Runnable {
    final Object mutex;
    PrintOdd(Object mutex) {
        this.mutex = mutex;
    }
    public void printOdd() throws InterruptedException{
        synchronized (mutex) {
            for (int i = 1; i <= 10; i += 2) {
                mutex.wait();
                System.out.println(i);
                mutex.notify();
            }
        }
    }

    @Override
    public void run(){
        try {
            printOdd();
        }catch (InterruptedException e){
            System.out.println("Odd Thread interrupted");
        }
    }
}
