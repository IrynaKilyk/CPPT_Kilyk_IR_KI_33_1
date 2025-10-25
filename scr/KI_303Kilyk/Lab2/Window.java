package KI_303Kilyk.Lab2;

/**
 * Клас {@code Window} описує вікно.
 */
public class Window {
    private String type;
    private boolean isOpen;

    public Window(String type) {
        this.type = type;
        this.isOpen = false;
    }

    public void open() { isOpen = true; }
    public void close() { isOpen = false; }
    public String getType() { return type; }
}
