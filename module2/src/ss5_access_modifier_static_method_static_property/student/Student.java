package ss5_access_modifier_static_method_static_property.student;

public class Student {
    public String name = "John";
    public String classes = "CO2";

    public Student() {

    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    void display() {
        System.out.printf("name = %s :class = %s%n", getName(), getClasses());
    }
}
