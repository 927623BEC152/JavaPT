package JavaDay5;

public class PredefinedException {
    public static void main(String[] args) {
        try {
            // This will throw an ArithmeticException
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero.");
        }
    }
}
