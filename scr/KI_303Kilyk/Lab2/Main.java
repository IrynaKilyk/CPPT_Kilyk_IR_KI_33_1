package KI_303Kilyk.Lab2;

/**
 * Клас {@code Main} демонструє роботу з класом {@link House}.
 */
public class Main {
    public static void main(String[] args) {
        try {
            House house = new House();
            house.describe();
            house.openDoor();
            house.openWindow();
            house.paintWalls("блакитний");
            house.cleanRoom();
            house.enlargeRoom(5);
            house.changeRoomName("Спальня");
            house.closeDoor();
            house.closeWindow();
            house.closeLog();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
