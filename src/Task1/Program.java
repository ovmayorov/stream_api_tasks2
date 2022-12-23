package Task1;

/*
Для набора случайно сгенерированных целых чисел
нужно:
■ Количество четных;
■ Количество нечетных;
■ Количество равных 0;
■ Количество равных значению, введенному пользователем.
 */

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = IntStream.generate(() -> random.nextInt(101))       //Примитивный поток целых чисел
                                        .limit(30)
                                        .boxed()     //Stream<Integer>                    //Поток объектов Integer
                                        .collect(Collectors.toList());
        System.out.println("Случайные числа:");
        System.out.println(numbers);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100:");
        int target = scanner.nextInt();     //Считываем число для 4 пункта задания
        //Количество чётных
        long evenCount = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .count();   //Терминальный оператор, который возвращает количество элементов

        //Количество нечётных
        long oddCount = numbers.stream()
                .filter(n -> n % 2 != 0)
                .count();

        //Количество нулей
        long zeroesCount = numbers.stream()
                .filter(n -> n == 0)
                .count();

        long targetCount = numbers.stream()
                .filter(n -> n == target)
                .count();

        //Выводим статистику:
        System.out.printf("Количество чётных: %d\nКоличество нечётных: %d\n",
                evenCount, oddCount);
        System.out.printf("Количество нулей: %d\nКоличество чисел," +
                " равных пользовательскому значению: %d\n", zeroesCount, targetCount);
    }
}
