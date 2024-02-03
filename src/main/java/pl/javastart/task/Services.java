package pl.javastart.task;

public class Services {
    public static void showRoomInfo(Room room) {
        System.out.println("\nPowierzchnia pomieszczenia to " + room.getArea() + "m\u00b2");
        showCurrentTemperature(room);
        System.out.println("Zainstalowana klimatyzacja: " + (room.isAirConditioning() ? "TAK" : "NIE"));
        if (room.isAirConditioning()) {
            System.out.println("Minimalna temperatura to " + room.getMinimumTemperature() + "\u00b0C");
        }
    }

    public static void showCurrentTemperature(Room room) {
        System.out.println("Aktualna temperatura to " + room.getCurrentTemperature() + "\u00b0C");
    }

    public static void lowerTemperature(Room room) {
        System.out.println("Próbuję obniżyć temperaturę o 1\u00b0C...");
        System.out.println(room.lowerTemperature() ? "Udało się!" : "Nie udało się");
        showCurrentTemperature(room);
    }
}
