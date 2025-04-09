import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        System.out.println("* Знаки препинания учитываться не будут!!!");
        String input = sc.nextLine();
        sc.close();
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
        String answer = isPalindrome ? "Палиндром" : "Не палиндром";
        System.out.println(answer);
    }
}