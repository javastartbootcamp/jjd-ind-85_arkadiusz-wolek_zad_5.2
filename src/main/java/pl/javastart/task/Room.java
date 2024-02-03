package pl.javastart.task;

public class Room {
    private double area;
    private double currentTemperature;
    private double minimumTemperature;
    boolean airConditioning;

    public Room(double area, double currentTemperature) {
        this.area = area;
        this.currentTemperature = currentTemperature;
    }

    public Room(double area, double currentTemperature, boolean airConditioning) {
        this(area, currentTemperature);
        this.airConditioning = airConditioning;
        if (airConditioning) {
            this.minimumTemperature = 16.0;
        }
    }

    public Room(double area, double currentTemperature, double minimumTemperature, boolean airConditioning) {
        this(area, currentTemperature);
        this.airConditioning = airConditioning;
        if (airConditioning) {
            this.minimumTemperature = minimumTemperature;
        }
    }

    public double getArea() {
        return area;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getMinimumTemperature() {
        return minimumTemperature;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setMinimumTemperature(double minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public boolean lowerTemperature() {
        boolean lowerTemperatureSuccessful = false;
        if (!airConditioning) {
            return lowerTemperatureSuccessful;
        }
        if (currentTemperature - 1.0 >= minimumTemperature) {
            currentTemperature -= 1.0;
            lowerTemperatureSuccessful = true;
        } else {
            currentTemperature = minimumTemperature;
        }
        return lowerTemperatureSuccessful;
    }
}
