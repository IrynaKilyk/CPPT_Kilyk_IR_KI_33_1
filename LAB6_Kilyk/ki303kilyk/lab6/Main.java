package ki303kilyk.lab6;

/**
 * Клас Main для перевірки роботи пеналу
 */
public class Main {
    public static void main(String[] args) {
        // Створюємо пенал для ручок
        PenCase<Pen> penPenCase = new PenCase<>();
        penPenCase.addItem(new Pen("Синя", 140));
        penPenCase.addItem(new Pen("Червона", 150));
        penPenCase.addItem(new Pen("Чорна", 130));

        penPenCase.displayItems();
        System.out.println("Найдовша ручка: " + penPenCase.getMaxItem());

        System.out.println("----------------------------");

        // Створюємо пенал для олівців
        PenCase<Pencil> pencilPenCase = new PenCase<>();
        pencilPenCase.addItem(new Pencil("HB", 160));
        pencilPenCase.addItem(new Pencil("2B", 155));

        pencilPenCase.displayItems();
        System.out.println("Найдовший олiвець: " + pencilPenCase.getMaxItem());
    }
}