package Task3;

/*
Создайте класс Автомобиля. Он должен хранить
информацию о названии автомобиля, год выпуска, цена,
цвет, объем двигателя. Нужно создать набор автомобилей
и выполнить следующие задачи:
■ Показать все автомобили;
■ Показать все автомобили заданного цвета;
■ Показать все автомобили заданного объёма;
■ Показать все автомобили дороже заданной цены;
■ Показать все автомобили чей год выпуска находится
в указанном диапазоне.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Car> autos = new ArrayList<>(List.of(
                new Car("Mazda", 2007, 2000, "red", 1.8),
                new Car("Kia", 2008, 2100, "white", 2.0),
                new Car("Opel", 2012, 2011, "black", 1.6),
                new Car("Toyota", 2009, 3000, "orange", 5.7)
        ));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Все автомобили:");
        autos.forEach(System.out::println);

        System.out.println("Введите цвет:");
        String color = scanner.nextLine();
        System.out.println("Все автомобили с цветом " + color + ":");
        autos.stream()      //Stream<Car>
                .filter(car -> car.getColor().equals(color))
                .forEach(System.out::println);

        System.out.println("Введите объем авто:");
        double volume = scanner.nextDouble();
        System.out.println("Все автомобили с объемом " + volume + ":");
        autos.stream()
                .filter(car -> car.getEngineVolume() == volume)
                .forEach(System.out::println);

        System.out.println("Введите цену:");
        int price = scanner.nextInt();
        System.out.println("Все автомобили дороже " + price + ":");
        autos.stream()
                .filter(car -> car.getPrice() > price)
                .forEach(System.out::println);

        System.out.println("Введите два года - начальный и конечный");
        int yearStart = scanner.nextInt();
        int yearEnd = scanner.nextInt();
        System.out.printf("Все автомобили с годом выпуска в диапазоне (%d, %d)", yearStart, yearEnd);
        autos.stream()
                .filter(car -> car.getYear() >= yearStart && car.getYear() <= yearEnd)
                .forEach(System.out::println);
    }
}
