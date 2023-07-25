/*
      %s - Строковый параметр
      %b - Булевый параметр: true — если значение не null, false — если null
      %c - Символ Unicode (char)
      %d - Целое число (int. byte, short, int, long, BigInteger)
      %f - Число с плавающей запятой
      %e - Числа с плавающей запятой в экспоненциальном представлении
      %a - Числа с плавающей запятой, представленные в шестнадцатеричном виде
      %x - Передается целое число (int. byte, short, int, long, BigInteger), результатом форматирования будет символ под данным номером в таблице ASCII
      %o - Принимается целое число (int. byte, short, int, long, BigInteger), которое будет представлено в виде восьмеричного числа
      %n - Разделитель строк для конкретной платформы. Аналог \n
*/

/*
      Дано трехзначное число. Найти:
      - число единиц в нем;
      - число десятков в нем;
      - сумму его цифр;
      - произведение его цифр.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int number = 173;
        int e = number % 10;
        int d = number / 10 % 10;
        int s = number / 100;

        System.out.println(number + " = " + s + " x 100 + " + d + " x 10 + " + e);
        System.out.printf("%d = %d x 100 + %d x 10 + %d\n", number, s, d, e);
        System.out.println("Сумма цифр числа " + number + " равна " + (s + e + d));
        System.out.println("Произведение цифр числа " + number + " равно " + (s * e * d));
    }
}