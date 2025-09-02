package InputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {

        try{
            FileInputStream inputStream = new FileInputStream("src/InputOutputStream/file.txt");
            int a;
            while((a=inputStream.read())!=-1){
                System.out.print((char)a);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Error while reading file");
        }
    }
}
