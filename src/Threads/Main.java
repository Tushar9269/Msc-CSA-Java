package Threads;

public class Main {
    public static void main(String[] args) {
        Object mutex = new Object();
        Thread odd = new Thread(new PrintOdd(mutex));
        Thread even = new Thread(new PrintEven(mutex));
        odd.start();
        even.start();
        System.exit(0);
    }
}
