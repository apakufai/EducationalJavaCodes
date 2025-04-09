import java.time.LocalDate;

public class ExLocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // получаем текущую дату

        int year = date.getYear(); // получаем текущий год
        int month = date.getMonthValue(); // получаем текущий номер месяца
        int dayOfMonth = date.getDayOfMonth(); // получаем текущий номер дня месяца

        System.out.println(date); // вывод даты (гггг.мм.дд.)
        System.out.println(year); // вывод текущего года
        System.out.println(month); // вывод текущего месяца
        System.out.println(dayOfMonth); // вывод текущего дня

        LocalDate dateExample = LocalDate.of(1914, 7, 28); // устанавливаем нужную дату

        dateExample = dateExample.plusYears(1); // прибавляем нужное кол-во лет
        dateExample = dateExample.plusMonths(1); // прибавляем нужное кол-во месяцев
        dateExample = dateExample.plusDays(1); // прибавляем нужное кол-во дней
        System.out.println(dateExample);   // 1915-08-29

        dateExample = dateExample.minusYears(1); // вычитаем нужное кол-во лет
        dateExample = dateExample.minusMonths(1); // вычитаем нужное кол-во месяцев
        dateExample = dateExample.minusDays(1); // вычитаем нужное кол-во дней
        System.out.println(dateExample);   // 1914-07-28

    }
}