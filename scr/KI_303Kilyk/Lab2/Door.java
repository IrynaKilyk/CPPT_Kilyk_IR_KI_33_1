package KI_303Kilyk.Lab2;

/**
 * Клас {@code Door} описує двері.
 */
public class Door {
    private String type;
    private boolean isOpen;

    public Door(String type) {
        this.type = type;
        this.isOpen = false;
    }

    public void open() { isOpen = true; }
    public void close() { isOpen = false; }
    public String getType() { return type; }
}
