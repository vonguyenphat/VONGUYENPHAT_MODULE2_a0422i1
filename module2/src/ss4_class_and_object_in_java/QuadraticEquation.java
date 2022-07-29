package ss4_class_and_object_in_java;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(getDiscriminant())) / 2 * getA();
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(getDiscriminant())) / 2 * getA();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextInt();
        System.out.print("b = ");

        double b = scanner.nextInt();
        System.out.print("c = ");

        double c = scanner.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("x1 = x2 = " + quadraticEquation.getRoot2());
        }
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có hai nghiệm: \n x1 = " + quadraticEquation.getRoot1() + " \n x2 = " + quadraticEquation.getRoot2());
        } else System.out.println("The equation has no roots");
    }
}
