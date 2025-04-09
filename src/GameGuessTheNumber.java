import java.util.Random;
import java.util.Scanner;
 public class GameGuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру 'Угадай число'!");
        System.out.println("Попробуйте угадать число от 1 до 100.");
        Scanner sc = new Scanner(System.in);
        Random input = new Random();
        final int r = input.nextInt(1, 101);
        int a;
        do {
            System.out.print("Введите вашу догадку: ");
            a = sc.nextInt();
            if (a<=0||a>=101) {
                System.out.println("Некорректный ввод!");
            } else {

                if (a>r) {
                    System.out.println("Слишком большое число. Попробуйте ещё раз.");
                }  else if (a<r) {
                    System.out.println("Слишком маленькое число. Попробуйте ещё раз.");
                }  else if (a==r) {
                    System.out.println("Поздравляем! Вы угадали число "+a+"!");
                }

            }

        }
        while (a!=r);
        sc.close();
    }
}