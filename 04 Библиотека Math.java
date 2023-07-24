import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Вывод числа Пи

        double pi = Math.PI;
        System.out.println(pi);

        // Вывод синуса, косинуса, тангенса

        double result1 = Math.sin(45);
        System.out.println(result1);

        double result2 = Math.cos(45);
        System.out.println(result2);

        double result3 = Math.tan(45);
        System.out.println(result3);

        // Вывод 3 в степени 4

        double result4 = Math.pow(3, 4);
        System.out.println(result4);

        // Вывод квадратного корня из числа

        double result5;
        result5 = Math.sqrt(25);
        System.out.println(result5);


        System.out.println(Math.log10(100)); // вывод логарифма

        System.out.println(Math.log(Math.E)); // вывод экспоненты


        // Метод "Math.max" выводит наибольшее из двух чисел
        // Метод "Math.min" выводит наименьшее из двух чисел

        int a = 1;
        int b = 5;
        int c = Math.max(a, b);
        int d = Math.min(a, b);
        System.out.println(c + "..." + d);


        // Метод "Math.abs" выводит абсолютную величину (или модуль) числа

        int e = -10;
        int f = -25;
        int g = Math.abs(e);
        int h = Math.abs(f);
        System.out.println(Math.max(g, h)); // 25

        /* Метод "Math.pow" – возводит значение первого аргумента в степень второго аргумента
        !!! Для вывода на экран целого значения используется "printf" и "%.0f",
        так как метод возвращает значение double
        */

        int i = 2;
        int j = 3;
        System.out.printf("Число " + i + " в степени " + j + " равно %.0f \n", Math.pow(i, j)); // 8

    }
}