import java.util.Date;

public class Car {
    String carNumber;
    Date time;
    String driverType;
    String color;
    Car(String carNumber, Date time, String type, String color)
    {
        this.carNumber = carNumber;
        this.time = time;
        this.driverType = type;
        this.color = color;
    }
}
