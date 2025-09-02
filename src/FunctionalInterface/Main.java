package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        Square s = x-> {
            return x*x;
        };
        int num = s.calculate(4);
        System.out.println(num);
    }
}
