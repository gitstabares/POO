package TallerPOO;

import java.util.Random;

public class BankAccount {
    static private Random r = new Random();
    private String accountNumber;
    private double balance;
    BankAccount()
    {
        accountNumber = Double.toString(r.nextDouble(10e16,10e17));
    }
    public double deposit(double amount) throws Exception
    {
        validAmount(amount);
        balance += amount;
        return balance;
    }
    public double withdraw(double amount) throws Exception
    {
        validAmount(amount);
        if (amount > balance) throw new Exception("No tiene ese monto en la cuenta");
        balance -= amount;
        return balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    private void validAmount(double amount) throws Exception
    {
        if (amount <= 0)  throw new Exception("No se admiten montos negativos o iguales a cero");
    }
}
