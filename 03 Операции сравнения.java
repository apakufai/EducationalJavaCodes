import java.util.*;

public class Main {
    public static void main(String[] args) {

        // логические эквивалентности

        int a = 100;
        int b = 50;
        int c = b + 50;
        boolean a1 = a > b;	// больше
        boolean a2 = b < a;	// меньше
        boolean a3 = a >= c;	// больше или равно
        boolean a4 = a <= c;	// меньше или равно
        boolean a5 = a == c;	// равно
        boolean a6 = a != b;	// не равно


        System.out.println (a1);
        System.out.println (a2);
        System.out.println (a3);
        System.out.println (a4);
        System.out.println (a5);
        System.out.println (a6);


        /*
        Булевы переменные

        	! - логические "НЕ", инверсия (логическое отрицание, ¬)
        	& - логическое "И", конъюнкция (логическое умножение, ˄)
        	^ - логическое "исключающее ИЛИ"
        	| - логическое "ИЛИ", дизъюнкция (логическое сложение, ˅)


        	&& - Условние "И", сокращённое логическое "И"
        	|| - Условние "ИЛИ", сокращённое логическое "ИЛИ"
        */

        int e = 30;
        int f = 50;

        boolean b1 = e < f; // true-утверждение
        boolean b2 = e > f; // false-утверждение
        boolean b3 = e != f; // true-утверждение
        boolean b4 = e == f; // false-утверждение

        boolean x1 = b1 & b3; // конъюнкция

        boolean x2 = b1 | b2; // дизъюнкция, первое утверждение верно, второе - ложно
        boolean x3 = b4 | b3; // дизъюнкция, первое утверждение ложно, второе - верно
        boolean x4 = b1 | b3; // дизъюнкция, оба утверждения верны

        boolean x5 = b1 ^ b2; // разделительная (строгая) дизъюнкция, первое утверждение верно, второе - ложно
        boolean x6 = b4 ^ b3; // разделительная (строгая) дизъюнкция, первое утверждение ложно, второе - верно

        System.out.println (x1);
        System.out.println (x2);
        System.out.println (x3);
        System.out.println (x4);
        System.out.println (x5);
        System.out.println (x6);

    }
}