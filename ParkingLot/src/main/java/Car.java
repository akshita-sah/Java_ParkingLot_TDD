import java.util.Date;

public class Car {
    String carNumber;
    Date time;
    String driverType;
    String color;
    String brand;
    String attendant;
    Car(String carNumber, Date time, String type, String color,String brand)
    {
        this.carNumber = carNumber;
        this.time = time;
        this.driverType = type;
        this.color = color;
        this.brand = brand;
    }
}
