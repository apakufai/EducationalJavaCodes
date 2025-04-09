public class TowerOfHanoi {
    public static void main(String[] args) {
        int countOfDisks = 5; // кол-во колец
        Movement(countOfDisks, 'А', 'Б', 'В');
    }
    public static void Movement(int disksOnRodA, char from, char helper, char to) {
        if (disksOnRodA == 1) {
            System.out.println("Диск 1 со стержня " + from + " на стержень " + to);
        } else {
            Movement(disksOnRodA - 1, from, to, helper);
            System.out.println("Диск " + disksOnRodA + " со стержня " + from + " на стержень " + to);
            Movement(disksOnRodA - 1, helper, from, to);
        }
    }
}