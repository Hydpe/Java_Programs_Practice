package exceptionHandling.Exceptions.src;

class AgeRuntimeException extends RuntimeException {
    AgeRuntimeException(String msg) {
        super(msg);
    }
}

public class CustomUnchecked {
    static void checkAge(int age) {
        if (age < 18) {
            throw new AgeRuntimeException("Age must be 18+");
        }
    }

    public static void main(String[] args) {
        checkAge(16); // no try-catch required
    }
}
