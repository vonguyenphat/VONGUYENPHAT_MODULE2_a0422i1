package ss5_access_modifier_static_method_static_property.circle;

import ss5_access_modifier_static_method_static_property.circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println(circle.getArea());
    }
}
