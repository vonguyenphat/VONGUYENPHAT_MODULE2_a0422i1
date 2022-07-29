package ss1_introduction_to_java;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Money USD: ");
        double money = scanner.nextDouble();
        double rate = 23000 * money;
        System.out.println("Với " + money + " USD = " + rate + " VND");
    }
}
