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

        Scanner in = new Scanner(System.in);

        System.out.print("Enter hypotenuse length: ");
        double hypotenuse = in.nextDouble();

        double side = hypotenuse / Math.sqrt(2);
        double radius = (2 * side - hypotenuse) / 2;

        System.out.printf("Result is: %.3f%n", Math.PI * radius * radius);

    }
}
