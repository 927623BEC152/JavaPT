package JavaDay3;

import java.util.*;

public class EvenIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {

                System.out.print(arr[j]);

            }
        }
        s.close();
    }
}
