package Task4;

public class TvSet {
    //Создайте класс Телевизор. Он должен хранить информацию о названии модели, год выпуска, цена, диагональ, производитель.
    private String model;
    private int year;
    private double price;
    private double size;
    private String manufacturer;

    public TvSet(String model, int year, double price, double size, String manufacturer) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "TvSet{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
