package Enumeration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum accountTypes {SAVINGS,CURRENT,DMAT}

public class Main {
    public static void main(String[] args) throws IOException {
        
//          using for loop for iteration
//        for (accountTypes myenum : accountTypes.values()) {
//            System.out.println(myenum);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the type of account you want to open: (SAVINGS, CURRENT, DMAT): ");
        accountTypes myenum = accountTypes.valueOf(br.readLine().toUpperCase());

//        using switch case for iteration
        switch (myenum) {
            case SAVINGS:
                System.out.println("SAVINGS ACCOUNT OPENED");
                break;
            case CURRENT:
                System.out.println("CURRENT ACCOUNT OPENED");
                break;
            case DMAT:
                System.out.println("DMAT ACCOUNT OPENED");
                break;
            default:
                System.out.println("INVALID ACCOUNT TYPE");
        }
    }
}
