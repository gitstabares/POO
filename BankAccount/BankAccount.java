package BankAccount;

import java.util.Random;

public class BankAccount {
    static private Random r;
    private String accountNumber;
    private double balance;
    BankAccount()
    {
        accountNumber = Double.toString(r.nextDouble(10e16,10e17));
    }
    public double Deposit(double amount) throws Exception
    {
        ValidAmount(amount);
        balance += amount;
        return balance;
    }
    public double Withdraw(double amount) throws Exception
    {
        ValidAmount(amount);
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
    private void ValidAmount(double amount) throws Exception
    {
        if (amount <= 0)  throw new Exception("No se admiten montos negativos o iguales a cero");
    }
}
