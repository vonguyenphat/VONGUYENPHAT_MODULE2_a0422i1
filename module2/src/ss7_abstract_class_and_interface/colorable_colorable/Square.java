package ss7_abstract_class_and_interface.colorable_colorable;

public class Square extends Shape implements Colorable{
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public void   howtoColor() {
        System.out.println("Color all four sides...");
    }
}
