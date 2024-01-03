import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class ParkingLotTest {
    /* UC - 1, given car park it and return true  */
    @Test
    public void givenCar_ParkTheCar_ReturnTrue(){
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertEquals(true,parkingLot.parkCar("1"));
    }
    @Test
    /* UC - 2, unpark car */
    public void givenParkNumber_RemoveCar_ReturnTrue(){
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertEquals(true,parkingLot.parkCar("123"));
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
        parkingLot.parkCar("2");
        parkingLot.parkCar("3");
        parkingLot.parkCar("4");
        parkingLot.parkCar("5");
        Assert.assertFalse(parkingLot.notifyFull());
        parkingLot.removeCar("2");
        Assert.assertTrue(parkingLot.notifyFull());
    }
    @Test
    /*UC 6 - assign attendant*/
    public void givenCar_AssignAttendant_ParkCar()
    {
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertTrue(parkingLot.parkCar("6",new Attendant("1")));
    }
    /*UC 7 - find car*/
    @Test
    public void givenCarNumber_FindCar_ReturnLot()
    {
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertEquals(3,parkingLot.findCar("3"));
    }
}
