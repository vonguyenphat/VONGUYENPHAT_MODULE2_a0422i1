package ss3_array_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
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

        int[] value = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            value[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu:\n" + Arrays.toString(value));
        System.out.println(value.length);
        //Biến chèn add
        int add;
        System.out.print("Nhập phần tử cần chèn: ");
        add = scanner.nextInt();
        //Vị trí cần chèn index
        int index;


        do {
            System.out.print("Nhập vị trí cần chèn: ");
            index = scanner.nextInt();
            if (index <= 0 || index >= size){
                System.out.println(" Không chèn được phần tử vào mảng.!!!");
            }
        }while (index <= 0 || index >= size);

        int[] newValue = new int[value.length+1];// thêm mảng value 1 giá trị
        for (int i=0; i<value.length;i++){
            newValue[i] = value[i];
        }
        for (int i = newValue.length-1;i>index;i--){
            newValue[i]= newValue[i-1];
        }
        newValue[index] = add;
        System.out.println("Mảng sau khi thêm giá trị "+add+" tại vị trí "+index+" là!");
        for (int i = 0; i < newValue.length; i++) {
            System.out.print(" "+newValue[i]);
        }
    }
}
