package JavaDay2;
    import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter the number of products: ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product " + i + " amount:");
            int amount = s.nextInt();
            total += amount;
        }

        System.out.println("Total: " + total);

        System.out.println("Enter the discount percentage: ");
        int dis = s.nextInt();
        int disAmount = (total * dis) / 100; 
        int finalAmount = total - disAmount;

        System.out.println("Discount amount: " + disAmount);
        System.out.println("Final amount: " + finalAmount);
    }
}

