package ss5_access_modifier_static_method_static_property.student;

import ss5_access_modifier_static_method_static_property.student.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Phát");
        student.setClasses("A04");
        student.display();
    }
}
