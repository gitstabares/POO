package T2.Ejercicio2;

public class Student {
    private String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean setId(int id) {
        // Returns true if the id is valid and sets it, otherwise returns false and does not set it
        if ((id > 10e6)&&(id < 10e7))
        {
            this.id = id;
            return true;
        }
        return false;
    }
}