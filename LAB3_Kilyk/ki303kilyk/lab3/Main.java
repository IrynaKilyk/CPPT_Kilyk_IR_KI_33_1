package ki303kilyk.lab3;



/**
 * Головний клас для запуску програми.
 */
public class Main {
    public static void main(String[] args) {
        Room[] rooms = { new Room("Office1", 25.0), new Room("Office2", 30.0) };
        Door[] doors = { new Door("Wood"), new Door("Metal") };
        Window[] windows = { new Window("Glass"), new Window("Plastic") };

        OfficeCenter officeCenter = new OfficeCenter(rooms, doors, windows);
        officeCenter.showInfo();
        officeCenter.log("Office center created successfully");
    }
}
