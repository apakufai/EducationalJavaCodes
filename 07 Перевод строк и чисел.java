import java.util.*;

public class Main {
    public static void main(String[] args) {


        /* Метод toString() представляет число в виде строки */

// Вариант 1 с переменной byte

        byte ToStBy1 = 1;  // Это число типа byte
        System.out.println(ToStBy1 + " - это число типа byte");

        String ToStBy2 = Byte.toString(ToStBy1); // Это строка, преобразованная из числового значения
        System.out.println(ToStBy2 + " - это строка, преобразованная из byte");

        Byte ToStBy3 = ToStBy1;  // Это число-объект класса-обёртки Byte
        System.out.println(ToStBy3 + " - это число-объект класса-обёртки Byte");

        String ToStBy4 = ToStBy3.toString();  // Это строка, преобразованная из класса-обёртки
        System.out.println(ToStBy4 + " - это строка, преобразованная из числа-объекта");

// Вариант 2 с переменной short:

        short ToStSh1 = 22;  // Это число типа short:
        System.out.println(ToStSh1 + " - это число типа short");

        String ToStSh2 = Short.toString(ToStSh1); // Это строка, преобразованная из числового значения
        System.out.println(ToStSh2 + " - это строка, преобразованная из short:");

        Short ToStSh3 = ToStSh1;  // Это число-объект класса-обёртки Short
        System.out.println(ToStSh3 + " - это число-объект класса-обёртки Short");

        String ToStSh4 = ToStSh3.toString();  // Это строка, преобразованная из класса-обёртки
        System.out.println(ToStSh4 + " - это строка, преобразованная из числа-объекта");

// Вариант 3 с переменной int

        int ToStIn1 = 333;  // Это число типа int
        System.out.println(ToStIn1 + " - это число типа int");

        String ToStIn2 = Integer.toString(ToStIn1); // Это строка, преобразованная из числового значения
        System.out.println(ToStIn2 + " - это строка, преобразованная из int");

        Integer ToStIn3 = ToStIn1;  // Это число-объект класса-обёртки Integer
        System.out.println(ToStIn3 + " - это число-объект класса-обёртки Integer");

        String ToStIn4 = ToStIn3.toString();  // Это строка, преобразованная из класса-обёртки
        System.out.println(ToStIn4 + " - это строка, преобразованная из числа-объекта");

// Вариант 4 с переменной long

        long ToStLo1 = 4444;  // Это число типа long
        System.out.println(ToStLo1 + " - это число типа long");

        String ToStLo2 = Long.toString(ToStLo1); // Это строка, преобразованная из числового значения
        System.out.println(ToStLo2 + " - это строка, преобразованная из long");

        Long ToStLo3 = ToStLo1;  // Это число-объект класса-обёртки Long
        System.out.println(ToStLo3 + " - это число-объект класса-обёртки Long");

        String ToStLo4 = ToStLo3.toString();  // Это строка, преобразованная из класса-обёртки
        System.out.println(ToStLo4 + " - это строка, преобразованная из числа-объекта");

// Вариант 5 с переменной float

        float ToStFl1 = 5555.5F;  // Это число типа float
        System.out.println(ToStFl1 + " - это число типа float");

        String ToStFl2 = Float.toString(ToStFl1); // Это строка, преобразованная из числового значения
        System.out.println(ToStFl2 + " - это строка, преобразованная из float");

        Float ToStFl3 = ToStFl1;  // Это число-объект класса-обёртки Float
        System.out.println(ToStFl3 + " - это число-объект класса-обёртки Float");

        String ToStFl4 = ToStFl3.toString();  // Это строка, преобразованная из класса-обёртки
        System.out.println(ToStFl4 + " - это строка, преобразованная из числа-объекта");

// Вариант 6 с переменной double

        double ToStDo1 = 6666.66;  // Это число типа double
        System.out.println(ToStDo1 + " - это число типа double");

        String ToStDo2 = Double.toString(ToStDo1); // Это строка, преобразованная из числового значения
        System.out.println(ToStDo2 + " - это строка, преобразованная из double");

        Double ToStDo3 = ToStDo1;  // Это число-объект класса-обёртки Double
        System.out.println(ToStDo3 + " - это число-объект класса-обёртки Double");

        String ToStDo4 = ToStDo3.toString();  // Это строка, преобразованная из класса-обёртки
        System.out.println(ToStDo4 + " - это строка, преобразованная из числа-объекта");


        /* Метод valueOf() преобразует строку с числами в число нужного типа, и возвращает объект*/

        String a_01 = "5"; // Это строка
        String a_02 = "54"; // Это строка
        String a_03 = "543"; // Это строка
        String a_04 = "54321"; // Это строка
        String a_05 = "543.21F"; // Это строка. *Не обязательно печатать "F" после числа, чтобы Java считала float
        String a_06 = "76543.21"; // Это строка

        Byte a_1 = Byte.valueOf(a_01);         // a_1 - объект класса Byte
        byte a_2 = a_1;                        // a_2 - переменная типа byte
        System.out.println(a_1 + " " + a_2);

        Short a_3 = Short.valueOf(a_02);        // a_3 - объект класса Short
        short a_4 = a_3;                        // a_4 - переменная типа short
        System.out.println(a_3 + " " + a_4);

        Integer a_5 = Integer.valueOf(a_03);    // a_5 - объект класса Integer
        int a_6 = a_5;                          // a_6 - переменная типа int
        System.out.println(a_5 + " " + a_6);

        Long a_7 = Long.valueOf(a_04);          // a_7 - объект класса Long
        long a_8 = a_7;                         // a_8 - переменная типа long
        System.out.println(a_7 + " " + a_8);

        Float a_9 = Float.valueOf(a_05);        // a_9 - объект класса Float
        float a_10 = a_9;                       // a_10 - переменная типа float
        System.out.println(a_9 + " " + a_10);

        Double a_11 = Double.valueOf(a_06);     // a_11 - объект класса Double
        double a_12 = a_11;                     // a_12 - переменная типа double
        System.out.println(a_11 + " " + a_12);


        /* Метод parseInt() преобразует строку с числами в число нужного типа, и возвращает примитив*/

        String b_01 = "1"; // Это строка
        String b_02 = "12"; // Это строка
        String b_03 = "123"; // Это строка
        String b_04 = "12345"; // Это строка
        String b_05 = "123.45F"; // Это строка. *Не обязательно печатать "F" после числа, чтобы Java считала float
        String b_06 = "12345.67"; // Это строка

        byte b_1 = Byte.parseByte(b_01);  // b_1 - переменная типа byte
        System.out.println(b_1);

        short b_2 = Short.parseShort(b_02);  // b_2 - переменная типа short
        System.out.println(b_2);

        int b_3 = Integer.parseInt(b_03);  // b_3 - переменная типа int
        System.out.println(b_3);

        long b_4 = Long.parseLong(b_04);        // b_4 - переменная типа long
        System.out.println(b_4);

        float b_5 = Float.parseFloat(b_05);      // b_5 - переменная типа float
        System.out.println(b_5);

        double b_6 = Double.parseDouble(b_06);    // b_6 - переменная типа double
        System.out.println(b_6);

    }
}
