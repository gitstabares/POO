package T2.Ejercicio1;

public class Author {
    private String name, nationality;
    Author(String name, String nationality){
        this.name = name;
        this.nationality = nationality;
    }
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}