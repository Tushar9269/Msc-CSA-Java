package ObjectReadWrite;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        MyObject obj = new MyObject("Tushar",21);
        String filename = "src/file.txt";

        try{
            FileOutputStream outputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(obj);
            System.out.println("Object written to file");
            outputStream.close();
            objectOutputStream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
