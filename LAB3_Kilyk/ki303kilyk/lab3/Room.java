package ki303kilyk.lab3;

/**
 * Клас Room представляє кімнату в будівлі.
 */
public class Room {
    private final String name;
    private final double area;

    public Room(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }
}
