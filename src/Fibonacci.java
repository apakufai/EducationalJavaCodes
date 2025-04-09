import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //TODO: Вывести числа в строку Фибоначчи до введенного пользователем
        // числа в отдельном методе и подсчитать количество

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите предельное число алгоритма Фибоначчи: ");
        int input = sc.nextInt();
        sc.close();
        String fib = Fibonacci(input);
        System.out.println(fib);
    }

    public static String Fibonacci (int end) {
        int a = 0;
        int b = 1;
        int count = 2;
        String str = "0, 1";
        while (a + b <= end) {
            int temp = a + b;
            a = b;
            b = temp;
            str = (str + ", " + b);
            count ++;
        }
        return str + "; Кол-во чисел равно " + count;
    }
}
