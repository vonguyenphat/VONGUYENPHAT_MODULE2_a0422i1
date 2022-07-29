package ss7_abstract_class_and_interface.colorable_resizeable;

public class Square extends Shape implements Resizeable {
    private double length = 1.0;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public Square(String color, boolean filler, double length) {
        super(color, filler);
        this.length = length;
    }


    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }

    @Override
    public void resize(double percent) {

    }
}
