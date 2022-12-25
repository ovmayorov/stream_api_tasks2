package Task4;

/*
�������� �������
�������� ����� ���������. �� ������ ������� ���������� � �������� ������, ��� �������, ����, ���������, �������������.
����� ������� ����� �����������
� ��������� ��������� ������:
? �������� ��� ����������;
? �������� ���������� � �������� ����������;
? �������� ��� ���������� ������ �������������;
? �������� ��� ���������� �������� ����;
? �������� ��� ���������� ������ �������� ����;
? �������� ��� ����������, ��������������� �� ����
�� �����������;
? �������� ��� ����������, ��������������� �� ����
�� ��������.
������������ �������
2
? �������� ��� ����������, ��������������� �� ��������� �� �����������;
? �������� ��� ����������, ��������������� �� ��������� �� ��������.
 */

import java.util.*;

public class Program {
    public static void main(String[] args) {
        //����� ���� ���������� ��
        Scanner scanner = new Scanner(System.in);
        List<TvSet> tvSets = new ArrayList<>(List.of(
                new TvSet("Sony2020-90",2020,6100,76,"Sony"),
                new TvSet("Panasonic2020-79",2020,6200,79,"Panasonic"),
                new TvSet("Electronica2020-69",2020,6500,69,"Electronica"),
                new TvSet("Sony2021-90",2021,6900,90,"Sony"),
                new TvSet("Sony2022-90",2022,8400,90,"Sony"),
                new TvSet("Philips2022-90",2022,7900,90,"Philips"),
                new TvSet("Philips2021-51",2021,5999,51,"Philips"),
                new TvSet("Philips2021-61",2021,6500,61,"Philips"),
                new TvSet("Sharp2020-34",2020,5700,34,"Sharp"),
                new TvSet("Sharp2022-120",2022,9900,120,"Sharp"),
                new TvSet("LG2019-34",2019,5900,34,"LG"),
                new TvSet("LG2023-80",2023,8900,80,"LG"),
                new TvSet("Sharp2023-61",2023,7900,61,"Sharp")
        ));
//�������� ��� ����������;
        System.out.println("��� ����������: ");
        tvSets.forEach(System.out::println);

        System.out.println("\n������� ������ ��������� ���������� ��� ������: ");
        double diagonalSize = scanner.nextDouble();
        tvSets.stream()
                .filter(tv -> tv.getSize()==diagonalSize)
                .forEach(System.out::println);
//�������� ��� ���������� ������ �������������;
        System.out.println("\n������� ������������� : ");
        String factory = scanner.next();
        tvSets.stream()
                .filter(tv -> tv.getManufacturer().equals(factory))
                .forEach(System.out::println);

        //�������� ��� ���������� �������� ����;
        System.out.println("\n���������� ������������� � ������� ����: ");
        Calendar cal = Calendar.getInstance();
        tvSets.stream()
                .filter(tv -> tv.getYear()==(cal.get(Calendar.YEAR)))
                .forEach(System.out::println);

        //�������� ��� ���������� ������ �������� ����;
        System.out.println("\n���������� ������ �������� ����. ������� ����:");
        double priceSearch = scanner.nextDouble();
        tvSets.stream()
                .filter(tv -> tv.getPrice()>=priceSearch)
                .forEach(System.out::println);

        //�������� ��� ����������, ��������������� �� ����
        //�� �����������;
        System.out.println("\n���������� ��������������� �� ���� �� �����������: ");
        tvSets.stream()
                .sorted(Comparator.comparingDouble(TvSet::getPrice))
                .forEach(System.out::println);

        //�������� ��� ����������, ��������������� �� ����
        //�� ��������.
        System.out.println("\n���������� ��������������� �� ���� �� ��������: ");
        tvSets.stream()
                .sorted(Comparator.comparingDouble(TvSet::getPrice).reversed())
                .forEach(System.out::println);

        //�������� ��� ����������, ��������������� �� ��������� �� �����������;
        System.out.println("\n���������� ��������������� �� ��������� �� �����������: ");
        tvSets.stream()
                .sorted(Comparator.comparingDouble(TvSet::getSize))
                .forEach(System.out::println);

        //�������� ��� ����������, ��������������� �� ��������� �� ��������.
        System.out.println("\n���������� ��������������� �� ��������� �� ��������: ");
        tvSets.stream()
                .sorted(Comparator.comparingDouble(TvSet::getSize).reversed())
                .forEach(System.out::println);
    }
}
