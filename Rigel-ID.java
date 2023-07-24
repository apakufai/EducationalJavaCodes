// Для получения диаметра ригеля ввести нужные AR и WD через пробел с одним знаком после запятой

import java.util.Scanner;

class Rigel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double AR = sc.nextDouble();
        double WD = sc.nextDouble();
        double ID = (AR / WD);
        System.out.println("Внутренний диаметр звеньев - " + ID);
    }
}