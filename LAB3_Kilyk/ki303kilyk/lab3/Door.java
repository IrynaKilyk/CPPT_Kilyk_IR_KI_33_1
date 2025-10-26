package ki303kilyk.lab3;

/**
 * Клас Door представляє двері в будівлі.
 */
public class Door {
    private final String type;
    private boolean isOpen;

    public Door(String type) {
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
