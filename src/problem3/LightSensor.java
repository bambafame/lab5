package problem3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor{
    private String sensorType;
    private double reading;
    private String location;
    private LocalTime lastUpdated;
    private int lightLevel;

    public LightSensor(String sensorType, double reading, String location, LocalTime lastUpdated,
        int lightLevel) {
        this.sensorType = sensorType;
        this.reading = reading;
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.lightLevel = lightLevel;
    }

    @Override
    public String getSensorType() {
        return sensorType;
    }

    @Override
    public double getReading() {
        return reading;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public LocalTime getLastUpdated() {
        return this.lastUpdated;
    }

    @Override
    public String performAction(){
        return (this.lightLevel < 100) ? "Light level is too low! Turning on the lights" : "Light is sufficient";
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return "SensorType: " + sensorType +
            "\nReading: " + this.reading +
            "\nLocation: " + this.location +
            "\nLastUpdated: " + this.lastUpdated.format(formatter) +
            "\nAction: " + this.performAction();
    }
}
