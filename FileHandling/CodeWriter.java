package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CodeWriter {
    public static void main(String[] args) {
        String fileName = "FileHandling/first-file.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Billo bagge billiyan da ki karegi");
            writer.flush();
            System.out.println("File return succussfully");
            writer.close();
        } catch (IOException e) {
            System.out.printf("Exception occurred %s",e.getMessage());
        }
    }
}
