package ki303kilyk.lab3;

/**
 * Клас OfficeCenter розширює House та реалізує Loggable.
 */
public class OfficeCenter extends House implements Loggable {
    public OfficeCenter(Room[] rooms, Door[] doors, Window[] windows) {
        super(rooms, doors, windows);
    }

    @Override
    public void showInfo() {
        System.out.println("Office Center Info:");
        for (Room room : rooms) {
            System.out.println("Room: " + room.getName() + ", Area: " + room.getArea());
        }
    }

    @Override
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
