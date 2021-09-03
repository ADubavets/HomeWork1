package org.itstep;

public class FirstTask {
    public static void main(String[] args) {
        // 1. Записать инструкцию, которая присваивает переменной x значение 1,5.
        double x = 1.5;
        System.out.println(x);

        // 3. Записать инструкцию, которая увеличивает на единицу значение переменной n.
        int n = 2;
        n = n + 1;
        System.out.println(n);

        // 5. Написать инструкцию вычисления среднего арифметического переменных x1 и x2.
        int x1 = 3;
        int x2 = 6;
        x = (x1 + x2) / 0x2;
        System.out.println(x);

        // 7. Написать инструкцию, которая увеличивает значение переменной x на величину, находящуюся в переменной dx.
        double dx = 4.7;
        double sum = x + dx;
        System.out.println(sum);

        // 9. Записать в виде инструкции присваивания формулу пересчета расстояния из километров в версты (одна верста — 1066,8 м).
        int distanceKilometer = 59;
        double distanceMile = distanceKilometer * 1000 / 1066.8;
        System.out.println("Distance of miles: " + distanceMile);

        // 11. Записать в виде инструкции присваивания формулу вычисления площади треугольника: s= a⋅h/2
        int a = 5;
        double h = 4.5;
        double squareTriangle = a * h / 2;
        System.out.println("The area of the triangle: " + squareTriangle);

        // 13. Записать в виде инструкции присваивания формулу вычисления площади круга: s=π⋅r^2
        double r = 5.5;
        double squareCircle = Math.PI * r * r;
        System.out.println("The area of the circle: " + squareCircle);

        //15. Записать в виде инструкции присваивания формулу вычисления объема параллелепипеда.
        int b = 10;
        double volumeParallelepiped = a * b * h;
        System.out.println("The volume of the parallelepiped: " + volumeParallelepiped);

        //17. Записать в виде инструкции присваивания формулу вычисления объема цилиндра.
        double squareCylinder = squareCircle * h;
        System.out.println("The volume of the cylinder: " + squareCylinder);

        //19. Записать в виде инструкции присваивания формулу вычисления объема конуса.
        double volumeCone = squareCircle * h / 3;
        System.out.println("The volume of the cone: " + volumeCone);

        /*21. Записать в виде инструкции присваивания формулу для вычисления тока по известным значениям напряжения и
        сопротивления электрической цепи. */
        int current = 10;
        int resistance = 25;
        int voltage = current * resistance;
        System.out.println("Падение напряжения на участке цепи равна " + voltage + " В");
    }
}
