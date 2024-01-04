import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

public class ParkingLotTest {
    /* UC - 1, given car park it and return true  */
    @Test
    public void givenCar_ParkTheCar_ReturnTrue(){
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertEquals(true,parkingLot.parkCar(new Car("1",new java.util.Date())));
    }
    @Test
    /* UC - 2, unpark car */
    public void givenParkNumber_RemoveCar_ReturnTrue(){
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertEquals(true,parkingLot.parkCar(new Car("123",new java.util.Date())));
        Assert.assertEquals(true,parkingLot.removeCar("123"));
    }
    @Test
    /* UC 3, find if car is full, UC 4 - To alert full */
    public void givenCapacity_CheckLotFull_ReturnFullOrNot()
    {
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertTrue(parkingLot.findCapacity());
    }
    @Test
    /* UC 5 - notify to remove full sign*/
    public void givenCapacity_CheckFull_NotifyToRemoveFullSign()
    {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.parkCar(new Car("2",new java.util.Date()));
        parkingLot.parkCar(new Car("3",new java.util.Date()));
        parkingLot.parkCar(new Car("4",new java.util.Date()));
        parkingLot.parkCar(new Car("5",new java.util.Date()));
        Assert.assertFalse(parkingLot.notifyFull());
        parkingLot.removeCar("2");
        Assert.assertTrue(parkingLot.notifyFull());
    }
    @Test
    /*UC 6 - assign attendant*/
    public void givenCar_AssignAttendant_ParkCar()
    {
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertTrue(parkingLot.parkCar(new Car("6",new java.util.Date()),new Attendant("1")));
    }
    /*UC 7 - find car*/
    @Test
    public void givenCarNumber_FindCar_ReturnLot()
    {
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertEquals(3,parkingLot.findCar("3"));
    }
    /*UC 8- Find charge*/
    @Test
    public void givenCar_FindCharge_ReturnTimeOfArrival()
    {
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertNotNull(parkingLot.findTimeOfArrival("1"));
    }
    /* UC 9 - Attendant to direct people */
    @Test
    public void givenCarAttendant_AssignLot_ReturnSlot()
    {
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertEquals(0,parkingLot.assignLot(new Attendant("2")));
    }
}
