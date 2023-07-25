import java.util.*;

public class Main {
    public static void main(String[] args) {

// Метод "str.length()" возвращает кол-во символов строки, включая пробелы

        String word = "alpha beta gamma delta";
        int abg = word.length();
        System.out.println(abg); // 22


// Метод "str1.equals(str2)" Сравнивает строки str1 и str2 посимвольно, включая пробелы

        String eq1 = "Java";
        String eq2 = "Python";
        String eq3 = "Ja";
        String eq4 = "va";
        boolean result1 = eq1.equals(eq3 + eq4); // верное утверждение
        boolean result2 = (eq1.equals(eq2));     // ложное утверждение
        System.out.println(result1 + " " + result2); // true false


        /* Метод "indexOf()" ищет в строке заданный символ (или строку), и возвращает индекс
        его первого вхождения. Если элемент не найден, метод возвращает -1 */

        String alpha = "debugging";
        int i1 = alpha.indexOf('g'); // буква на 5-м месте в строке (счёт начинается с нуля)
        int i2 = alpha.indexOf('A'); // буквы в строке нет
        System.out.println(i1 + " " + i2); // 4 -1


        /* Получение элемента строки по его индексу методом charAt().
        Учитывать, что метод возвращает значение типа char, а не String */

        String word5 = "pairwise";

        char let_0 = word5.charAt(0); // p
        char let_1 = word5.charAt(4); // w

        System.out.println(let_0 + " " + let_1); // p w


        /* Метод "isEmpty()" возвращает false, если строка содержит какие-либо элементы,
        в том числе и пробел, и true - если строка пустая */

        String ie1 = "alpha_beta";
        String ie2 = " ";
        String ie3 = "";

        boolean va1 = ie1.isEmpty(); // ложное утверждение
        boolean va2 = ie2.isEmpty(); // ложное утверждение
        boolean va3 = ie3.isEmpty(); // верное утверждение

        System.out.println(va1 + " " + va2 + " " + va3); // false false true


        /* Метод "contains()"" проверяет, содержится ли одна строка внутри другой,
        и возвращает соответствующее логическое значение - true или false */

        String c1 = "One Two Three";
        String c2 = "One";
        String c3 = "Four";

        boolean contval1 = c1.contains(c2); // верное утверждение
        boolean contval2 = c1.contains(c3); // ложное утверждение

        System.out.println(contval1 + " " + contval2); // true false


        /* Методы  "toUpperCase()" / "toLowerCase()" приводят всю строку в верхний и нижний регистр соответственно */

        String j = "My Best Argument";

        System.out.println(j.toLowerCase()); // my best argument
        System.out.println(j.toUpperCase()); // MY BEST ARGUMENT


        /* Метод "substring()" возвращает новую строку, которая является подстрокой данной строки.
        Подстрока начинается с символа, заданного индексом, и продолжается до конца данной строки или до указанного индекса 	*/

        String str = "Integer; Long; Float; Double";
        System.out.println(str.substring(9));       //Long; Float; Double
        System.out.println(str.substring(9, 20));   //Long; Float


        /* Метод "replace()" заменяет в строке один символ на другой */

        String cap1 = "Пиши, пожалуйста, правильно";
        System.out.println(cap1.replace('о', 'а')); //Пиши, пажалуйста, правильна

    }
}