package org.itstep;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

        // 3. Дано трехзначное число. Вывести число, полученное при перестановке цифр сотен и десятков исходного числа
        // (например, 123 перейдет в 213).
        int id = 123;
        int hundreds = id/100;
        int tens = (id - hundreds * 100)/10;
        int units = (id - hundreds * 100 - tens * 10);
        int result = tens * 100 + hundreds * 10 + units;
        System.out.println("The number is converted " + result + " from a number " + id);

        var scanner = new  Scanner(System.in);
        System.out.println("Введите трехзначное число");
        boolean isInt = scanner.hasNextInt();
        System.out.println(isInt);
        if (isInt) {
            int x = scanner.nextInt();
            System.out.println("Введено число " + x);
            if (x >= 100)
                if (x<=999) {
                    System.out.println("Число " + x + " является трехзначным");
                    hundreds = x/100;
                    tens = (x - hundreds * 100)/10;
                    //  6. Дано трехзначное число. Определить, является ли его число десятков четным числом.
                    if (tens % 2 == 0)
                        System.out.println("Число десятков является четным числом");
                    else
                        System.out.println("Число десятков является нечетным числом");
                    // 12. Дано трехзначное число. Округлить его до сотен.
                    if (tens >= 5) ++hundreds;
                    result = hundreds * 100;
                    System.out.println("Число " + x + " округлено до сотен: " + result);
                }
                else {
                    // 9. Дано целое число, большее 999. Найти цифру, соответствующую разряду сотен в записи этого числа.
                    System.out.println("Число больше 999");
                    if (x < 10000) {
                        int thousands = x/1000;
                        hundreds = (x - thousands * 1000) / 100;
                        System.out.println("Разряд сотен числа " + x + " равен " + hundreds);
                    }

                }
            else System.out.println("Число не является трехзначным");
        }
        else System.out.println("Это не целое число");
    }
}
