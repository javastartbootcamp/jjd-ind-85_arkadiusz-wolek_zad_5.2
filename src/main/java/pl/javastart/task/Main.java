package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(24.0, 22.5);
        Services.showRoomInfo(room);
        Services.lowerTemperature(room);
        room = new Room(19.0, 17.5, true);
        Services.showRoomInfo(room);
        Services.lowerTemperature(room);
        Services.lowerTemperature(room);
        room = new Room(20.5, 21.5, 19.5, true);
        Services.showRoomInfo(room);
        Services.lowerTemperature(room);
        Services.lowerTemperature(room);
        Services.lowerTemperature(room);
        room.setMinimumTemperature(18.0);
        System.out.println("Obniżam minimalną temperaturę do " + room.getMinimumTemperature() + "\u00b0C");
        Services.lowerTemperature(room);
        room = new Room(21.0, 20.0, false);
        Services.showRoomInfo(room);
        Services.lowerTemperature(room);
    }
}
