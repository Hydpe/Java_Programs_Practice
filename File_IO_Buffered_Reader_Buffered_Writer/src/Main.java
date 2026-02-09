package File_IO_Buffered_Reader_Buffered_Writer.src;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - ((Student) o).age;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tech.DESKTOP-EQL2OA6.000\\Downloads\\pom.xml"));
        String str;
        File file = new File("Exam.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file, true);
        fw.write("Hello Hai How Are you\n");

        while ((str = br.readLine()) != null) {
            System.out.println(str);
            fw.write(str + "\n");
            fw.flush();
        }
        fw.close();
        br.close();
    }
}