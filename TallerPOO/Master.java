package TallerPOO;

public class Master {
    public static void main(String[] args) {
        BankAccount mastercard = new BankAccount();
        //#region BankAccount
        try{
            System.out.println("Estado inicial de la cuenta es " + mastercard.getBalance());
            System.out.println("Estado de la cuenta tras depositar 1000 es" + mastercard.deposit(1000));
            System.out.println("Estado de la cuenta tras retirar 500 es" + mastercard.withdraw(500));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        //#endregion BankAccount
        //#region TemperatureSensor
        TemperatureSensor sensor1 = new TemperatureSensor();
        try{
            sensor1.setTemperature(-60);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        TemperatureSensor sensor2 = new TemperatureSensor();
        try{
            sensor2.setTemperature(50);
            System.out.println("La temperatura del sensor " + sensor2.getId() + " es: " + sensor2.getTemperature());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        //#endregion
        //#region Book
        Book book1 = new Book();
        try{
            book1.setPages(0);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        Book book2 = new Book();
        try{
            book2.setTitle("Cien años de soledad");
            book2.setAuthor("Gabriel García Márquez");
            book2.setPages(471);
            System.out.println("Título: " + book2.getTitle());
            System.out.println("Autor: " + book2.getAuthor());
            System.out.println("Número de páginas: " + book2.getPages());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        //#endregion
        //#region Movie
        Movie movie1 = new Movie();
        try{
            movie1.setGenre("Musical");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        Movie movie2 = new Movie();
        try{
            movie2.setTitle("Inception");
            movie2.setGenre("Acción");
            movie2.setRating(4.8);
            System.out.println("Título: " + movie2.getTitle());
            System.out.println("Género: " + movie2.getGenre());
            System.out.println("Calificación: " + movie2.getRating());
            System.out.println("¿Recomendada? " + (movie2.isRecommended() ? "Sí" : "No"));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        //#endregion Movie
    }
}
