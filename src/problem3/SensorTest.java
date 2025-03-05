package problem3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SensorTest {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];
        sensors[0] = new TemparatureSensor("Temperature", 25.0, "Living Room", LocalTime.now(), 25);
        sensors[1] = new LightSensor("Light", 120.0, "Bathroom", LocalTime.now(), 120);
        sensors[2] = new SoundSensor("Sound", 65.0, "Bedroom", LocalTime.now(), 65);;
        sensors[3] = new TemparatureSensor("Temperature", 17.0, "Garden", LocalTime.now(), 17);
        sensors[4] = new LightSensor("Light", 80.0, "Garden", LocalTime.now(), 80);

        for (Sensor sensor : sensors) {
            System.out.println(sensor + "\n");
        }
    }
}
