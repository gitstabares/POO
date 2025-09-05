package T2.Ejercicio1;

public class Article {
    private String title, theme;
    private Author author;
    Article(String title, String theme, Author author){
        this.title = title;
        this.theme = theme;
        this.author = author;
    }
    public Author getAuthor() {
        return author;
    }
    public String getTheme() {
        return theme;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
