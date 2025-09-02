package InputOutputStream;

import java.io.*;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the contents of a file: ");
        String fileContent = br.readLine();
        FileOutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream("src/InputOutputStream/file.txt");
            byte[] bytes = fileContent.getBytes();
            outputStream.write(bytes);
            System.out.println("File Written Successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}
