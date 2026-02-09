package exceptionHandling.Exceptions.src;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Hyder.txt");
            System.out.println("File opened successfully");
        } catch (IOException e) {
            System.out.println("Checked Exception Caught:" + e);
        }
    }
}
