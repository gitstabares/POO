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
    }
}
