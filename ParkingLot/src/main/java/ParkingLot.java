import java.util.ArrayList;

public class ParkingLot {
    static ArrayList<String>carList = new ArrayList<>(5);
    ParkingLot()
    {
        if(carList.size()==0)
        {
            for(int i=0;i<5;i++)
            {
                carList.add(i,null);
            }
        }
    }
    static boolean parkCar(String carNumber)
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i) == null){
                carList.add(i,carNumber);
                return true;
            }
        }
        return false;
    }
    static boolean removeCar(String carNumber)
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i)==carNumber)
            {
                carList.add(i,null);
                return true;
            }
        }
        return false;
    }
    static boolean findCapacity()
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i) == null)
                return true;
        }
        return false;
    }
    static boolean notifyFull()
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i) == null) {
                System.out.println("Remove the full sign");
                return true;
            }
        }
        return false;
    }
    static boolean parkCar(String carNumber,Attendant a)
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i) == null) {
                carList.add(i,carNumber);
                System.out.println(a.id + "has successfully parked car number " + carNumber);
                return true;
            }
        }
        System.out.println("Parking full");
        return false;
    }
    static int findCar(String carNumber)
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i) == carNumber)
            {
                return i;
            }
        }
        return -1;
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
