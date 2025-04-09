import java.util.Scanner;
import java.util.Arrays;

public class AnagrammsMethod {
    public static void main(String[] args) {

        //TODO: Напишите метод для проверки areAnagrams, принимающего 2 строки, и определяющий,
        // являются ли они анаграммами (имеют одни и те же символы в разном порядке)

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String firstStr = sc.nextLine();
        System.out.println("Введите вторую строку");
        String secondStr = sc.nextLine();
        boolean isAnagramm = areAnagrams(firstStr, secondStr);
        if (isAnagramm) {
            System.out.println("Строки - анаграмма");
        } else {
            System.out.println("Строки - НЕ анаграмма");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        String str1NoSymbols = str1.replaceAll("[^A-Za-zА-ЯЁа-яё0-9]","");
        String str1ToLowerCase = str1NoSymbols.toLowerCase();
        String str2NoSymbols = str2.replaceAll("[^A-Za-zА-ЯЁа-яё0-9]","");
        String str2ToLowerCase = str2NoSymbols.toLowerCase();
        char[] arr1 = str1ToLowerCase.toCharArray();
        char[] arr2 = str2ToLowerCase.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }
    }
}
