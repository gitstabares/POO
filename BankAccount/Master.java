package BankAccount;

public class Master {
    public static void main(String[] args) {
        BankAccount mastercard = new BankAccount();
        try
        {
            System.out.println("Estado inicial de la cuenta: " + mastercard.getBalance());
            System.out.println("Estado de la cuenta tras depositar 1000" + mastercard.Deposit(1000));
            System.out.println("Estado de la cuenta tras retirar 500" + mastercard.Withdraw(500));
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
