package T1;

import java.util.Random;

public class TemperatureSensor {
    static private Random r = new Random();
    private int id;
    private double temperature;
    TemperatureSensor()
    {
        id = r.nextInt(0,1000);
    }
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
