package T2.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TestEnrollment {
    public static void main(String[] args) {
        Student student1 = new Student("Marie Curie", 20);
        Student student2 = new Student("Albert Einstein", 22);
        Student student3 = new Student("Isaac Newton", 21);
        Course course = new Course("Fisica");
        course.AddStudent(student1);
        course.AddStudent(student2);
        course.AddStudent(student3);
        System.out.println("Estudiantes en el curso de " + course.getName() + ":");
        for (Student student : course.getStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
