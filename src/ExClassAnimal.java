public class ExClassAnimal { // название класса
    String kind = "Default"; // объявление поля "вид", значение по умолчанию
    String name = "No name"; // объявление поля "имя", значение по умолчанию
    int age = 0; // объявление поля "возраст", значение по умолчанию

    public static void main(String[] args) {

        ExClassAnimal dog1 = new ExClassAnimal("Собака", "Тазик", 3); // создание первого объекта
        // по конструктору Animal

        ExClassAnimal cat1 = new ExClassAnimal("Кот", "Сосиска", 2); // создание второго объекта
        // по конструктору Animal

        ExClassAnimal mouse1 = new ExClassAnimal("Мышь", "Картошка", 1); // создание третьего объекта
        // по конструктору Animal

        ExClassAnimal ghost1 = new ExClassAnimal(); // создание четвёртого объекта по дополнительному
        // конструктору Animal без ввода переменных. Компилятор сам выбрал именно вспомогательный класс,
        // и задал полям значения по умолчанию.
        ghost1.kind = "Неизвестный науке зверь"; // инициализация параметра "имя" у объекта "ghost1" вручную

        dog1.tellMeAboutIt(); // вызов метода "tellMeAboutIt", который выполняется
        // с параметрами первого объекта Animal (dog1)

        cat1.tellMeAboutIt(); // вызов метода "tellMeAboutIt", который выполняется
        // с параметрами второго объекта Animal (cat1)

        mouse1.tellMeAboutIt(); // вызов метода "tellMeAboutIt", который выполняется
        // с параметрами третьего объекта Animal (mouse1)

        ghost1.tellMeAboutIt(); // вызов метода "tellMeAboutIt", который выполняется
        // с параметрами четвёртого объекта Animal (ghost1)
    }

    public ExClassAnimal (String kind, String name, int age) { // конструктор класса с параметрами "вид", "имя", "возраст"
        this.kind = kind; // инициализация параметра "вид" через обращение к полю "вид"
        this.name = name; // инициализация параметра "имя" через обращение к полю "имя"
        this.age = age; // инициализация параметра "возраст" через обращение к полю "возраст"
    }

    public ExClassAnimal () { // дополнительный конструктор, выводящий значение по умолчанию из класса Animal,
        // если в классе Main в новом объекте не введён ни один параметр
    }

    public void tellMeAboutIt () { // метод (функция) класса, выводящий(-ая) заданную
        // в методе информацию при обращении к нему
        System.out.println("\n"+ kind + " по кличке " + name + ", полных лет - " + age + ".");
    }
}