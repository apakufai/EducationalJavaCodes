import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Если год датируется после нашей эры, нажмите 1");
        System.out.println("Если год датируется до нашей эры, нажмите 2");
        int ourEra = sc.nextInt();

        if (ourEra==1||ourEra==2) {
            System.out.println("Введите год");
        } else {
            System.out.println("Некорректный ввод");
        }

        boolean vis = false;

        if (ourEra == 1)  {
            int a = sc.nextInt();
            sc.close();
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    vis = true;
                }
            } else {
                if (a % 4 == 0){
                    vis = true;
                }
            }
            if (vis) {
                System.out.println("Год " + a + " - високосный");
            }
            else {
                System.out.println("Год " + a + " - не високосный");
            }
        }

        if (ourEra == 2) {
            int a = sc.nextInt();
            sc.close();
            if (a<0) {
                System.out.println("Некорректный ввод");
            } else if (a<=45 & a>=9) {
                if (a % 3 == 0) {
                    vis = true;
                }
            }
            if (vis) {
                System.out.println("Год " + a + " - високосный");
            }
            else {
                System.out.println("Год " + a + " - не високосный");
            }
        }

        sc.close();
    }
}