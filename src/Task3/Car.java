package Task3;

public class Car {
    private String name;
    private int year;
    private int price;
    private String color;
    private double engineVolume;

    public Car(String name, int year, int price, String color, double engineVolume) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
