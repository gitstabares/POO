import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reference {
    private String title = "";
    private List<String> authors = new ArrayList<>();
    private String venue = "";
    private int year = 0;
    private String doi = "";
    private String abstractText = "";
        public Reference(String title, String author, String venue, int year) {
        this.title = title;
        this.authors = Arrays.asList(author);
        this.venue = venue;
        this.year = year;
    }
    public Reference(String title, List<String> authors, String venue, int year) {
        this.title = title;
        this.authors = authors;
        this.venue = venue;
        this.year = year;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void addAuthor(String author) {
        this.authors.add(author);
    }
    public void AddAuthor(List<String> authors) {
        this.authors.addAll(authors);
    }
    public List<String> getAuthors() {
        return authors;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getVenue() {
        return venue;
    }
    public void setYear(int year) {
        if (year >= 0)  this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setDoi(String doi) {
        this.doi = doi;
    }
    public String getDoi() {
        return doi;
    }
    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }
    public String getAbstractText() {
        return abstractText;
    }
}
