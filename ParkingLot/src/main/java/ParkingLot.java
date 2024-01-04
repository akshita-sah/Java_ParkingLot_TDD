import java.util.ArrayList;
import java.util.Date;

public class ParkingLot {
    static ArrayList<Car>carList = new ArrayList<>(5);
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
    static boolean parkCar(Car c)
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i) == null){
                carList.add(i,c);
                return true;
            }
        }
        return false;
    }
    static boolean removeCar(String carNumber)
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i).carNumber==carNumber)
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
    static boolean parkCar(Car c,Attendant a)
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i) == null) {
                carList.add(i,c);
                System.out.println(a.id + "has successfully parked car number " + c.carNumber);
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
            if(carList.get(i)!=null && carList.get(i).carNumber == carNumber)
            {
                return i;
            }
        }
        return -1;
    }
    static Date findTimeOfArrival(String carNumber)
    {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i)!=null && carList.get(i).carNumber == carNumber)
            {
                return carList.get(i).time;
            }
        }
        return null;
    }
    static void printCars()
    {
        System.out.println(carList);
    }
    public static void main(String args[])
    {
        System.out.println("Welcome to Parking Lot System");
    }

    public int assignLot(Attendant attendant) {
        for(int i=0;i<5;i++)
        {
            if(carList.get(i) != null)
            {
                System.out.println("The car lot assigned by attendant"+attendant.id+"is : "+i);
                return i;
            }
        }
        return -1;
    }
}
