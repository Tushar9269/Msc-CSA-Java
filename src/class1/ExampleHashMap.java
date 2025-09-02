package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;

public class ExampleHashMap {
    public static  void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Car> cars = new HashMap<>();
        for (int i = 0; i < 2; i++) {
            Car car1 = new Car();

            System.out.println("Enter the colour of the car "+i+": ");
            String col = reader.readLine();
            car1.setColor(col);

            System.out.println("Enter the no of seats of the car "+i+": ");
            int noSeat = Integer.parseInt(reader.readLine());
            car1.setNoOfSeats(noSeat);

            System.out.println("Enter the brand of the car "+i+": ");
            String brand = reader.readLine();
            car1.setBrand(brand);

            System.out.println("Enter the type of the car "+i+": ");
            String type = reader.readLine();
            car1.setType(type);

            car1.setManufactureDate(new Date());

            cars.put(i, car1);
        }
        for (Car carItem : cars.values()) {
            System.out.println("Colour of car: "+carItem.getColor());
            System.out.println("Brand of car: "+carItem.getBrand());
            System.out.println("No of seats of car: "+carItem.getNoOfSeats());
            System.out.println("Colour of car: "+carItem.getColor());
            System.out.println("Type of car: "+carItem.getType());
            System.out.println("Manufacture date of car: "+carItem.getManufactureDate());
        }
    }
}
