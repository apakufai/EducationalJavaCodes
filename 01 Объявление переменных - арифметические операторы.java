// Объявление переменных - арифметические операторы

/*
	+ (операция сложения)
	- (операция вычитания)
	* (умножение)
	/ (деление)
	% (получение остатка от деления)
	++ (инкремент, постфиксный и префиксный (или инфиксный))
	-- (декремент, постфиксный и префиксный (или инфиксный))

	x += y - то же самое, что и x = x + y
	x -= y - то же самое, что и x = x - y
	x *= y - то же самое, что и x = x * y
	x /= y - то же самое, что и x = x / y
	x %= y - то же самое, что и x = x % y
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int a = 20;
        int b = 7;

        int result1 = a + b;
        System.out.println(result1);    // 27 - сложение

        int result2 = a - b;
        System.out.println(result2);    // 13 - вычитание

        int result3 = a * b;
        System.out.println(result3);    // 140 - умножение

        int result4 = a / b;
        System.out.println(result4);    // 2 - деление, вывод без остатка

        int result5 = a % b;
        System.out.println(result5);    // 6 - деление, вывод остатка после деления


// Объявление переменных - сложение и вычитание разными способами

        // Сложение

        int x = 50;

        x++;
        System.out.println(x);    // 51
        x = x + 2;
        System.out.println(x);    // 53
        x += 3;
        System.out.println(x);    // 56


        // Вычитание

        int y = 50;

        y--;
        System.out.println(y);    // 49
        y = y - 2;
        System.out.println(y);    // 47
        y -= 3;
        System.out.println(y);    // 44


        // Умножение

        int z = 50;

        z = z * 2;
        System.out.println(z);    // 100
        z *= 3;
        System.out.println(z);    // 300


        // Деление

        int с = 50;

        с = с / 2;
        System.out.println(с);    // 25
        с /= 5;
        System.out.println(с);    // 5


        // Приоритет операций, действия со скобками

        int d = 10;
        int e = 20;
        int f = 30;

        int res1 = d + e * f;
        int res2 = (d + e) * f;

        System.out.println(res1); // 610
        System.out.println(res2); // 900


        // Префиксный и постфиксный инкременты

        int X = 5;
        int Y = 3;
        int Z = ++X;
        // Z = 5+1 = 6, так как X = 5+1 = 6
        System.out.println(X + " " + Y + " " + Z); // 6 3 6
        Y += X--;
        // X = 6-1 = 5
        // Y = 3+6 = 9 (инкремент постфиксный, значение X берётся из предыдущего примера)
        // Z = 6
        System.out.println(X + " " + Y + " " + Z); // 5 9 6
        Z += --X + Y++;
        // X = 5-1 = 4 (декремент префиксный, значение X будет браться из этого результата)
        // Y = 9+1 = 10 (инкремент постфиксный, значение Y берётся из предыдущего примера)
        // Z = 6+4+9 = 19
        System.out.println(X + " " + Y + " " + Z); // 4 10 19

    }
}
