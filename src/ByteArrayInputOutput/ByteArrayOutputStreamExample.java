package ByteArrayInputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            String data = "Hello World! ";
            String moreData = "Adding more data.";
            baos.write(data.getBytes());
            baos.write(moreData.getBytes());
            byteArrayOutputStream.write(data.getBytes());

            byte[] byteArray = baos.toByteArray();

            String result = baos.toString();
            String outputString = byteArrayOutputStream.toString();
            System.out.println("Length of the byte Array: "+byteArray.length);
            System.out.println("Full String: "+result);
            System.out.println("Original String"+outputString);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
