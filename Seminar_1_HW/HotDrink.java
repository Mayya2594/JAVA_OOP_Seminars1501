package Seminar_1_HW;

public class HotDrink extends Product {

    private int temperature;
    private double volume;

    public HotDrink(String name, int price) {
        super(name, price);
    }

    public HotDrink(String name, int price, double volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    @Override
    public String toString() {
        return "Hot Drink{" + 
                "name: " + getName() + ", " +
                "price: " + getPrice() + ", " +
                "volume: " + volume + ", " +
                "temperature: " + temperature +
                "}";
    }
    
}
