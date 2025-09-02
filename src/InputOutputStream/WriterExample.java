package InputOutputStream;

import java.io.*;

public class WriterExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the contents of a file: ");
        String fileContent = br.readLine();
        try{
            Writer writer = new FileWriter("src/InputOutputStream/file.txt",true);
            writer.append(fileContent);
            System.out.println("File written successfully");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
