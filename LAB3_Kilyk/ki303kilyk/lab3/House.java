package ki303kilyk.lab3;

/**
 * Абстрактний суперклас House представляє будівлю.
 */
public abstract class House {
    protected Room[] rooms;
    protected Door[] doors;
    protected Window[] windows;

    public House(Room[] rooms, Door[] doors, Window[] windows) {
        this.rooms = rooms;
        this.doors = doors;
        this.windows = windows;
    }

    public abstract void showInfo();
}
