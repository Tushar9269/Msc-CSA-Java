package ObjectReadWrite;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        String filename = "src/file.txt";

        try{
            FileInputStream inputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            MyObject obj = (MyObject) objectInputStream.readObject();
            System.out.println(obj);
            inputStream.close();
            objectInputStream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
