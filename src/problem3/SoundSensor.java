package problem3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor{
    private String sensorType;
    private double reading;
    private String location;
    private LocalTime lastUpdated;
    private int soundlevel;

    public SoundSensor(String sensorType, double reading, String location, LocalTime lastUpdated,
        int soundlevel) {
        this.sensorType = sensorType;
        this.reading = reading;
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.soundlevel = soundlevel;
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
        return (this.soundlevel > 70) ? "Sound level is too high! Turning on noise cancellation." : "Sound is within normal range.";
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
