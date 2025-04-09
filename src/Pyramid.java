import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество уровней: ");
        int levels = sc.nextInt();
        System.out.println();
        sc.close();
        for (int i=levels;i>0;i--) {
            for (int p = 0; p < i-1; p++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(levels-i)+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}