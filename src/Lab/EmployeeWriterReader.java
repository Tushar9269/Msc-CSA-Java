package Lab;

import java.io.*;
import java.util.HashMap;

public class EmployeeWriterReader {
    public void writeEmployee(HashMap<String,Employee> employeeList) throws IOException {
        try{
            FileOutputStream outputStream = new FileOutputStream("Employee.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(employeeList);
            System.out.println("Object written to file");
            outputStream.close();
            objectOutputStream.close();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public HashMap<String, Employee> readEmployee() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("Employee.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return (HashMap<String, Employee>) objectInputStream.readObject();
    }
}
