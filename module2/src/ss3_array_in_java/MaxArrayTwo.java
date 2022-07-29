package ss3_array_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArrayTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
