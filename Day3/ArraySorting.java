package JavaDay3;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 0, 6, 7, 8, };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            // or
            // for (int i=0;i<arr.length-1;i++)
            System.out.println(arr[i]);
        }
    }
}
