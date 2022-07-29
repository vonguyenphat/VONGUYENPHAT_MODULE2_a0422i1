package ss7_abstract_class_and_interface.colorable_resizeable;

public abstract class Shape {
    private String color = "red";
    private boolean filler = true;

    public Shape() {
    }

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public abstract double getArea();

    public abstract void resize(double percent);

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filler=" + filler +
                '}';
    }


}
