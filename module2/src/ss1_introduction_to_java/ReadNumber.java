package ss1_introduction_to_java;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println(" zero ");
                    break;
                case 1:
                    System.out.println(" one ");
                    break;
                case 2:
                    System.out.println(" two ");
                    break;
                case 3:
                    System.out.println(" three ");
                    break;
                case 4:
                    System.out.println(" four ");
                    break;
                case 5:
                    System.out.println(" five ");
                    break;
                case 6:
                    System.out.println(" six ");
                    break;
                case 7:
                    System.out.println(" seven ");
                    break;
                case 8:
                    System.out.println(" eight ");
                    break;
                case 9:
                    System.out.println(" nine ");
                    break;
            }
        } else if (number < 20) {
            int little20 = number % 10;
            switch (little20) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number < 100) {
            int unit = number % 10;
            int dozen = (number / 10);
            switch (dozen) {
                case 2:
                    System.out.println(" twenty ");
                    break;
                case 3:
                    System.out.println(" thirty ");
                    break;
                case 4:
                    System.out.println(" fourty ");
                    break;
                case 5:
                    System.out.println(" fifty ");
                    break;
                case 6:
                    System.out.println(" sixty ");
                    break;
                case 7:
                    System.out.println(" seventy ");
                    break;
                case 8:
                    System.out.println(" eighty ");
                    break;
                case 9:
                    System.out.println(" ninety ");
                    break;
            }
            switch (unit) {
                case 1:
                    System.out.println(" one ");
                    break;
                case 2:
                    System.out.println(" two ");
                    break;
                case 3:
                    System.out.println(" three ");
                    break;
                case 4:
                    System.out.println(" four ");
                    break;
                case 5:
                    System.out.println(" five ");
                    break;
                case 6:
                    System.out.println(" six ");
                    break;
                case 7:
                    System.out.println(" seven ");
                    break;
                case 8:
                    System.out.println(" eight ");
                    break;
                case 9:
                    System.out.println(" nine ");
                    break;
            }
        } else if (number < 1000) {
            int hundreds = number / 100;
            int dozens = (number % 100) / 10;
            int units = ((number % 100) % 10);
            switch (hundreds) {
                case 1:
                    System.out.println("one hundred");
                    break;
                case 2:
                    System.out.println("two hundred");
                    break;
                case 3:
                    System.out.println("three hundred");
                    break;
                case 4:
                    System.out.println("four hundred");
                    break;
                case 5:
                    System.out.println("five hundred");
                    break;
                case 6:
                    System.out.println("six hundred");
                    break;
                case 7:
                    System.out.println("seven hundred");
                    break;
                case 8:
                    System.out.println("eight hundred");
                    break;
                case 9:
                    System.out.println("night hundred");
                    break;

            }
            switch (dozens) {

                case 1:
                    System.out.println(" and eleven ");
                    break;

                case 2:
                    System.out.println(" and  twenty ");
                    break;
                case 3:
                    System.out.println("  and thirty ");
                    break;
                case 4:
                    System.out.println(" and fourty ");
                    break;
                case 5:
                    System.out.println(" and fifty ");
                    break;
                case 6:
                    System.out.println(" and sixty ");
                    break;
                case 7:
                    System.out.println(" and seventy ");
                    break;
                case 8:
                    System.out.println(" and eighty ");
                    break;
                case 9:
                    System.out.println(" and ninety ");
                    break;
            }
            switch (units) {

                case 2:
                    System.out.println(" two ");
                    break;
                case 3:
                    System.out.println(" three ");
                    break;
                case 4:
                    System.out.println(" four ");
                    break;
                case 5:
                    System.out.println(" five ");
                    break;
                case 6:
                    System.out.println(" six ");
                    break;
                case 7:
                    System.out.println(" seven ");
                    break;
                case 8:
                    System.out.println(" eight ");
                    break;
                case 9:
                    System.out.println(" nine ");
                    break;
            }
        }

    }
}
