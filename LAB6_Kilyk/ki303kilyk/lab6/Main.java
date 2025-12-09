package ki303kilyk.lab6;

/**
 * Клас Main для перевірки роботи пеналу
 */
public class Main {
    public static void main(String[] args) {
        // Створюємо пенал для ручок
        PenCase<Pen> penPenCase = new PenCase<>();
      //  penPenCase.addItem(new Pen("Синя", 140));
        penPenCase.addItem(new Pen("Червона", 130));
        penPenCase.addItem(new Pen("Чорна", 130));

       

        System.out.println("----------------------------");

        // Створюємо пенал для олівців
       // PenCase<Pencil> pencilPenCase = new PenCase<>();
        //pencilPenCase.addItem(new Pencil("HB", 160));
       // pencilPenCase.addItem(new Pencil("2B", 155));
        System.out.println(penPenCase.getMaxItem());

      
    }
}