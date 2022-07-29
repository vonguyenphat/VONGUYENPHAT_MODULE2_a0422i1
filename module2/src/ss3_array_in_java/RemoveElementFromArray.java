package ss3_array_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int size;
        int i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Số lượng phần tử < 20");
            }
        } while (size > 20);

        int[] value = new int[size];

        for (i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            value[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu:\n" + Arrays.toString(value));

        System.out.print("Nhập vị trí cần xóa: ");
        int delete = scanner.nextInt();
        int changes;
        for (changes = i = 0; i < size; i++) {
            if (value[i] != delete) {
                value[changes] = value[i];
                changes++;
            }
        }
        size = changes;
        System.out.println("Mảng sau khi xóa " + delete + " là");
        for (i = 0; i < size; i++) {
            System.out.print(value[i] + "\t");
        }
    }
}
