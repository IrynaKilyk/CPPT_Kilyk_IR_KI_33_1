package ki303kilyk.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас PenCase представляє пенал, який може зберігати об'єкти будь-якого типу, що реалізують Comparable.
 * @param <T> Тип елементів у пеналі, який повинен бути порівнюваним
 */
public class PenCase<T extends Comparable<T>> {

    private List<T> items;

    /**
     * Конструктор, створює порожній пенал
     */
    public PenCase() {
        items = new ArrayList<>();
    }

    /**
     * Додає елемент у пенал
     * @param item елемент для додавання
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Видаляє елемент з пеналу
     * @param item елемент для видалення
     * @return true, якщо елемент був видалений, false якщо елемент не знайдено
     */
    public boolean removeItem(T item) {
        return items.remove(item);
    }

    /**
     * Повертає максимальний елемент у пеналі
     * @return максимальний елемент або null, якщо пенал порожній
     */
    public T getMaxItem() {
        if (items.isEmpty()) return null;
        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    /**
     * Виводить всі елементи пеналу
     */
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Пенал порожнiй.");
            return;
        }
        System.out.println("Елементи пеналу:");
        for (T item : items) {
            System.out.println(item);
        }
    }

    /**
     * Повертає кількість елементів у пеналі
     * @return кількість елементів
     */
    public int getSize() {
        return items.size();
    }
}
