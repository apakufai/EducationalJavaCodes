import java.util.Scanner;

public class PalindromeBooleanMethod {
    public static void main(String[] args) {

        //TODO: Напишите метод isPalindrome с помощью регулярных выражений и методов String.
        // Можете пользоваться своими наработками, а можете создать с нуля и посмотреть,
        // как вы выросли. Вызывать в главном методе, передавая строчку на проверку.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку для проверки");
        String firstStr = sc.nextLine();
        boolean Palindrome = isPalindrome(firstStr);
        String answer = Palindrome ? "Палиндром" : "Не палиндром";
        System.out.println(answer);
    }


    public static boolean isPalindrome(String input) {
        String strNoSymbols = input.replaceAll("[^A-Za-zА-ЯЁа-яё0-9]","");
        String strToLowerCase = strNoSymbols.toLowerCase();
        int length = strToLowerCase.length();
        boolean isPalindrome = true;
        for (int i=0; i<=(length/2); i++) {
            if (strToLowerCase.charAt(i) != strToLowerCase.charAt(length-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}



