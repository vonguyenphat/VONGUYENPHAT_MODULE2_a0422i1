package vd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CharacterTransformation characterTransformation = new CharacterTransformation();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        characterTransformation.setName(a);
        System.out.println(characterTransformation.capitalizeFirstLetter());
    }
}
