package ss5_access_modifier_static_method_static_property;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }
    double getArea() {
        return getRadius() * 2 * Math.PI;
    }
}
