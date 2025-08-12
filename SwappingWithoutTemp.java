package JavaDay3;

public class SwappingWithoutTemp {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        // int v=a;

        System.out.println("Before Swapping: " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after Swapping: " + a + " " + b);

    }
}
