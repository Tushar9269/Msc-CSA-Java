package class1;

import java.io.*;
import java.util.*;

public class ExampleArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            System.out.println("Enter the colour of the car "+i+": ");
            String col = reader.readLine();
            car.setColor(col);
            System.out.println("Enter the no of seats of the car "+i+": ");
            int noSeat = Integer.parseInt(reader.readLine());
            car.setNoOfSeats(noSeat);
            System.out.println("Enter the brand of the car "+i+": ");
            String brand = reader.readLine();
            car.setBrand(brand);
            System.out.println("Enter the type of the car "+i+": ");
            String type = reader.readLine();
            car.setBrand(type);

            car.setManufactureDate(new Date());

            cars.add(car);
        }
        for (Car carItem : cars) {
            System.out.println("Brand of car: "+carItem.getBrand());
            System.out.println("No of seats of car: "+carItem.getNoOfSeats());
            System.out.println("Colour of car: "+carItem.getColor());
            System.out.println("Type of car: "+carItem.getType());
            System.out.println("Manufacture date of car: "+carItem.getManufactureDate());
        }
    }
}
