package T2.Ejercicio1;

public class TestArticle {
    public static void printArticle(Article article) {
        System.out.println("Title: " + article.getTitle());
        System.out.println("Theme: " + article.getTheme());
        System.out.println("Author: " + article.getAuthor().getName());
    }
    public static void main(String[] args) {
        Author author = new Author("Victor Hugo", "French");
        Article article = new Article("Les Miserables", "Novel", author);
        printArticle(article);
    }
}
