package com.company;
/*
10. Вычислить площадь окружности, вписанной в прямоугольный равнобедренный треугольник,
если известна длина его гипотенузы.

инфа о математической состовляющей:
https://microexcel.ru/radius-vpisannogo-v-treugolnik-kruga/#ravnobedrennyj-treugolnik](https://microexcel.ru/
radius-vpisannogo-v-treugolnik-kruga/#ravnobedrennyj-treugolnik
*/


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double hypotenuse = getDoubleFromConsole("Enter hypotenuse length");

        System.out.printf("Result is: %.3f%n", findInnerCircleSquareViaHypotenuse(hypotenuse));
    }

    public static double findInnerCircleSquareViaHypotenuse(double hypotenuse) {
        double side = hypotenuse / Math.sqrt(2);
        double radius = (2 * side - hypotenuse) / 2;
        return Math.PI * radius * radius;
    }

    public static double getDoubleFromConsole(String welcomingMassage) {
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + welcomingMassage + ": ");
        return in.nextDouble();
    }
}
