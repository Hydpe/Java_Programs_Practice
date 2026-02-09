import java.util.*;

@FunctionalInterface
interface Task<T> {
    T execute(T input);
}
class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
class Print{
    public static void printable(String input){
        System.out.println(input);
    }
}
class Shared{
     public static int value=0;
}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString(){
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
class CompareByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
class CompareByName implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class Main {
    public static void validate(int age)
    {
        if(age<18)
            {
                try {
                    throw new CustomException("Invalid Age");
                }
                catch (CustomException e) {
                    System.out.println("Please enter a valid Age");
                    System.out.println(e.getMessage());
                }
            }
        else  if(age>=18)
            {

                System.out.println("Success");
            }
    }
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
         int age = input.nextInt();
         System.out.printf("%c\n",age);
         validate(age);
        List<Student>  students = new ArrayList<>();
        int I=input.nextInt();
        for(int i=0;i<I;i++){
            Student student = new Student(input.next(),input.nextInt());
            students.add(student);
        }
        Collections.sort(students);
        for(Student s:students){
            System.out.println(s);
        }
        System.out.println();
        Collections.sort(students,new CompareByName());
        for(Student s:students){
            System.out.println(s);
        }
        System.out.println();
        Collections.sort(students,new CompareByAge());
        for(Student s:students){
            System.out.println(s);
        }
        Task<Integer>  IsEven= (n)->n%2==0?1:0;
        System.out.println(IsEven.execute(10));
        int[] a={2,3,4,5,6};
        Task<Integer> addFiteen= (n)->n+10;

        for(int i=0;i<a.length;i++)
        {
            a[i]=addFiteen.execute(a[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        Shared shared1=new Shared();
        Shared shared2=new Shared();
        System.out.println(++shared1.value);
        System.out.println(++shared2.value);
        Print.printable("Hello");
    }
}