package problem3;

import java.time.LocalTime;

public interface Sensor {
    String getSensorType();
    double getReading();
    String getLocation();
    LocalTime getLastUpdated();
    String performAction();
}