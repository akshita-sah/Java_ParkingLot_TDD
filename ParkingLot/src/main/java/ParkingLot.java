import java.util.ArrayList;

public class ParkingLot {
    static ArrayList<String>carList = new ArrayList<>(5);
    static boolean parkCar(String carNumber)
    {
        carList.add(carNumber);
        return true;
    }
    static boolean removeCar(String carNumber)
    {
        carList.remove(carNumber);
        printCars();
        return true;
    }
    static boolean findCapacity()
    {
        if(carList.size() == 5)
            return false;
        else return true;
    }
    static boolean notifyFull()
    {
        if(carList.size() == 5) {
            return false;
        }
        else
        {
            System.out.println("Remove the full sign");
            return true;
        }
    }
    static void printCars()
    {
        System.out.println(carList);
    }
    public static void main(String args[])
    {
        System.out.println("Welcome to Parking Lot System");
    }
}
