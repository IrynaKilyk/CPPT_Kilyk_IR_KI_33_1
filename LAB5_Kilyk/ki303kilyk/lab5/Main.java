package ki303kilyk.lab5;

import java.io.IOException;
import java.util.Scanner;

/** Тестова програма для ExpressionCalculator */
public class Main {
    public static void main(String[] args) throws IOException {
        ExpressionCalculator calc = new ExpressionCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть x у радiанах: ");
        double x = scanner.nextDouble();

        try {
            double y = calc.calculate(x);
            System.out.println("Результат y = " + y);

            // Текстовий файл
            String textFile = "result.txt";
            calc.writeText(textFile, "");
            System.out.println("Результат записано у текстовий файл: " + textFile);

            // Двійковий файл
            String binFile = "result.bin";
            calc.writeBinary(binFile);
            System.out.println("Результат записано у двiйковий файл: " + binFile);

            // Зчитування для перевірки
            ExpressionCalculator calc2 = new ExpressionCalculator();
            calc2.readText(textFile);
            System.out.println("Прочитано з текстового файлу: x=" + calc2.getLastX() + ", y=" + calc2.getLastY());

            calc2.readBinary(binFile);
            System.out.println("Прочитано з двiйкового файлу: x=" + calc2.getLastX() + ", y=" + calc2.getLastY());

        } catch (ArithmeticException e) {
            String textFile = "result.txt";
            calc.writeText(textFile, "Результат записано у текстовий файл: ");
            System.out.println("Результат записано у текстовий файл: " + textFile);
        } catch (IOException e) {
            System.out.println("Помилка файлу: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
