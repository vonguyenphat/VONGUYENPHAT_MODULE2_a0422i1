package ss3_array_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        int size;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Số lượng phần tử < 20");
            }
        } while (size > 20);
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng = " + Arrays.toString(arr));
        int min = arr[0];
        int index = 0;
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
                index = i;
            }

        }
        System.out.println("Phần tử bé nhất trong mảng là "+min+" ở vị trí thứ "+ index +" trong mảng");
    }
}
