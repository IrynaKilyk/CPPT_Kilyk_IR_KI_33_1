package ki303kilyk.lab4;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Головний клас-драйвер для демонстрації роботи {@link ExpressionCalculator}.
 * <p>
 * Зчитує значення x з клавіатури, обчислює результат і записує його у файл.
 * </p>
 */
public class Main {

    /**
     * Точка входу в програму.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введiть значення x (у радiанах): ");

        try {
            double x = scanner.nextDouble();

            double y = ExpressionCalculator.calculate(x);
            System.out.println("Результат обчислення y = " + y);

            // Запис результату у файл
            try (FileWriter writer = new FileWriter("result_lab4.txt")) {
                writer.write("Вхідне значення x = " + x + "\n");
                writer.write("Результат y = tg(x)/ctg(x) = " + y + "\n");
                System.out.println("Результат записано у файл result_lab4.txt");
            }

        } catch (ArithmeticException e) {
            System.out.println("Помилка обчислення: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася непередбачена помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
