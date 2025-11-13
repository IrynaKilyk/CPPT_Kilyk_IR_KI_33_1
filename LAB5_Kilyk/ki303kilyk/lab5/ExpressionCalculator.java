package ki303kilyk.lab5;

import java.io.*;

/**
 * Клас {@code ExpressionCalculator} реалізує методи обчислення виразу y = tg(x)/ctg(x)
 * та збереження/читання результатів у текстовому і двійковому форматах.
 */
public class ExpressionCalculator {

    private double lastX;
    private double lastY;

    /** Обчислює y = tg(x)/ctg(x) */
    public double calculate(double x) throws ArithmeticException {
        double tan = Math.tan(x);
        double cot = 1 / tan;

        if (Double.isNaN(tan) || Double.isNaN(cot) || Double.isInfinite(tan) || Double.isInfinite(cot)) {
            throw new ArithmeticException("Некоректне значення для x = " + x);
        }

        lastX = x;
        lastY = tan / cot;
        return lastY;
    }

    /** Запис результату у текстовий файл */
    public void writeText(String filename, String message) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(lastX + " " + lastY);
            if (message != null)
                        writer.write(message);

        }
    }

    /** Читання результату з текстового файлу */
    public void readText(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            if (line != null) {
                String[] parts = line.split(" ");
                lastX = Double.parseDouble(parts[0]);
                lastY = Double.parseDouble(parts[1]);
            }
        }
    }

    /** Запис результату у двійковий файл */
    public void writeBinary(String filename) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeDouble(lastX);
            dos.writeDouble(lastY);
        }
    }

    /** Читання результату з двійкового файлу */
    public void readBinary(String filename) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            lastX = dis.readDouble();
            lastY = dis.readDouble();
        }
    }

    /** Повертає останнє обчислене значення x */
    public double getLastX() {
        return lastX;
    }

    /** Повертає останнє обчислене значення y */
    public double getLastY() {
        return lastY;
    }
}
