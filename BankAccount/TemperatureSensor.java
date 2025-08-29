package BankAccount;

public class TemperatureSensor {
    private int id;
    private double temperature;
    public void setTemperature(double temperature) throws Exception
    {
        if ((temperature > 100)||(temperature<-50)) throw new Exception("Solo se aceptan temperaturas entre -50 y 100");
        this.temperature = temperature;
    }
    public double getTemperature()
    {
        return temperature;
    }
    public int getId()
    {
        return id;
    }
}
