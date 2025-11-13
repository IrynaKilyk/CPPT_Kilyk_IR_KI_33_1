package ki303kilyk.lab4;



/**
 * Клас {@code ExpressionCalculator} реалізує метод обчислення виразу y = tg(x) / ctg(x).
 * <p>
 * Виконує перевірку вхідних даних і може генерувати виключення при некоректних обчисленнях.
 * </p>
 *
 * @author
 *  Кілик Ірина, КІ-303
 * @version 1.0
 */
public class ExpressionCalculator {

    /**
     * Обчислює значення виразу y = tg(x) / ctg(x).
     *
     * @param x аргумент виразу (в радіанах)
     * @return результат обчислення
     * @throws ArithmeticException якщо обчислення неможливе (ділення на нуль тощо)
     */
    public static double calculate(double x) throws ArithmeticException {
        double tan = Math.tan(x);
        double cot = 1 / tan;

        if (Double.isNaN(tan) || Double.isNaN(cot) || Double.isInfinite(tan) || Double.isInfinite(cot)) {
            throw new ArithmeticException("Некоректне значення тангенса або котангенса для x = " + x);
        }

        return tan / cot;
    }
}
