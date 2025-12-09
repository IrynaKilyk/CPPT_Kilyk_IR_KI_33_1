package ki303kilyk.lab6;

/**
 * Клас Pencil представляє олівець
 */
public class Pencil implements Comparable<Pencil> {
    private String hardness;
    private int length; // довжина олівця в мм

    public Pencil(String hardness, int length) {
        this.hardness = hardness;
        this.length = length;
    }

    public String getHardness() {
        return hardness;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int compareTo(Pencil other) {
        return this.length;//Integer.compare(this.length, other.length); // порівнюємо за довжиною
    }

    @Override
    public String toString() {
        return "Олiвець {твердiсть=" + hardness + ", довжина=" + length + "мм}";
    }
}