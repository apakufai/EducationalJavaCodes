import java.util.Scanner;
public class PrimeNumbersRange {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите начало диапазона (от нуля)");
            a = sc.nextInt();
            if (a<0) {
                System.out.println("Некорректный ввод!");
            }
        }
        while (a<0);

        do {
            System.out.println("Введите конец диапазона");
            b = sc.nextInt();
            if (b<=a) {
                System.out.println("Некорректный ввод!");
            }
        }
        while (b<=a);
        sc.close();

        System.out.println("Простые числа в диапазоне от "+a+" до "+b+":");
        for (int i = a; i <= b; i++) {
            boolean isPrime = i > 2;
            for (int j=2; j<i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i+" ");
            }
        }
    }
}