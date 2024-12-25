package javaFile;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt", true); // true for appending
            writer.write("\nThis is an appended line.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
