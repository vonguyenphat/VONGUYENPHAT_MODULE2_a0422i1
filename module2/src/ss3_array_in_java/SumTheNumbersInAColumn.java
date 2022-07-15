package ss3_array_in_java;

import java.util.Scanner;

public class SumTheNumbersInAColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông!!!");
        int row;
        int column;
        do {
            System.out.print("Nhập số hàng: ");
            row = scanner.nextInt();
            System.out.print("Nhập số cột: ");
            column = scanner.nextInt();
            if (row!=column){
                System.out.println("Số hàng và số cột phải bằng nhau!!!");
            }
        }while (row!=column);

        int[][] arr = new int[row][column];

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print("A["+i+"]["+j+"] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("tổng các số ở đường chéo chính của ma trận: "+sum);
    }
}
