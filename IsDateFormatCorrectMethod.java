import java.util.Scanner;
public class IsDateFormatCorrectMethod {
    public static void main(String[] args) {

        //TODO: Напишите метод для проверки правильности формата даты
        // в строке (например, "гггг-мм-дд").

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int yearIFC = sc.nextInt();
        System.out.println("Введите месяц");
        int monthIFC = sc.nextInt();
        System.out.println("Введите день");
        int dayIFC = sc.nextInt();
        boolean format = isFormatCorrect(yearIFC, monthIFC, dayIFC);
        String answer = format ? "Правильный формат" : "Неправильный формат";
        System.out.println(answer);
    }
    public static boolean isFormatCorrect(int year, int month, int day) {
        boolean date = true;
        boolean isVis = (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
        int vis = 0;
        if (isVis) {
            vis += 1;
        }
        boolean negativeNumbers = year < 0 || month < 0 || day < 0;
        boolean isNumberLargerThanStandart = year > 9999 || month > 12 || day > 31;

        if (negativeNumbers || isNumberLargerThanStandart) { // проверка на отрицательные числа
            date = false;
        }

            switch (month) {
                case 2:
                    if (day > 28 + vis) {
                        date = false;
                    }
                    break;

                case 4, 6, 9, 11:
                    if (day > 30) {
                        date = false;
                    }
                    break;
            }
        return date;
    }
}