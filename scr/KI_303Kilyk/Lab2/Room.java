package KI_303Kilyk.Lab2;

/**
 * Клас {@code Room} описує кімнату будинку.
 */
public class Room {
    private String name;
    private double area;
    private String color;

    public Room(String name, double area) {
        this.name = name;
        this.area = area;
        this.color = "білий";
    }

    public String getName() { return name; }
    public double getArea() { return area; }
    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }
}
