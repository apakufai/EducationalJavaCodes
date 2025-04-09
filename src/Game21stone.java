import java.util.Scanner;
import java.util.Random;

public class Game21stone {

//TODO: 2 игрока. 21 камень. За 1 ход можно взять от 1 до 3 камней
// Камни берем по очереди. Выиграл тот, кто забрал последние камни.
// Как выиграть, если ходишь первым?

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру!");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int countOfStones = 21; // установка кол-ва камней
        int isHint = 0; // инициализатор подсказок
        int playerTurn; // ход игрока
        int cpuTurn; // ход компьютера
        System.out.println(" * Если хотите играть с подсказками, введите 1");
        isHint = sc.nextInt(); // вкл/выкл подсказок
        System.out.println("На игровом поле есть 21 камень.");
        System.out.println("Каждый из двух игроков берёт от 1 до 3 камней.");
        System.out.println("Выигрывает тот, кто возьмёт последний камень.");
        System.out.println("Первый ход за Вами.");




        //////////////////////////////////////   ОБРАЩЕНИЕ К ИГРОКУ + ПОДСКАЗКИ

        do {
            System.out.println("\nСколько камней взять?");

            if (isHint == 1) {

                if (countOfStones > 4) {

                    if ((countOfStones % 4) == 3 || (countOfStones % 4) == 2) {
                        System.out.println(" * Подсказка: возьмите " + countOfStones % 4 + " камня");
                    }
                    if ((countOfStones % 4) == 1) {
                            System.out.println(" * Подсказка: возьмите 1 камень");
                    }
                    if ((countOfStones % 4) == 0) {
                        System.out.println(" * Подсказка: возьмите 1 камень (положение опасное!)");
                        // если надо пропустить ход с минимальной потерей камней
                    }
                }

                if (countOfStones == 4) {
                    System.out.println(" * Сколько бы камней Вы не взяли, компьютер выиграет эту партию");
                }
                if (countOfStones < 4) {
                        System.out.println(" * Подсказка: возьмите оставшееся кол-во камней");
                }
            }

            //////////////////////////////////////   ХОД ИГРОКА
            do {
                playerTurn = sc.nextInt();
                if (playerTurn != 1 && playerTurn != 2 && playerTurn != 3) {
                    System.out.println("Соблюдайте правила! Берите 1, 2 или 3 камня!");
                }
                if (countOfStones - playerTurn < 0 && (playerTurn >= 1 && playerTurn <= 3)) {
                    System.out.println("Слишком много! Осталось только " + countOfStones);
                }
            } while ((playerTurn < 1 || playerTurn > 3) || countOfStones - playerTurn < 0);

            if (countOfStones - playerTurn == 0) {
                System.out.println("Вы выиграли! Партия завершена");
                break;
            } else {
                countOfStones -= playerTurn;
                if (playerTurn == 2 || playerTurn == 3) {
                    System.out.println("Вы взяли "+playerTurn+" камня, осталось " + countOfStones);
                } else {
                    System.out.println("Вы взяли 1 камень, осталось " + countOfStones);
                }
            }


                //////////////////////////////////////   ХОД КОМПЬЮТЕРА
                if (countOfStones >= 1 && countOfStones <= 3) {
                    cpuTurn = countOfStones;
                    if (cpuTurn == 1) {
                        System.out.println("\nКомпьютер взял 1 камень, осталось 0");
                    } else {
                        System.out.println("\nКомпьютер взял " + cpuTurn + " камня, осталось 0");
                    }
                    System.out.println("\nКомпьютер выиграл. Партия завершена");
                    break;
                } else {
                    cpuTurn = random.nextInt(1, 4); // ход компьютера (от 1 до 3)

                countOfStones -= cpuTurn;

                if (cpuTurn == 1) {
                    System.out.print("\nКомпьютер взял 1 камень,");
                } else {
                    System.out.print("\nКомпьютер взял " + cpuTurn + " камня,");
                }
                System.out.println(" осталось " + countOfStones);
                }
        } while (countOfStones > 0);
        }
    }

/*
    Тесты:
    - Проверка с подсказками на победу игрока
    - Проверка без подсказок на победу компьютера и предупреждение о патовой ситуации
(поставить 4 в строке кол-ва камней, ввести поочерёдно 1, 2 и 3 на каждый запуск)
    - Проверка некорректного ввода
(поставить 4 в строке кол-ва камней, ввести поочерёдно 0 и 4)
    - Проверка на отр.числа (поставить 1 или 2 в строке кол-ва камней, вбить в консоль 2 или 3, или 3 соответственно)
 */