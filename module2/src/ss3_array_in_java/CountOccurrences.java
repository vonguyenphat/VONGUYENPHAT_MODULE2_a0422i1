package ss3_array_in_java;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = "Võ Nguyễn Phát ".split("");
        System.out.print("Nhập ký tự: ");
        char ch = scanner.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].charAt(0) == ch) {
                dem++;
            }
        }
        System.out.print("Có " + dem + " ký tự có trong chuỗi ");
    }
}
