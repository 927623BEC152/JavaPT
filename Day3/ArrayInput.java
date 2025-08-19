package JavaDay3;

import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }
        for (int j = 0; j < 5; j++) {

            System.out.print(arr[j]);
        }
    }
}
