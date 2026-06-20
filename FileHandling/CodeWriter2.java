package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CodeWriter2 {
    public static void main(String[] args) {
        String filename = "FileHandling/second.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Read this!\n");
            for(int i = 0; i < 10; i++){
                writer.write("hahaha");
            }
            writer.flush();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.printf("Exception occurred %s",e.getMessage());
        } 
    }
}
