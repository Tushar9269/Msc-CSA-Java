/**
 * This is Practice class 1
 * @author Tushar Hassan
 * Date : 29th of june
 *
 **/




package class1;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
            int n = scanner.nextInt();
    System.out.println("Enter the value of m: ");
            int m = scanner.nextInt();

    for(int i=1;i<=m;i++){
                System.out.println(n+" * "+i+" = "+n*i);
            }

    }
}
