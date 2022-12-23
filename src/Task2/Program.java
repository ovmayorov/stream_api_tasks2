package Task2;

/*
Для набора названий городов (города могут повторяться) нужно:
■ Показать все города;
■ Показать все города с названием длиннее шесть символов;
■ Посчитать сколько раз встречается город, чье название ввёл пользователь;
■ Показать все города, которые начинаются на заданную букву;
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of(
                "Челябинск",
                "Москва",
                "Санкт-Петербург",
                "Казань",
                "Калининград",
                "Нижний Новгород",
                "Новосибирск",
                "Рязань",
                "Челябинск",
                "Москва",
                "Санкт-Петербург",
                "Санкт-Петербург",
                "Казань",
                "Калининград",
                "Нижний Новгород",
                "Новосибирск"
        ));
        System.out.println("Все города: ");
        System.out.println(cities);

        List<String> longNameCities = cities
                    .stream()
                    .filter(city -> city.length() > 6)
                    .distinct()
                    .collect(Collectors.toList());
        System.out.println("Города, название которых длиннее 6 символов:");
        System.out.println(longNameCities);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города: ");
        String target = scanner.nextLine();

        long citiesEqualToTarget = cities
                    .stream()
                    .filter(city -> city.equals(target))
                    .count();
        System.out.printf("Город %s встречается %d раз\n", target, citiesEqualToTarget);

        System.out.println("Введите префикс:");
        String prefix = scanner.nextLine();
        List<String> citiesByPrefix = cities
                    .stream()
                    .filter(city -> city.toLowerCase().startsWith(prefix.toLowerCase()))
                    .distinct()     //убирает повторы
                    .collect(Collectors.toList());
        System.out.printf("Города, начинающиеся на '%s':\n%s\n", prefix, citiesByPrefix);
    }
}
