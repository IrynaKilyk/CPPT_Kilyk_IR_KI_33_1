package ki303kilyk.lab6;

/**
 * Клас Pen представляє ручку
 */
public class Pen implements Comparable<Pen> {
    private String color;
    private int length; // довжина ручки в мм

    public Pen(String color, int length) {
        this.color = color;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int compareTo(Pen other) {
        return Integer.compare(this.length, other.length); // порівнюємо за довжиною
    }

    @Override
    public String toString() {
        return "Ручка {колiр=" + color + ", довжина=" + length + "мм}";
    }
}