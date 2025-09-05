package T2.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student> students = new ArrayList<Student>();
    public Course(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void AddStudent(Student student) {
        students.add(student);
    }
    public void RemoveStudent(Student student) {
        students.remove(student);
    }
}
