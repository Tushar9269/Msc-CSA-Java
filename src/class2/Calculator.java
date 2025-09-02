package class2;

import java.io.*;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
    int mul(int a, int b) {
        return a * b;
    }
    int div(int a, int b) {
            return a / b;
    }
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

        System.out.print("Enter the operation(add, sub, mul, div): ");
        String op = reader.readLine();

        System.out.print("Enter integer1: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Enter integer2: ");
        int b = Integer.parseInt(reader.readLine());

        while (flag) {
            switch (op) {

                case "add":
                    System.out.println(calculator.add(a, b));
                    break;

                case "sub":
                    System.out.println(calculator.sub(a, b));
                    break;

                case "mul":
                    System.out.println(calculator.mul(a, b));
                    break;

                case "div":
                    try {
                        System.out.println(calculator.div(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println("Arithmetic Exception handled.");
                        flag = false;
                    } finally {
                        System.out.println("Finally block executed");
                    }
                    break;

                default:
                    System.out.println("Invalid operation");
                    flag = false;
            }
            reader.close();
        }
    }
}
