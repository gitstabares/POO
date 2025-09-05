package T1;

public class Book {
    private String title = "Sin título";
    private String author = "Anónimo";
    private int pages;
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPages()
    {
        return pages;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setPages(int pages) throws Exception
    {
        if (pages <= 0) throw new Exception("El libro debe tener al menos una página");
        this.pages = pages;
    }
}
