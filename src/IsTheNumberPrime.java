import java.util.Scanner;
public class IsTheNumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        sc.close();
        boolean isPrime=true;
        int proverka;
        for (int i=2; i<=a/2; i++) {
            proverka = a % i;
            if (proverka == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(a + " - простое число");
        } else {
            System.out.println(a + " - составное число");
        }
    }
}