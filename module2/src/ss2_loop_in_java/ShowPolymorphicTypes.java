package ss2_loop_in_java;

import java.util.Scanner;

public class ShowPolymorphicTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("1 Print the rectangle");
            System.out.println("2 Print the square triangle ");
            System.out.println("3 Print isosceles triangle");
            System.out.println("4 exit ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
            }
        }


    }
}
