package JavaDay3;

import java.util.*;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "  ");

            }
            System.out.println(" ");
        }
    }
}
