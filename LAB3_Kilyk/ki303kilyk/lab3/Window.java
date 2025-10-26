package ki303kilyk.lab3;

/**
 * Клас Window представляє вікно в будівлі.
 */
public class Window {
    private final String type;
    private boolean isOpen;

    public Window(String type) {
        this.type = type;
        this.isOpen = false;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getType() {
        return type;
    }
}
