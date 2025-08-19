package JavaDay5;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (MyCustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }
}
