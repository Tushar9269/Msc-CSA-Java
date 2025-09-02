package class1;

import java.io.*;
import java.util.*;

public class carMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of cars you wanna create: ");
        int n = Integer.parseInt(br.readLine());

        Car[] cars = new Car[n];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("\nEnter details for car: "+(i+1));

            System.out.println("Enter brand name: ");
            String brand = br.readLine();

            System.out.println("Enter colour: ");
            String colour = br.readLine();

            System.out.println("Enter type: ");
            String type = br.readLine();

            System.out.println("Enter No of seats: ");
            int noOfSeats = Integer.parseInt(br.readLine());

            cars[i] = new Car();

            cars[i].setBrand(brand);
            cars[i].setManufactureDate(new Date());
            cars[i].setColor(colour);
            cars[i].setType(type);
            cars[i].setNoOfSeats(noOfSeats);
        }

        System.out.println("Printing the cars: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("\nCar "+(i+1));
            System.out.println("Date: " + cars[i].getManufactureDate());
            System.out.println("Color: " + cars[i].getColor());
            System.out.println("Type: " + cars[i].getType());
            System.out.println("No of Seats: " + cars[i].getNoOfSeats());
            System.out.println("Brand: " + cars[i].getBrand());
        }
    }
}
