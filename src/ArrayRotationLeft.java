import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotationLeft {
    public static void main(String[] args) {

//TODO: Предоставлен массив элементов и число,
// представляющее количество шагов для циклической ротации.
// Ваша задача - выполнить ротацию массива вправо
// на заданное количество шагов. Это может потребовать
// использования временных переменных
// и циклов для перемещения элементов.

        int[] ninethArray = {1, 2, 3, 4, 5, 6, 7}; // здесь задаётся массив
        Scanner sc = new Scanner(System.in);
        int toMove;
        do {
            System.out.println("На сколько сдвинуть массив влево?");
            System.out.println("* Число не должно быть больше/меньше длины массива!");
            toMove = sc.nextInt();
            if (toMove <0 || toMove > ninethArray.length) {
                System.out.println("Некорректный ввод!!!");
            }
        } while (toMove <0 || toMove > ninethArray.length);

        int[] tempArr = new int [ninethArray.length];
        for (int i=0; i<=ninethArray.length-1; i++) {
            if (i+toMove > ninethArray.length-1) {
                tempArr[i] = ninethArray[i+toMove-ninethArray.length];
            }
            else {
                tempArr[i] = ninethArray[i+toMove];
            }
        }
        System.out.println(Arrays.toString(ninethArray)+" - исходный ninethArray");
        for (int j=0; j<=ninethArray.length-1; j++) {
            ninethArray[j] = tempArr[j];
        }
        System.out.println(Arrays.toString(ninethArray)+" - изменённый ninethArray");
    }
}