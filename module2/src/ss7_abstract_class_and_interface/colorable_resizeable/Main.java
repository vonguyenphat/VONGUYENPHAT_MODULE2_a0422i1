package ss7_abstract_class_and_interface.colorable_resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3,5);
        shapes[2] = new Square(6);
        System.out.println("Ban đầu");
        for (Shape shape: shapes) {
            System.out.println(shape.getArea());
        }
        // tăng diện tích tất cả lên 20%
        for (Shape shape:shapes) {
            shape.resize(100);
        }
        System.out.println("sau khi tăng ");
        for (Shape shape:shapes) {
            System.out.println(shape.getArea());
        }

    }
}
