import java.util.*;
public class userDefinedException {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18.");
            } else {
                System.out.println("Valid age.");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        s.close();
    }
}
