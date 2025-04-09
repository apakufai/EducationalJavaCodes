import java.util.Arrays;

public class SearchDuplicates {
    public static void main(String[] args) {

//TODO: Вам предоставляется массив элементов, и ваша задача -
// определить, есть ли дубликаты (повторяющиеся элементы) в массиве.
// Если есть, выведите информацию о том, какие элементы являются
// дубликатами и их индексы.

        int[] secondArray = {1, 5, 4, 1, 3, 7, 4, 7, 10, 1}; // здесь задаётся массив
        System.out.println(Arrays.toString(secondArray));
        for (int i=0; i<=secondArray.length-1; i++) {
            for (int j=i-1; j>=0; j--) {
                if (secondArray[i]==secondArray[j]) {
                    System.out.println(secondArray[i]+" - дубликат, индекс - "+i);
                    break;
                }
            }
        }
    }
}