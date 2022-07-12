package ss1_introduction_to_java;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.print("Input Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
