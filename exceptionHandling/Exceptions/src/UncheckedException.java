package exceptionHandling.Exceptions.src;

public class UncheckedException{
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);
    }
}

