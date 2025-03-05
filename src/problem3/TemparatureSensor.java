package problem3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor{
    private String sensorType;
    private double reading;
    private String location;
    private LocalTime lastUpdated;
    private int temperature;

    public TemparatureSensor(String sensorType, double reading, String location,
        LocalTime lastUpdated,
        int temperature) {
        this.sensorType = sensorType;
        this.reading = reading;
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.temperature = temperature;
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
        if(this.temperature > 30) return "Temperature level is too high! Turning on the AC.";
        else if (this.temperature < 18) return "Temperature level is too low! Turning on the Heater.";
        else return "Temperature is in normal range.";
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
