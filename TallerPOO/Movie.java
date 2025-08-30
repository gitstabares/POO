package TallerPOO;

public class Movie {
    private static String[] genres = {"Acción","Comedia","Drama","Documental","Terror"};
    private String title = "Sin título";
    private String genre = "Sin género";
    private double rating = 0.0;
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setGenre(String genre) throws Exception
    {
        for (String g : genres){
            if (g.equals(genre)){
                this.genre = genre;
                return;
            }
        }
        throw new Exception("Género no permitido");
    }
    public void setRating(double rating)
    {
        if (rating >= 0 && rating <= 5.0) this.rating = rating;
    }
    public String getTitle()
    {
        return title;
    }
    public String getGenre()
    {
        return genre;
    }
    public double getRating()
    {
        return rating;
    }
    public boolean isRecommended()
    {
        return rating >= 4.0;
    }
}
