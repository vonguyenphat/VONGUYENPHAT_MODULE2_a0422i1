package ss6_inheritance.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double areaCylinder() {
        return 2 * Math.PI * getRadius() * getRadius() + 2 * Math.PI * getRadius() * getHeight();

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
