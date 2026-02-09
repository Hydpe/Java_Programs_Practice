package exceptionHandling.Exceptions.src;

import java.io.FileReader;
import java.io.IOException;

class Test {
    void readFile() throws IOException {
        FileReader fr = new FileReader("Hyder.txt");
    }
}
public class CheckedThrows{
    public static void main(String[] args) {
        Test t1 = new Test();
        try {
            t1.readFile();
        } catch (IOException e) {
            System.out.println("Handled IOException");
        }
    }
}
