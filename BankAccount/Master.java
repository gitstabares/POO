package BankAccount;

public class Master {
    public static void main(String[] args) {
        BankAccount mastercard = new BankAccount();
        //#region BankAccount
        try{
            System.out.println("Estado inicial de la cuenta: " + mastercard.getBalance());
            System.out.println("Estado de la cuenta tras depositar 1000" + mastercard.deposit(1000));
            System.out.println("Estado de la cuenta tras retirar 500" + mastercard.withdraw(500));
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
            sensor2.getId();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        //#endregion
    }
}
