package ss3_array_in_java;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};
        int length3 = arr1.length + arr2.length;
        int[] arr3 = new int[length3];
        int pop = 0;
        for (int element : arr1) {
            arr3[pop] = element;
            pop++;
        }
        for (int element : arr2) {
            arr3[pop] = element;
            pop++;
        }
        System.out.println("Mảng sau khi gộp là" + Arrays.toString(arr3));

    }
}
