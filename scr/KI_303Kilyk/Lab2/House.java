package KI_303Kilyk.Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Клас {@code House} моделює будинок із кімнатами, дверима та вікнами.
 * Веде журнал дій у файл та дублює повідомлення в консоль.
 */
public class House {
    private Room room;
    private Door door;
    private Window window;
    private FileWriter logWriter;

    /**
     * Конструктор за замовчуванням.
     */
    public House() throws IOException {
        this(new Room("Вітальня", 20), new Door("дерев’яні"), new Window("пластикові"));
    }

    /**
     * Повний конструктор.
     * @param room кімната
     * @param door двері
     * @param window вікно
     */
    public House(Room room, Door door, Window window) throws IOException {
        this.room = room;
        this.door = door;
        this.window = window;
        this.logWriter = new FileWriter("house_log.txt", true);
        log("Створено будинок");
    }

    // ---------- Методи роботи з дверима ----------
    public void openDoor() throws IOException {
        door.open();
        log("Двері відкрито");
    }

    public void closeDoor() throws IOException {
        door.close();
        log("Двері зачинено");
    }

    // ---------- Методи роботи з вікном ----------
    public void openWindow() throws IOException {
        window.open();
        log("Вікно відкрите");
    }

    public void closeWindow() throws IOException {
        window.close();
        log("Вікно закрите");
    }

    // ---------- Методи роботи з кімнатою ----------
    public void cleanRoom() throws IOException {
        log("Кімнату \"" + room.getName() + "\" прибрано");
    }

    public void paintWalls(String color) throws IOException {
        room.setColor(color);
        log("Стіни кімнати пофарбовано в " + color);
    }

    public void enlargeRoom(double extraArea) throws IOException {
        double newArea = room.getArea() + extraArea;
        log("Площа кімнати збільшена на " + extraArea + " м². Нова площа: " + newArea);
    }

    public void changeRoomName(String newName) throws IOException {
        log("Назву кімнати змінено з \"" + room.getName() + "\" на \"" + newName + "\"");
    }

    // ---------- Інші методи ----------
    public void describe() throws IOException {
        String info = "Будинок: " + room.getName() + " (" + room.getArea() + " м², колір стін: " + room.getColor() +
                "), двері: " + door.getType() + ", вікна: " + window.getType();
        log(info);
    }

    /**
     * Метод логування: пише повідомлення у файл і дублює в консоль.
     * @param message повідомлення
     */
    public void log(String message) throws IOException {
        String logMessage = LocalDateTime.now() + " : " + message;
        logWriter.write(logMessage + "\n");
        logWriter.flush(); // обов’язкове збереження у файл
        System.out.println(logMessage); // дублювання в консоль
    }

    /**
     * Коректно завершує роботу з файлом журналу.
     */
    public void closeLog() {
        try {
            if (logWriter != null) {
                log("Закриття журналу");
                logWriter.close();
            }
        } catch (IOException e) {
            System.err.println("Помилка при закритті файлу логів: " + e.getMessage());
        }
    }
}
